package model;

import SQLite.DB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DataBase {

    /**
     * Insert a client into the Client table of the database.
     * @param clientData Properties associated with the client.
     * @param clientID ID of the client.
     */
    public static void insertClient(HashMap<String, String> clientData, String clientID) {
        // Grab client data for new or existing client in the table.
        String firstName = clientData.get("FIRST NAME");
        String lastName = clientData.get("LAST NAME");
        int last4SS = clientData.containsKey("LAST4SS")
                ? Integer.parseInt(clientData.get("LAST4SS"))
                : Integer.parseInt(clientData.get("LAST 4"));

        // Not all CSVs contain the DoB of a client.
        String dob = "";
        if (clientData.containsKey("DOB") || clientData.containsKey("DATE OF BIRTH")) {
            dob = clientData.containsKey("DOB")
                    ? clientData.get("DOB")
                    : clientData.get("DATE OF BIRTH");
        }
        // Get the row where the clientID exists in the Client table (if it does exist).
        try (ResultSet query = DB.executeQuery(String.format("SELECT * FROM Client WHERE ID = '%s';", clientID))) {
            // If the client already exists, update the necessary fields.
            if (query.next()){
                // Reset pointer of the ResultSet (somewhat redundant since there should only be one or no elements
                // but a good habit nonetheless).
                query.beforeFirst();

                // Update the fields.
                ClientDAO.updateFirstName(clientID, firstName);
                ClientDAO.updateLastName(clientID, lastName);
                ClientDAO.updateLast4SS(clientID, String.valueOf(last4SS));
                ClientDAO.updateDOB(clientID, dob);
            }else {
                // Create an update SQL command to insert a new row into the Client table.
                String sqlStmt = String.format("INSERT INTO Client (ID, FirstName, LastName, DoB, Last4SS) \n" +
                        "VALUES ('%1$s', '%2$s', '%3$s', '%4$s', %5$d);", clientID, firstName, lastName, dob, last4SS);
                try {
                    // Execute the SQL statement.
                    DB.update(sqlStmt);
                } catch (Exception e) {
                    System.out.print("Error occurred while UPDATE Operation: " + e);
                    throw e;
                }
            }
        }catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }

    public static void insertDemographic(HashMap<String, String> clientData, String clientID){
        // Grab demographic data for new or existing demographic in the demographic table.
        // Not guaranteed that each field is in clientData, so must instantiate variables.
        String taxYear = "";
        String address = "";
        String zip = "";
        String county = "";
        String state = "";
        if (clientData.containsKey("CREATEDDATETIME")){
            // Only want the year created.
            taxYear = clientData.get("CREATEDDATETIME").substring(0,3);
        }
        if (clientData.containsKey("ADDRESS")){
            address = clientData.get("ADDRESS");
        }
        if (clientData.containsKey("ZIP")){
            zip = clientData.get("ZIP");
        }
        if (clientData.containsKey("COUNTY")){
            county = clientData.get("COUNTY");
        }
        if (clientData.containsKey("STATE")){
            state = clientData.get("STATE");
        }
        try (ResultSet query = DB.executeQuery(String.format("SELECT * FROM Demographic WHERE ID = '%s';", clientID))) {
            // If the demographic already exists, update the necessary fields.
            if (query.next()){
                // Reset pointer of the ResultSet (somewhat redundant since there should only be one or no elements
                // but a good habit nonetheless).
                query.beforeFirst();

                // Update the fields. Since field in table could have existing data, do not want to
                // overwrite with a null value.
                if (!taxYear.equals("")){
                    DemographicDAO.updateTaxYear(clientID, taxYear);
                }
                if (!address.equals("")){
                    DemographicDAO.updateAddress(clientID, address);
                }
                if (!zip.equals("")){
                    DemographicDAO.updateZip(clientID, zip);
                }
                if (!county.equals("")){
                    DemographicDAO.updateCounty(clientID, county);
                }
                if (!state.equals("")){
                    DemographicDAO.updateState(clientID, state);
                }
            }else {
                // Create an update SQL command to insert a new row into the Client table.
                String sqlStmt = String.format("INSERT INTO Demographic (ID, TaxYear, Address, Zip, County, State) \n" +
                        "VALUES ('%1$s', '%2$s', '%3$s', '%4$s', %5$s, %6$s);", clientID, taxYear, address, zip, county, state);
                try {
                    // Execute the SQL statement.
                    DB.update(sqlStmt);
                } catch (Exception e) {
                    System.out.print("Error occurred while UPDATE Operation: " + e);
                    throw e;
                }
            }
        }catch (Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }


    /**
     * Translates a result set into an ObservableList of Data Objects
     * @param rs
     * @param demographic
     * @param returnData
     * @param client
     * @return
     * @throws SQLException
     */
    private static ObservableList<DataObject> getDataObjectList(ResultSet rs, boolean demographic, boolean returnData, boolean client) throws SQLException{
        ObservableList<DataObject> dataObjectList = FXCollections.observableArrayList();
        while(rs.next()){
            DataObject dataObject = new DataObject();
            if(demographic) {
                dataObject.setClient_ID(rs.getString("Client_ID"));
                dataObject.setTaxYear(rs.getInt("TaxYear"));
                dataObject.setAddress(rs.getString("Address"));
                dataObject.setCounty(rs.getString("County"));
                dataObject.setZip(rs.getInt("Zip"));
                dataObject.setState(rs.getString("State"));
            }
            if(returnData){
                dataObject.setFederalReturn(rs.getInt("FederalReturn"));
                dataObject.setTotalRefund(rs.getInt("TotalRefund"));
                dataObject.setEITC(rs.getInt("EITC"));
                dataObject.setCTC(rs.getInt("CTC"));
                dataObject.setDependents(rs.getInt("Dependents"));
                dataObject.setSurveyScore(rs.getInt("SurveyScore"));
            }
            if(client){
                dataObject.setFirstName(rs.getString("FirstName"));
                dataObject.setLastName(rs.getString("LastName"));
                dataObject.setDoB(rs.getString("DoB"));
                dataObject.setLast4SS(rs.getInt("Last4SS"));
            }
            //This may not be a good way to set TaxYear
            //
            if(demographic || returnData || !client){
                dataObject.setTaxYear(rs.getInt("TaxYear"));
            }
            dataObjectList.add(dataObject);
        }
        return dataObjectList;

    }

    /**
     * runs an SQL query selecting data from the Client table with a given condition
     * @param condition the condition of the WHERE clause of the SQL statement
     * @return the results of the SQL query as an ObservableList
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static ObservableList<DataObject> searchClients(String condition) throws SQLException, ClassNotFoundException {
        String selectStmt = "SELECT * FROM Client" + condition;
        System.out.println(selectStmt);
        try {
            ResultSet rsClients = DB.executeQuery(selectStmt);
            ObservableList<DataObject> clientList = getDataObjectList(rsClients, false, false, true);
            return clientList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchDemographics(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Demographic " + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> demographicList = getDataObjectList(rsDemographics, true, false, false);
            return demographicList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchReturnData(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM ReturnData " + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> demographicList = getDataObjectList(rsDemographics, false, true, false);
            return demographicList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchDemographicsAndReturnData(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Demographic INNER JOIN ReturnData ON Demographic.TaxYear = ReturnData.TaxYear AND Demographic.Client_ID = ReturnData.Client_ID" + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> demographicList = getDataObjectList(rsDemographics, true, true, false);
            return demographicList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchDemographicsAndClients(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Demographic INNER JOIN Client ON Demographic.Client_ID = Client.ID" + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> demographicList = getDataObjectList(rsDemographics, true, false, true);
            return demographicList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchReturnDataAndClients(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM ReturnData INNER JOIN Client ON ReturnData.Client_ID = Client.ID" + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> returnDataClientList = getDataObjectList(rsDemographics, false, true, true);
            return returnDataClientList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchDemographicsAndReturnDataAndClients(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Demographic INNER JOIN ReturnData ON Demographic.TaxYear = ReturnData.TaxYear AND Demographic.Client_ID = ReturnData.Client_ID INNER JOIN Client ON Demographic.Client_ID = Client.ID" + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsDemographics = DB.executeQuery(selectStmt);
            ObservableList<DataObject> demographicList = getDataObjectList(rsDemographics, true, true, true);
            return demographicList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    public static ObservableList<DataObject> searchTaxYears(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM TaxYear" + condition;
        System.out.println(selectStmt);
        try {
            ResultSet rsClients = DB.executeQuery(selectStmt);
            ObservableList<DataObject> taxYearList = getDataObjectList(rsClients, false, false, false);
            return taxYearList;
        } catch (SQLException e) {
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }


}

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Demographic Database Access Object class. <br/>
 * Methods that facilitate the interactions between the database
 * and objects of the Demographic class.
 */
public class DemographicDAO {
    /**
     * Searches for a Demographic by ID.
     * @param Client_ID String, ID of the Demographic.
     * @return Demographic with corresponding ID.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     * @throws ClassNotFoundException Demographic class unable to be found.
     */
    public static Demographic searchDemographic(String Client_ID, String TaxYear) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * From Demographic WHERE Client_ID = " + Client_ID + " AND WERE Year = " ;

        try{
            ResultSet rs = DB.executeQuery(selectStmt);
            Demographic dem = getDemographicFromResultSet(rs);

            return dem;
        }catch(Exception e){
            System.out.println("Error while searching for " + Client_ID + " : " + e);
            throw e;
        }
    }

    /**
     * Get Demographic from result set after search query.
     * @param rs ResultSet, contains results from a search query.
     * @return Demographic object
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static Demographic getDemographicFromResultSet(ResultSet rs) throws SQLException{
        Demographic dem = null;
        if(rs.next()){
            dem = new Demographic();
            dem.setID(rs.getString("Client_ID"));
            dem.setTaxYearID(rs.getInt("TaxYear"));
            dem.setAddress(rs.getString("Address"));
            dem.setCounty(rs.getString("County"));
            dem.setZip(rs.getInt("Zip"));
            dem.setState(rs.getString("State"));
        }
        return dem;
    }

    /**
     * Gets the list of demographics from a ResultSet.
     * @param rs ResultSet containing Demographics from a search query.
     * @return ObservableList of Demographics.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static ObservableList<Demographic> getDemographicList(ResultSet rs) throws SQLException{
        ObservableList<Demographic> demographicList = FXCollections.observableArrayList();

        while(rs.next()){
            Demographic dem = new Demographic();
            dem.setID(rs.getString("Client_ID"));
            dem.setTaxYearID(rs.getInt("TaxYear"));
            dem.setAddress(rs.getString("Address"));
            dem.setCounty(rs.getString("County"));
            dem.setZip(rs.getInt("Zip"));
            dem.setState(rs.getString("State"));
            demographicList.add(dem);
        }
        return demographicList;
    }

    /**
     * Update Address of a Demographic.
     * @param demographicID String, the ID of the Demographic.
     * @param Address String, address that the old address will be changed to.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static void updateAddress(String demographicID, String Address) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE Demographic\n" +
                        "       SET Address = '" + Address + "'\n" +
                        "    WHERE ID = " + demographicID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }
}

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;


/**
 * Client Database Access Object class. <br/>
 * Methods that facilitate the interactions between the database
 * and objects of the Client class.
 */
public class ClientDAO {



    public static final String[] columnNames = {"FirstName", "LastName", "DoB", "Last4SS"};

    /**
     * Searches for a Client by ID.
     * @param ID String, ID of the Client.
     * @return Client with corresponding ID.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     * @throws ClassNotFoundException Client class unable to be found.
     */
    public static Client searchClient(String ID) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * From Client WHERE ID = " + ID;

        try{
            ResultSet rs = DB.executeQuery(selectStmt);
            return getClientFromResultSet(rs);
        }catch(Exception e){
            System.out.println("Error while searching for " + ID + " : " + e);
            throw e;
        }
    }

    /**
     * Get Client from result set after search query.
     * @param rs ResultSet, contains results from a search query.
     * @return Client object.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static Client getClientFromResultSet(ResultSet rs) throws SQLException{
        Client client = null;
        if(rs.next()){
            client = new Client();
            client.setID(rs.getString("ID"));
            client.setFirstName(rs.getString("FirstName"));
            client.setLastName(rs.getString("LastName"));
            client.setDoB(rs.getString("DoB"));
            client.setLast4SS(rs.getInt("Last4SS"));
        }
        return client;
    }

    public static ObservableList<DataObject> searchAllClients() throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Client";

        try{
            ResultSet rsClients = DB.executeQuery(selectStmt);
            ObservableList<DataObject> clientList = getClientList(rsClients);
            return clientList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }
    public static ObservableList<DataObject> searchClients(String condition) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * FROM Client" + condition;
        System.out.println(selectStmt);
        try{
            ResultSet rsClients = DB.executeQuery(selectStmt);
            ObservableList<DataObject> clientList = getClientList(rsClients);
            return clientList;
        }catch(SQLException e){
            System.out.println("SQL select operation has failed:" + e);
            throw e;
        }
    }

    /**
     * Gets the list of clients from a ResultSet.
     * @param rs ResultSet containing Clients from a search query.
     * @return ObservableList of Clients.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static ObservableList<DataObject> getClientList(ResultSet rs) throws SQLException{
        ObservableList<DataObject> clientList = FXCollections.observableArrayList();

        while(rs.next()){
            DataObject client = new DataObject();
            client.setClient_ID(rs.getString("ID"));
            client.setFirstName(rs.getString("FirstName"));
            client.setLastName(rs.getString("LastName"));
            client.setDoB(rs.getString("DoB"));
            client.setLast4SS(rs.getInt("Last4SS"));
            clientList.add(client);
        }
        return clientList;
    }

    /**
     * Update first name of a Client.
     * @param clientID String, the ID of the Client.
     * @param FirstName String, name that the first name will be changed to.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    public static void updateFirstName(String clientID, String FirstName) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE Client\n" +
                        "       SET FirstName = '" + FirstName + "'\n" +
                        "    WHERE ID = " + clientID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    public static void updateLastName(String clientID, String lastName) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE Client\n" +
                        "       SET LastName = '" + lastName + "'\n" +
                        "    WHERE ID = " + clientID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    public static void updateDOB(String clientID, String dob) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE Client\n" +
                        "       SET DoB = '" + dob + "'\n" +
                        "    WHERE ID = " + clientID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

    public static void updateLast4SS(String clientID, String last4SS) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE Client\n" +
                        "       SET FirstName = '" + last4SS + "'\n" +
                        "    WHERE ID = " + clientID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }

}

package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ClientDAO {
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
    private static Client getClientFromResultSet(ResultSet rs) throws SQLException{
        Client client = null;
        if(rs.next()){
            client = new Client();
            client.setID(rs.getInt("ID"));
            client.setFirstName(rs.getString("FirstName"));
            client.setLastName(rs.getString("LastName"));
            client.setDoB(rs.getString("DoB"));
            client.setLast4SS(rs.getInt("Last4SS"));
        }
        return client;
    }
    private static ObservableList<Client> getClientList(ResultSet rs) throws SQLException{
        ObservableList<Client> clientList = FXCollections.observableArrayList();

        while(rs.next()){
            Client client = new Client();
            client.setID(rs.getInt("ID"));
            client.setFirstName(rs.getString("FirstName"));
            client.setLastName(rs.getString("LastName"));
            client.setDoB(rs.getString("DoB"));
            client.setLast4SS(rs.getInt("Last4SS"));
            clientList.add(client);
        }
        return clientList;
    }
    private static void updateFirstName(String clientID, String FirstName) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE employees\n" +
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
}

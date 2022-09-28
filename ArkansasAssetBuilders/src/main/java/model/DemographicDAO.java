package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemographicDAO {
    public static Demographic searchDemographic(String ID) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * From Demographic WHERE ID = " + ID;

        try{
            ResultSet rs = DB.executeQuery(selectStmt);
            Demographic dem = getDemographicFromResultSet(rs);

            return dem;
        }catch(Exception e){
            System.out.println("Error while searching for " + ID + " : " + e);
            throw e;
        }
    }
    private static Demographic getDemographicFromResultSet(ResultSet rs) throws SQLException{
        Demographic dem = null;
        if(rs.next()){
            dem = new Demographic();
            dem.setID(rs.getInt("ID"));
            dem.setTaxYearID(rs.getInt("TaxYearID"));
            dem.setAddress(rs.getString("Address"));
            dem.setCounty(rs.getString("County"));
            dem.setZip(rs.getInt("Zip"));
            dem.setState(rs.getString("State"));
        }
        return dem;
    }
    private static ObservableList<Demographic> getDemographicList(ResultSet rs) throws SQLException{
        ObservableList<Demographic> demographicList = FXCollections.observableArrayList();

        while(rs.next()){
            Demographic dem = new Demographic();
            dem.setID(rs.getInt("ID"));
            dem.setTaxYearID(rs.getInt("TaxYearID"));
            dem.setAddress(rs.getString("Address"));
            dem.setCounty(rs.getString("County"));
            dem.setZip(rs.getInt("Zip"));
            dem.setState(rs.getString("State"));
            demographicList.add(dem);
        }
        return demographicList;
    }
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

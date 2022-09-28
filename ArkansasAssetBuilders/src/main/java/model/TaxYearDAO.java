package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TaxYearDAO {
    public static TaxYear searchTaxYear(String ID) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * From TaxYear WHERE ID = " + ID;

        try{
            ResultSet rs = DB.executeQuery(selectStmt);
            TaxYear ty = getTaxYearFromResultSet(rs);

            return ty;
        }catch(Exception e){
            System.out.println("Error while searching for " + ID + " : " + e);
            throw e;
        }
    }
    private static TaxYear getTaxYearFromResultSet(ResultSet rs) throws SQLException{
        TaxYear ty = null;
        if(rs.next()){
            ty = new TaxYear();
            ty.setID(rs.getInt("ID"));
            ty.setTaxYearID(rs.getInt("TaxYearID"));
        }
        return ty;
    }
    private static ObservableList<TaxYear> getTaxYearList(ResultSet rs) throws SQLException{
        ObservableList<TaxYear> taxYearList = FXCollections.observableArrayList();

        while(rs.next()){
            TaxYear ty = new TaxYear();
            ty.setID(rs.getInt("ID"));
            ty.setTaxYearID(rs.getInt("TaxYearID"));
            taxYearList.add(ty);
        }
        return taxYearList;
    }
    private static void updateDependents(String taxYearID, String TaxYearID) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE TaxYear\n" +
                        "       SET TaxYearID = '" + TaxYearID + "'\n" +
                        "    WHERE ID = " + taxYearID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }
}

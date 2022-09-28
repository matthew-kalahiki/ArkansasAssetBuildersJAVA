package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ReturnDataDAO {
    public static ReturnData searchReturnData(String ID) throws SQLException, ClassNotFoundException{
        String selectStmt = "SELECT * From ReturnData WHERE ID = " + ID;

        try{
            ResultSet rs = DB.executeQuery(selectStmt);
            ReturnData rd = getReturnDataFromResultSet(rs);

            return rd;
        }catch(Exception e){
            System.out.println("Error while searching for " + ID + " : " + e);
            throw e;
        }
    }
    private static ReturnData getReturnDataFromResultSet(ResultSet rs) throws SQLException{
        ReturnData rd = null;
        if(rs.next()){
            rd = new ReturnData();
            rd.setID(rs.getInt("ID"));
            rd.setTaxYearID(rs.getInt("TaxYearID"));
            rd.setFederalReturn(rs.getInt("FederalReturn"));
            rd.setTotalRefund(rs.getInt("TotalRefund"));
            rd.setEITC(rs.getInt("EITC"));
            rd.setCTC(rs.getInt("CTC"));
            rd.setDependents(rs.getInt("Dependents"));
            rd.setSurveyScore(rs.getInt("SurveyScore"));
        }
        return rd;
    }
    private static ObservableList<ReturnData> getReturnDataList(ResultSet rs) throws SQLException{
        ObservableList<ReturnData> returnDataList = FXCollections.observableArrayList();

        while(rs.next()){
            ReturnData rd = new ReturnData();
            rd.setID(rs.getInt("ID"));
            rd.setTaxYearID(rs.getInt("TaxYearID"));
            rd.setFederalReturn(rs.getInt("FederalReturn"));
            rd.setTotalRefund(rs.getInt("TotalRefund"));
            rd.setEITC(rs.getInt("EITC"));
            rd.setCTC(rs.getInt("CTC"));
            rd.setDependents(rs.getInt("Dependents"));
            rd.setSurveyScore(rs.getInt("SurveyScore"));
            returnDataList.add(rd);
        }
        return returnDataList;
    }
    private static void updateDependents(String returnDataID, String Dependents) throws SQLException{
        String updateStmt =
                "Begin\n" +
                        "   UPDATE ReturnData\n" +
                        "       SET Dependents = '" + Dependents + "'\n" +
                        "    WHERE ID = " + returnDataID + ";\n" +
                        "END;";
        try{
            DB.update(updateStmt);
        }catch(Exception e){
            System.out.print("Error occurred while UPDATE Operation: " + e);
            throw e;
        }
    }
}

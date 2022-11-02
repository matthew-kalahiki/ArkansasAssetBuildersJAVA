package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import SQLite.DB;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TaxYear Database Access Object class. <br/>
 * Methods that facilitate the interactions between the database
 * and objects of the TaxYear class.
 */
public class TaxYearDAO {
    /**
     * Searches for a TaxYear by ID.
     * @param ID String, ID of the TaxYear.
     * @return TaxYear with corresponding ID.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     * @throws ClassNotFoundException TaxYear class unable to be found.
     */
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

    /**
     * Get TaxYear from result set after search query.
     * @param rs ResultSet, contains results from a search query.
     * @return TaxYear object.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static TaxYear getTaxYearFromResultSet(ResultSet rs) throws SQLException{
        TaxYear ty = null;
        if(rs.next()){
            ty = new TaxYear();
            ty.setTaxYear(rs.getInt("TaxYearID"));
        }
        return ty;
    }

    /**
     * Gets the list of TaxYear objects from a ResultSet.
     * @param rs ResultSet containing TaxYear objects from a search query.
     * @return ObservableList of TaxYear objects.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
    private static ObservableList<TaxYear> getTaxYearList(ResultSet rs) throws SQLException{
        ObservableList<TaxYear> taxYearList = FXCollections.observableArrayList();

        while(rs.next()){
            TaxYear ty = new TaxYear();
            ty.setTaxYear(rs.getInt("TaxYearID"));
            taxYearList.add(ty);
        }
        return taxYearList;
    }

    /**
     * Update tax year of a TaxYear object.
     * @param taxYearID String, the ID of the TaxYear objects.
     * @param TaxYearID String, year that the tax year will be changed to.
     * @throws SQLException Unable to retrieve data, loss of connection, or other errors.
     */
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

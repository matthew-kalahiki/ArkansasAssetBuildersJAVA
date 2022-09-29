package model;

import javafx.beans.property.*;

/**
 * TaxYear class
 * <br/>
 * <br/>
 * Tax year data from inputted tax information.
 * Tax year information is stored in the local database.
 */
public class TaxYear {
    private IntegerProperty ID;
    private IntegerProperty TaxYearID;

    /**
     * Constructor for the TaxYear class.
     */
    public TaxYear(){
        this.ID = new SimpleIntegerProperty();
        this.TaxYearID = new SimpleIntegerProperty();
    }

    /**
     * Method for getting the ID of the TaxYear object.
     * @return int, ID of the TaxYear object.
     */
    public int getID(){
        return ID.get();
    }

    /**
     * Method for setting the ID of the TaxYear object.
     * @param ID int, the ID that the old ID will be set to.
     */
    public void setID(int ID){
        this.ID.set(ID);
    }

    /**
     * Method for retrieving TaxYear ID from the database in an
     * IntegerProperty format.<br/>
     * @return IntegerProperty, the ID of the TaxYear.
     */
    public IntegerProperty IDProperty(){
        return ID;
    }

    /**
     * Method for getting the tax year ID of the TaxYear object.
     * @return int, tax year ID of the TaxYear object.
     */
    public int getTaxYearID(){
        return TaxYearID.get();
    }

    /**
     * Method for setting the tax year ID of the TaxYear object.
     * @param TaxYearID int, the tax year ID that the old tax year
     *                  ID will be set to.
     */
    public void setTaxYearID(int TaxYearID){
        this.TaxYearID.set(TaxYearID);
    }

    /**
     * Method for retrieving TaxYear tax year ID from the database in an
     * IntegerProperty format.<br/>
     * @return IntegerProperty, the tax year ID of the TaxYear.
     */
    public IntegerProperty taxYearIDProperty(){
        return TaxYearID;
    }


}

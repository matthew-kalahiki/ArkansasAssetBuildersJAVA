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
    private IntegerProperty TaxYear;

    /**
     * Constructor for the TaxYear class.
     */
    public TaxYear(){
        this.TaxYear = new SimpleIntegerProperty();
    }

    /**
     * Method for getting the tax year ID of the TaxYear object.
     * @return int, tax year ID of the TaxYear object.
     */
    public int getTaxYear(){
        return TaxYear.get();
    }

    /**
     * Method for setting the tax year ID of the TaxYear object.
     * @param TaxYear int, the tax year ID that the old tax year
     *                  ID will be set to.
     */
    public void setTaxYear(int TaxYear){
        this.TaxYear.set(TaxYear);
    }

    /**
     * Method for retrieving TaxYear tax year ID from the database in an
     * IntegerProperty format.<br/>
     * @return IntegerProperty, the tax year ID of the TaxYear.
     */
    public IntegerProperty taxYearProperty(){
        return TaxYear;
    }


}

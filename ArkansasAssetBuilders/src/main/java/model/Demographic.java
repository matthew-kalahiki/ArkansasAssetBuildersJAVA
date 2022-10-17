package model;

import javafx.beans.property.*;

/**
 * Demographic class
 * <br/>
 * <br/>
 * Demographic information from inputted tax information.
 * Demographic information is stored in the local database.
 */
public class Demographic {
    private StringProperty Client_ID;
    private IntegerProperty TaxYear;
    private StringProperty Address;
    private IntegerProperty Zip;
    private StringProperty County;
    private StringProperty State;

    /**
     * Constructor for the Demographic class.
     */
    public Demographic(){
        this.Client_ID = new SimpleStringProperty();
        this.TaxYear = new SimpleIntegerProperty();
        this.Address = new SimpleStringProperty();
        this.Zip = new SimpleIntegerProperty();
        this.County = new SimpleStringProperty();
        this.State = new SimpleStringProperty();
    }

    /**
     * Method for getting the ID of the Demographic object.
     * @return int, ID of the Demographic.
     */
    public String getClient_ID(){
        return Client_ID.get();
    }

    /**
     * Set the ID of the Demographic object.
     * @param Client_ID int, ID that the Demographic object will be set to.
     */
    public void setID(String Client_ID){
        this.Client_ID.set(Client_ID);
    }

    /**
     * Method for retrieving Demographic ID from the database in an
     * IntegerProperty format.<br/>
     * @return IntegerProperty, the ID of the Demographic.
     */
    public StringProperty Client_IDProperty(){
        return Client_ID;
    }

    /**
     * Method for getting the tax year ID of the Demographic object.
     * @return int, tax year ID of the Demographic.
     */
    public int getTaxYearID(){
        return TaxYear.get();
    }

    /**
     * Method for setting the tax year ID of the Demographic object.
     * @param TaxYearID, int, ID that the tax year ID will be set to.
     */
    public void setTaxYearID(int TaxYearID){
        this.TaxYear.set(TaxYearID);
    }

    /**
     * Method for retrieving Demographic tax year ID from the database
     * in an IntegerProperty format.<br/>
     * @return IntegerProperty, the tax year ID of the Demographic.
     */
    public IntegerProperty taxYearIDProperty(){
        return TaxYear;
    }

    /**
     * Method for getting the address of the Demographic object.
     * @return String, the Address of the Demographic.
     */
    public String getAddress(){
        return Address.get();
    }

    /**
     * Method for setting the address of the Demographic.
     * @param Address String, the new address that the Address will be set to.
     */
    public void setAddress(String Address){
        this.Address.set(Address);
    }

    /**
     * Method for retrieving Demographic address from the database
     * in a StringProperty format.<br/>
     * @return StringProperty, the Address of the Demographic.
     */
    public StringProperty addressProperty(){
        return Address;
    }

    /**
     * Method for getting the zip code of the Demographic.
     * @return int, zip code of the Demographic.
     */
    public int getZip(){
        return Zip.get();
    }

    /**
     * Method for setting the zip code of the Demographic object.
     * @param Zip int, new zip code that will replace the old zip code.
     */
    public void setZip(int Zip){
        this.Zip.set(Zip);
    }

    /**
     * Method for retrieving Demographic zip code from the database
     * in an IntegerProperty format.<br/>
     * @return IntegerProperty, the zip code of the Demographic.
     */
    public IntegerProperty zipProperty(){
        return Zip;
    }

    /**
     * Method for getting the county of the Demographic object.
     * @return String, county of the Demographic object.
     */
    public String getCounty(){
        return County.get();
    }

    /**
     * Method for setting the county of the Demographic object.
     * @param County String, the new county that will replace the old county.
     */
    public void setCounty(String County){
        this.County.set(County);
    }

    /**
     * Method for retrieving Demographic county from the database
     * in a StringProperty format.<br/>
     * @return StringProperty, the county of the Demographic.
     */
    public StringProperty countyProperty(){
        return County;
    }

    /**
     * Method for getting the State of the Demographic object.
     * @return String, the state of the Demographic object.
     */
    public String getState(){
        return State.get();
    }

    /**
     * Method for setting the state of a Demographic object.
     * @param State String, the new state that will replace the old state.
     */
    public void setState(String State){
        this.State.set(State);
    }

    /**
     * Method for retrieving Demographic State from the database
     * in a StringProperty format.<br/>
     * @return StringProperty, the State of the Demographic.
     */
    public StringProperty stateProperty(){
        return State;
    }
}

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
    private StringProperty Address;
    private IntegerProperty Zip;
    private StringProperty County;
    private StringProperty State;
    private Client client;
    private ReturnData returnData;
    private TaxYear taxYear;

    /**
     * Constructor for the Demographic class.
     */
    public Demographic(){
        this.Address = new SimpleStringProperty();
        this.Zip = new SimpleIntegerProperty();
        this.County = new SimpleStringProperty();
        this.State = new SimpleStringProperty();
        this.client = new Client();
        this.returnData = new ReturnData();
        this.taxYear = new TaxYear();
    }

    /**
     * Method for getting the ID of the Demographic object.
     * @return int, ID of the Demographic.
     */
    public String getClient_ID(){
        return client.getID();
    }

    /**
     * Set the ID of the Demographic object.
     * @param Client_ID int, ID that the Demographic object will be set to.
     */
    public void setClient_ID(String Client_ID){
        client.setID(Client_ID);
    }

    /**
     * Method for retrieving Demographic ID from the database in an
     * IntegerProperty format.<br/>
     * @return IntegerProperty, the ID of the Demographic.
     */
    public StringProperty Client_IDProperty(){
        return client.Client_IDProperty();
    }

    /**
     * Method for getting the tax year ID of the Demographic object.
     * @return int, tax year ID of the Demographic.
     */
    public int getTaxYear(){
        return taxYear.getTaxYear();
    }

    /**
     * Method for setting the tax year ID of the Demographic object.
     * @param TaxYear, int, ID that the tax year ID will be set to.
     */
    public void setTaxYear(int TaxYear){
        taxYear.setTaxYear(TaxYear);
    }

    /**
     * Method for retrieving Demographic tax year ID from the database
     * in an IntegerProperty format.<br/>
     * @return IntegerProperty, the tax year ID of the Demographic.
     */
    public IntegerProperty taxYearProperty(){
        return taxYear.taxYearProperty();
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

    public String getFirstName(){return client.getFirstName();}

    public void setFirstName(String FirstName){client.setFirstName(FirstName);}

    public StringProperty firstNameProperty(){return client.firstNameProperty();}

    public String getLastName(){return client.getLastName();}

    public void setLastName(String LastName){client.setLastName(LastName);}

    public StringProperty lastNameProperty(){return client.lastNameProperty();}

    public String getDoB(){return client.getDoB();}

    public void setDoB(String DoB){client.setDoB(DoB);}

    public StringProperty doBProperty(){return client.doBProperty();}

    public int getLast4SS(){return client.getLast4SS();}

    public void setLast4SS(int Last4SS){client.setLast4SS(Last4SS);}

    public IntegerProperty last4SSProperty(){return client.last4SSProperty();}

    public int getFederalReturn(){return returnData.getFederalReturn();}

    public void setFederalReturn(int FederalReturn){returnData.setFederalReturn(FederalReturn);}

    public IntegerProperty federalReturnProperty(){return returnData.federalReturnProperty();}

    public int getTotalRefund(){return returnData.getTotalRefund();}

    public void setTotalRefund(int TotalRefund){returnData.setTotalRefund(TotalRefund);}

    public IntegerProperty totalRefundProperty(){return returnData.totalRefundProperty();}

    public int getEITC(){return returnData.getEITC();}

    public void setEITC(int EITC){returnData.setEITC(EITC);}

    public IntegerProperty EITCProperty(){return returnData.EITCProperty();}

    public int getCTC(){return returnData.getCTC();}

    public void setCTC(int CTC){returnData.setCTC(CTC);}

    public IntegerProperty CTCProperty(){return returnData.CTCProperty();}

    public int getDependents(){return returnData.getDependents();}

    public void setDependents(int Dependents){returnData.setDependents(Dependents);}

    public IntegerProperty dependentsProperty(){return returnData.dependentsProperty();}

    public int getSurveyScore(){return returnData.getSurveyScore();}

    public void setSurveyScore(int SurveyScore){returnData.setSurveyScore(SurveyScore);}

    public IntegerProperty surveyScoreProperty(){return returnData.surveyScoreProperty();}

}

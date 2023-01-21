package model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;

public class DataObject {
    private Client client;
    private Demographic demographic;
    private ReturnData returnData;
    private TaxYear taxYear;

    public DataObject(){
        client = new Client();
        demographic = new Demographic();
        returnData = new ReturnData();
        taxYear = new TaxYear();
    }

    public String getClient_ID(){
        return client.getId();
    }
    public void setClient_ID(String Client_ID){
        client.setId(Client_ID);
    }
    public StringProperty Client_IDProperty(){
        return client.IdProperty();
    }
    public int getTaxYear(){
        return taxYear.getTaxYear();
    }

    public void setTaxYear(int TaxYear){
        taxYear.setTaxYear(TaxYear);
    }

    public IntegerProperty taxYearProperty(){
        return taxYear.TaxYearProperty();
    }


    public String getZip(){return demographic.getZip();}

    public void setZip(String Zip){demographic.setZip(Zip);}

    public StringProperty zipProperty(){
        return demographic.ZipProperty();
    }


    public String getState(){
        return demographic.getState();
    }

    public void setState(String State){
        demographic.setState(State);
    }

    public StringProperty stateProperty(){
        return demographic.StateProperty();
    }

    public String getFirstName(){return client.getFirstName();}

    public void setFirstName(String FirstName){client.setFirstName(FirstName);}

    public StringProperty firstNameProperty(){return client.FirstNameProperty();}

    public String getLastName(){return client.getLastName();}

    public void setLastName(String LastName){client.setLastName(LastName);}

    public StringProperty lastNameProperty(){return client.LastNameProperty();}

    public String getDoB(){return client.getDoB();}

    public void setDoB(String DoB){client.setDoB(DoB);}

    public StringProperty doBProperty(){return client.DoBProperty();}

    public String getLast4SS(){return client.getL4SSN();}

    public void setLast4SS(String Last4SS){client.setL4SSN(Last4SS);}

    public StringProperty last4SSProperty(){return client. L4SSNProperty();}

    public boolean getFederalReturn(){return returnData.getFederal();}

    public void setFederalReturn(boolean FederalReturn){
        returnData.setFederal(FederalReturn);}

    public BooleanProperty federalReturnProperty(){return returnData.FederalProperty();}

    public double getTotalRefund(){return returnData.getRefund();}

    public void setTotalRefund(int TotalRefund){
        returnData.setRefund(TotalRefund);}

    public DoubleProperty totalRefundProperty(){return returnData.RefundProperty();}

    public double getEITC(){return returnData.getEic();}

    public void setEITC(int EITC){
        returnData.setEic(EITC);}

    public DoubleProperty EITCProperty(){return returnData.EicProperty();}

    public double getCTC(){return returnData.getAddCTC();}

    public void setCTC(int CTC){
        returnData.setAddCTC(CTC);}

    public DoubleProperty CTCProperty(){return returnData.AddCTCProperty();}

}

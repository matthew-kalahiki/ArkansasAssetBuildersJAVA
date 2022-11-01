package model;

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
        return client.getID();
    }
    public void setClient_ID(String Client_ID){
        client.setID(Client_ID);
    }
    public StringProperty Client_IDProperty(){
        return client.Client_IDProperty();
    }
    public int getTaxYear(){
        return taxYear.getTaxYear();
    }

    public void setTaxYear(int TaxYear){
        taxYear.setTaxYear(TaxYear);
    }

    public IntegerProperty taxYearProperty(){
        return taxYear.taxYearProperty();
    }

    public String getAddress(){
        return demographic.getAddress();
    }

    public void setAddress(String Address){demographic.setAddress(Address);}

    public StringProperty addressProperty(){return demographic.addressProperty();}

    public int getZip(){return demographic.getZip();}

    public void setZip(int Zip){demographic.setZip(Zip);}

    public IntegerProperty zipProperty(){
        return demographic.zipProperty();
    }

    public String getCounty(){return demographic.getCounty();}

    public void setCounty(String County){
        demographic.setCounty(County);
    }

    public StringProperty countyProperty(){
        return demographic.countyProperty();
    }

    public String getState(){
        return demographic.getState();
    }

    public void setState(String State){
        demographic.setState(State);
    }

    public StringProperty stateProperty(){
        return demographic.stateProperty();
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

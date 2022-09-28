package model;

import javafx.beans.property.*;

public class ReturnData {
    private IntegerProperty ID;
    private IntegerProperty TaxYearID;
    private IntegerProperty FederalReturn;
    private IntegerProperty TotalRefund;
    private IntegerProperty EITC;
    private IntegerProperty CTC;
    private IntegerProperty Dependents;
    private IntegerProperty SurveyScore;

    public ReturnData(){
        this.ID = new SimpleIntegerProperty();
        this.TaxYearID = new SimpleIntegerProperty();
        this.FederalReturn = new SimpleIntegerProperty();
        this.TotalRefund = new SimpleIntegerProperty();
        this.EITC = new SimpleIntegerProperty();
        this.CTC = new SimpleIntegerProperty();
        this.Dependents = new SimpleIntegerProperty();
        this.SurveyScore = new SimpleIntegerProperty();
    }

    public int getID(){
        return ID.get();
    }
    public void setID(int ID){
        this.ID.set(ID);
    }
    public IntegerProperty IDProperty(){
        return ID;
    }

    public int getTaxYearID(){
        return TaxYearID.get();
    }
    public void setTaxYearID(int TaxYearID){
        this.TaxYearID.set(TaxYearID);
    }
    public IntegerProperty taxYearIDProperty(){
        return TaxYearID;
    }

    public int getFederalReturn(){
        return FederalReturn.get();
    }
    public void setFederalReturn(int FederalReturn){
        this.FederalReturn.set(FederalReturn);
    }
    public IntegerProperty federalReturnProperty(){
        return FederalReturn;
    }

    public int getTotalRefund(){
        return TotalRefund.get();
    }
    public void setTotalRefund(int TotalRefund){
        this.TotalRefund.set(TotalRefund);
    }
    public IntegerProperty totalRefundProperty(){
        return TotalRefund;
    }

    public int getEITC(){
        return EITC.get();
    }
    public void setEITC(int EITC){
        this.EITC.set(EITC);
    }
    public IntegerProperty EITCProperty(){
        return EITC;
    }

    public int getCTC(){
        return CTC.get();
    }
    public void setCTC(int CTC){
        this.CTC.set(CTC);
    }
    public IntegerProperty CTCProperty(){
        return CTC;
    }

    public int getDependents(){
        return Dependents.get();
    }
    public void setDependents(int Dependents){
        this.Dependents.set(Dependents);
    }
    public IntegerProperty dependentsProperty(){
        return Dependents;
    }

    public int getSurveyScore(){
        return SurveyScore.get();
    }
    public void setSurveyScore(int SurveyScore){
        this.SurveyScore.set(SurveyScore);
    }
    public IntegerProperty surveyScoreProperty(){
        return SurveyScore;
    }


}

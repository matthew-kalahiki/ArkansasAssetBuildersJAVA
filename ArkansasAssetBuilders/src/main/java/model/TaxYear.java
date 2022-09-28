package model;

import javafx.beans.property.*;

public class TaxYear {
    private IntegerProperty ID;
    private IntegerProperty TaxYearID;

    public TaxYear(){
        this.ID = new SimpleIntegerProperty();
        this.TaxYearID = new SimpleIntegerProperty();
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


}

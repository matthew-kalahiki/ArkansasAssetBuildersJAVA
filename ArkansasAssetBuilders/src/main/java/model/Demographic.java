package model;

import javafx.beans.property.*;

public class Demographic {
    private IntegerProperty ID;
    private IntegerProperty TaxYearID;
    private StringProperty Address;
    private IntegerProperty Zip;
    private StringProperty County;
    private StringProperty State;

    public Demographic(){
        this.ID = new SimpleIntegerProperty();
        this.TaxYearID = new SimpleIntegerProperty();
        this.Address = new SimpleStringProperty();
        this.Zip = new SimpleIntegerProperty();
        this.County = new SimpleStringProperty();
        this.State = new SimpleStringProperty();
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

    public String getAddress(){
        return Address.get();
    }
    public void setAddress(String Address){
        this.Address.set(Address);
    }
    public StringProperty addressProperty(){
        return Address;
    }

    public int getZip(){
        return Zip.get();
    }
    public void setZip(int Zip){
        this.Zip.set(Zip);
    }
    public IntegerProperty zipProperty(){
        return Zip;
    }

    public String getCounty(){
        return County.get();
    }
    public void setCounty(String County){
        this.County.set(County);
    }
    public StringProperty countyProperty(){
        return County;
    }

    public String getState(){
        return State.get();
    }
    public void setState(String State){
        this.State.set(State);
    }
    public StringProperty stateProperty(){
        return State;
    }
}

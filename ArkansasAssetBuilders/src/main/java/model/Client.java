package model;

import javafx.beans.property.*;

public class Client {
    private IntegerProperty ID;
    private StringProperty FirstName;
    private StringProperty LastName;
    private StringProperty DoB;
    private IntegerProperty Last4SS;

    public Client(){
        this.ID = new SimpleIntegerProperty();
        this.FirstName = new SimpleStringProperty();
        this.LastName = new SimpleStringProperty();
        this.DoB = new SimpleStringProperty();
        this.Last4SS = new SimpleIntegerProperty();
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

    public String getFirstName(){
        return FirstName.get();
    }
    public void setFirstName(String FirstName){
        this.FirstName.set(FirstName);
    }
    public StringProperty firstNameProperty(){
        return FirstName;
    }

    public String getLastName(){
        return LastName.get();
    }
    public void setLastName(String LastName){
        this.LastName.set(LastName);
    }
    public StringProperty lastNameProperty(){
        return LastName;
    }

    public String getDoB(){
        return DoB.get();
    }
    public void setDoB(String DoB){
        this.DoB.set(DoB);
    }
    public StringProperty doBProperty(){
        return DoB;
    }

    public int getLast4SS(){
        return Last4SS.get();
    }
    public void setLast4SS(int Last4SS){
        this.Last4SS.set(Last4SS);
    }
    public IntegerProperty last4SSProperty(){
        return Last4SS;
    }
}

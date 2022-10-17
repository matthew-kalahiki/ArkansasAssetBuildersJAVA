package model;

import javafx.beans.property.*;

/**
 * Client class
 * <br/>
 * <br/>
 * Client that utilizes Arkansas Asset Builder's Services.
 * Client information is stored in the local database.
 */
public class Client {
    private StringProperty ID;
    private StringProperty FirstName;
    private StringProperty LastName;
    private StringProperty DoB;
    private IntegerProperty Last4SS;

    /**
     * Constructor for Client class.
     */
    public Client(){
        this.ID = new SimpleStringProperty();
        this.FirstName = new SimpleStringProperty();
        this.LastName = new SimpleStringProperty();
        this.DoB = new SimpleStringProperty();
        this.Last4SS = new SimpleIntegerProperty();
    }

    /**
     * Method for retrieving Client ID from the database.<br/>
     * @return int, the ID of the Client.
     */
    public String getID(){
        return ID.get();
    }

    /**
     * Method for setting Client ID in the database<br/>
     * @param ID int, The ID that the Client ID will be set to.
     */
    public void setID(String ID){
        this.ID.set(ID);
    }

    /**
     * Method for retrieving Client ID from the database in a IntegerProperty format.<br/>
     * @return IntegerProperty, the ID of the Client.
     */
    public StringProperty IDProperty(){
        return ID;
    }

    /**
     * Method for retrieving Client first name from the database.<br/>
     * @return String, the first name of the Client.
     */
    public String getFirstName(){
        return FirstName.get();
    }

    /**
     * Method for setting Client first name in the database<br/>
     * @param FirstName String, The name that the Client first name will be set to.
     */
    public void setFirstName(String FirstName){
        this.FirstName.set(FirstName);
    }

    /**
     * Method for retrieving Client first name from the database in a StringProperty format.<br/>
     * @return StringProperty, the first name of the Client.
     */
    public StringProperty firstNameProperty(){
        return FirstName;
    }

    /**
     * Method for retrieving Client last name from the database.<br/>
     * @return String, the last name of the Client.
     */
    public String getLastName(){
        return LastName.get();
    }

    /**
     * Method for setting Client last name in the database<br/>
     * @param LastName String, The name that the Client last name will be set to.
     */
    public void setLastName(String LastName){
        this.LastName.set(LastName);
    }

    /**
     * Method for retrieving Client last name from the database in a StringProperty format.<br/>
     * @return StringProperty, the last name of the Client.
     */
    public StringProperty lastNameProperty(){
        return LastName;
    }

    /**
     * Method for retrieving Client date of birth from the database.<br/>
     * @return String, the date of birth of the Client.
     */
    public String getDoB(){
        return DoB.get();
    }

    /**
     * Method for setting Client date of birth in the database<br/>
     * @param DoB String, The date that the Client date of birth will be set to.
     */
    public void setDoB(String DoB){
        this.DoB.set(DoB);
    }

    /**
     * Method for retrieving Client date of birth from the database in a StringProperty format.<br/>
     * @return StringProperty, the date of birth of the Client.
     */
    public StringProperty doBProperty(){
        return DoB;
    }

    /**
     * Method for retrieving Client last four SS numbers from the database.<br/>
     * @return int, the last four SS numbers of the Client.
     */
    public int getLast4SS(){
        return Last4SS.get();
    }

    /**
     * Method for setting Client last four SS numbers in the database<br/>
     * @param Last4SS int, The number that the Client last four SS numbers will be set to.
     */
    public void setLast4SS(int Last4SS){
        this.Last4SS.set(Last4SS);
    }

    /**
     * Method for retrieving Client last four SS numbers from the database in a IntegerProperty format.<br/>
     * @return IntegerProperty, the last four SS numbers of the Client.
     */
    public IntegerProperty last4SSProperty(){
        return Last4SS;
    }
}

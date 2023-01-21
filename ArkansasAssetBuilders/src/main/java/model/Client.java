package model;
import javafx.beans.property.*;
public class Client {
	private StringProperty id;
	private StringProperty sidn;
	private StringProperty L4SSN;
	private StringProperty firstName;
	private StringProperty lastName;
	private StringProperty dob;
	private StringProperty efin;
	public Client(){
		this.id = new SimpleStringProperty();
		this.sidn = new SimpleStringProperty();
		this.L4SSN = new SimpleStringProperty();
		this.firstName = new SimpleStringProperty();
		this.lastName = new SimpleStringProperty();
		this.dob = new SimpleStringProperty();
		this.efin = new SimpleStringProperty();
	}
	public String getId(){ return id.get();}

	public void setId(String id){this.id.set(id);}

	public StringProperty IdProperty(){return id;}

	public String getSidn(){ return sidn.get();}

	public void setSidn(String sidn){this.sidn.set(sidn);}

	public StringProperty SidnProperty(){return sidn;}


	public String getL4SSN(){ return L4SSN.get();}

	public void setL4SSN(String L4SSN){this.L4SSN.set(L4SSN);}

	public StringProperty L4SSNProperty(){return L4SSN;}

	public String getFirstName(){ return firstName.get();}

	public void setFirstName(String firstName){this.firstName.set(firstName);}

	public StringProperty FirstNameProperty(){return firstName;}

	public String getLastName(){ return lastName.get();}

	public void setLastName(String lastName){this.lastName.set(lastName);}

	public StringProperty LastNameProperty(){return lastName;}


	public String getDoB(){ return dob.get();}

	public void setDoB(String dob){this.dob.set(dob);}

	public StringProperty DoBProperty(){return dob;}


	public String getEfin(){ return efin.get();}

	public void setEfin(String efin){this.efin.set(efin);}

	public StringProperty EfinProperty(){return efin;}


}

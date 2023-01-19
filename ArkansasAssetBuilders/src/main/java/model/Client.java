package model;
import javafx.beans.property.*;
public class Client {
	private StringProperty id;
	private StringProperty sidn;
	private StringProperty L4SSN;
	private StringProperty first_name;
	private StringProperty last_name;
	private StringProperty DoB;
	private StringProperty efin;
	public Client(){
		this.id = new SimpleStringProperty();
		this.sidn = new SimpleStringProperty();
		this.L4SSN = new SimpleStringProperty();
		this.first_name = new SimpleStringProperty();
		this.last_name = new SimpleStringProperty();
		this.DoB = new SimpleStringProperty();
		this.efin = new SimpleStringProperty();
	}
	public String getId(){ return id.get();}

	public void setId(String id){this.id.set(id);}

	public StringProperty IdProperty(){return c;}

	public String getSidn(){ return sidn.get();}

	public void setSidn(String sidn){this.sidn.set(sidn);}

	public StringProperty SidnProperty(){return c;}


	public String getL4SSN(){ return L4SSN.get();}

	public void setL4SSN(String L4SSN){this.L4SSN.set(L4SSN);}

	public StringProperty L4SSNProperty(){return c;}


	public String getFirst(){ return first_name.get();}

	public void setFirst(String first_name){this.first_name.set(first_name);}

	public StringProperty FirstProperty(){return c;}


	public String getFirstName(){ return first_name.get();}

	public void setFirstName(String first_name){this.first_name.set(first_name);}

	public StringProperty FirstNameProperty(){return c;}


	public String getLast(){ return last_name.get();}

	public void setLast(String last_name){this.last_name.set(last_name);}

	public StringProperty LastProperty(){return c;}


	public String getLastName(){ return last_name.get();}

	public void setLastName(String last_name){this.last_name.set(last_name);}

	public StringProperty LastNameProperty(){return c;}


	public String getDoB(){ return DoB.get();}

	public void setDoB(String DoB){this.DoB.set(DoB);}

	public StringProperty DoBProperty(){return c;}


	public String getEfin(){ return efin.get();}

	public void setEfin(String efin){this.efin.set(efin);}

	public StringProperty EfinProperty(){return c;}


}

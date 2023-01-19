package model;
import javafx.beans.property.*;
public class demographic{
	private StringProperty client_id;
	private DoubleProperty tax_year;
	private StringProperty city;
	private StringProperty state;
	private StringProperty zip;
	private StringProperty state;
	private DoubleProperty primary_secondary_60_plus;
	private StringProperty residency;
	public demographic(){
		this.client_id = new SimpleStringProperty();
		this.tax_year = new SimpleDoubleProperty();
		this.city = new SimpleStringProperty();
		this.state = new SimpleStringProperty();
		this.zip = new SimpleStringProperty();
		this.state = new SimpleStringProperty();
		this.primary_secondary_60_plus = new SimpleDoubleProperty();
		this.residency = new SimpleStringProperty();
	}
	public String getClient(){return client_id.get();}

	public void setClient(String client_id){this.client_id.set(client_id);}

	public StringProperty ClientProperty(){return client_id;}


	public String getClientId(){return client_id.get();}

	public void setClientId(String client_id){this.client_id.set(client_id);}

	public StringProperty ClientIdProperty(){return client_id;}


	public double getTax(){return tax_year.get();}

	public void setTax(double tax_year){this.tax_year.set(tax_year);}

	public DoubleProperty TaxProperty(){return tax_year;}


	public double getTaxYear(){return tax_year.get();}

	public void setTaxYear(double tax_year){this.tax_year.set(tax_year);}

	public DoubleProperty TaxYearProperty(){return tax_year;}


	public String getCity(){return city.get();}

	public void setCity(String city){this.city.set(city);}

	public StringProperty CityProperty(){return city;}


	public String getState(){return state.get();}

	public void setState(String state){this.state.set(state);}

	public StringProperty StateProperty(){return state;}


	public String getZip(){return zip.get();}

	public void setZip(String zip){this.zip.set(zip);}

	public StringProperty ZipProperty(){return zip;}


	public String getState(){return state.get();}

	public void setState(String state){this.state.set(state);}

	public StringProperty StateProperty(){return state;}


	public double getPrimary(){return primary_secondary_60_plus.get();}

	public void setPrimary(double primary_secondary_60_plus){this.primary_secondary_60_plus.set(primary_secondary_60_plus);}

	public DoubleProperty PrimaryProperty(){return primary_secondary_60_plus;}


	public double getPrimarySecondary(){return primary_secondary_60_plus.get();}

	public void setPrimarySecondary(double primary_secondary_60_plus){this.primary_secondary_60_plus.set(primary_secondary_60_plus);}

	public DoubleProperty PrimarySecondaryProperty(){return primary_secondary_60_plus;}


	public double getPrimarySecondary60(){return primary_secondary_60_plus.get();}

	public void setPrimarySecondary60(double primary_secondary_60_plus){this.primary_secondary_60_plus.set(primary_secondary_60_plus);}

	public DoubleProperty PrimarySecondary60Property(){return primary_secondary_60_plus;}


	public double getPrimarySecondary60Plus(){return primary_secondary_60_plus.get();}

	public void setPrimarySecondary60Plus(double primary_secondary_60_plus){this.primary_secondary_60_plus.set(primary_secondary_60_plus);}

	public DoubleProperty PrimarySecondary60PlusProperty(){return primary_secondary_60_plus;}


	public String getResidency(){return residency.get();}

	public void setResidency(String residency){this.residency.set(residency);}

	public StringProperty ResidencyProperty(){return residency;}


}

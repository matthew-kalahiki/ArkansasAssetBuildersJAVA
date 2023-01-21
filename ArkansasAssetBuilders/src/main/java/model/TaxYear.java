package model;
import javafx.beans.property.*;
public class TaxYear {
	private IntegerProperty tax_year;
	public TaxYear(){
		this.tax_year = new SimpleIntegerProperty();
	}
	public int getTaxYear(){return tax_year.get();}

	public void setTaxYear(int tax_year){this.tax_year.set(tax_year);}

	public IntegerProperty TaxYearProperty(){return tax_year;}


}

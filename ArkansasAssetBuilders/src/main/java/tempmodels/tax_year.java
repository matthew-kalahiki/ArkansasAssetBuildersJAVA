package model;
import javafx.beans.property.*;
public class tax_year{
	private DoubleProperty tax_year;
	public tax_year(){
		this.tax_year = new SimpleDoubleProperty();
	}
	public double getTax(){return tax_year.get();}

	public void setTax(double tax_year){this.tax_year.set(tax_year);}

	public DoubleProperty TaxProperty(){return tax_year;}


	public double getTaxYear(){return tax_year.get();}

	public void setTaxYear(double tax_year){this.tax_year.set(tax_year);}

	public DoubleProperty TaxYearProperty(){return tax_year;}


}

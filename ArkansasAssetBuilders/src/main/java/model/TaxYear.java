package model;
import javafx.beans.property.*;
public class TaxYear{
	private DoubleProperty taxYear;
	public TaxYear(){
		this.taxYear = new SimpleDoubleProperty();
	}
	public double getTaxYear(){return taxYear.get();}

	public void setTaxYear(double taxYear){this.taxYear.set(taxYear);}

	public DoubleProperty taxYearProperty(){return taxYear;}


}

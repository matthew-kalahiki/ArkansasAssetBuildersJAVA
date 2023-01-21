package model;
import javafx.beans.property.*;
public class ReturnData {
	private StringProperty client_id;
	private DoubleProperty tax_year;
	private BooleanProperty federal;
	private StringProperty accepted_data;
	private StringProperty return_type;
	private StringProperty filing_status;
	private DoubleProperty total_irs_exemptions;
	private DoubleProperty refund;
	private BooleanProperty paper_state;
	private BooleanProperty paper_fed;
	private BooleanProperty requesting_dd;
	private DoubleProperty agi;
	private StringProperty created_date;
	private DoubleProperty addctc;
	private StringProperty pound_savings_bonds;
	private StringProperty savings_bonds;
	private DoubleProperty eic;
	private DoubleProperty child_tax_credit;
	private DoubleProperty education_tax_credit;
	private DoubleProperty elderly_credit;
	private DoubleProperty total_resp_payment;
	private DoubleProperty total_advptc_repayment;
	private DoubleProperty average_advptc_payment;
	private DoubleProperty total_ptc;
	private DoubleProperty balance_due;
	private BooleanProperty itin;
	private BooleanProperty exemption_7;
	private BooleanProperty full_year_coverage;
	private BooleanProperty form8888;
	private BooleanProperty schedule_a;
	private BooleanProperty schedule_b;
	private BooleanProperty schedule_c;
	private BooleanProperty schedule_c_ez;
	private BooleanProperty schedule_d;
	private BooleanProperty schedule_e;
	private BooleanProperty schedule_f;
	private BooleanProperty schedule_h;
	private BooleanProperty schedule_r;
	private BooleanProperty schedule_set_p;
	private BooleanProperty schedule_ses_p;
	private StringProperty agency_id;
	private DoubleProperty state_withholding;
	private DoubleProperty state_tax_liability;
	private DoubleProperty a_amount_taxpayer_is_planning_to_save;
	public ReturnData(){
		this.client_id = new SimpleStringProperty();
		this.tax_year = new SimpleDoubleProperty();
		this.federal = new SimpleBooleanProperty();
		this.accepted_data = new SimpleStringProperty();
		this.return_type = new SimpleStringProperty();
		this.filing_status = new SimpleStringProperty();
		this.total_irs_exemptions = new SimpleDoubleProperty();
		this.refund = new SimpleDoubleProperty();
		this.paper_state = new SimpleBooleanProperty();
		this.paper_fed = new SimpleBooleanProperty();
		this.requesting_dd = new SimpleBooleanProperty();
		this.agi = new SimpleDoubleProperty();
		this.created_date = new SimpleStringProperty();
		this.addctc = new SimpleDoubleProperty();
		this.pound_savings_bonds = new SimpleStringProperty();
		this.savings_bonds = new SimpleStringProperty();
		this.eic = new SimpleDoubleProperty();
		this.child_tax_credit = new SimpleDoubleProperty();
		this.education_tax_credit = new SimpleDoubleProperty();
		this.elderly_credit = new SimpleDoubleProperty();
		this.total_resp_payment = new SimpleDoubleProperty();
		this.total_advptc_repayment = new SimpleDoubleProperty();
		this.average_advptc_payment = new SimpleDoubleProperty();
		this.total_ptc = new SimpleDoubleProperty();
		this.balance_due = new SimpleDoubleProperty();
		this.itin = new SimpleBooleanProperty();
		this.exemption_7 = new SimpleBooleanProperty();
		this.full_year_coverage = new SimpleBooleanProperty();
		this.form8888 = new SimpleBooleanProperty();
		this.schedule_a = new SimpleBooleanProperty();
		this.schedule_b = new SimpleBooleanProperty();
		this.schedule_c = new SimpleBooleanProperty();
		this.schedule_c_ez = new SimpleBooleanProperty();
		this.schedule_d = new SimpleBooleanProperty();
		this.schedule_e = new SimpleBooleanProperty();
		this.schedule_f = new SimpleBooleanProperty();
		this.schedule_h = new SimpleBooleanProperty();
		this.schedule_r = new SimpleBooleanProperty();
		this.schedule_set_p = new SimpleBooleanProperty();
		this.schedule_ses_p = new SimpleBooleanProperty();
		this.agency_id = new SimpleStringProperty();
		this.state_withholding = new SimpleDoubleProperty();
		this.state_tax_liability = new SimpleDoubleProperty();
		this.a_amount_taxpayer_is_planning_to_save = new SimpleDoubleProperty();
	}

	public String getClientId(){return client_id.get();}

	public void setClientId(String client_id){this.client_id.set(client_id);}

	public StringProperty ClientIdProperty(){return client_id;}


	public double getTaxYear(){return tax_year.get();}

	public void setTaxYear(double tax_year){this.tax_year.set(tax_year);}

	public DoubleProperty TaxYearProperty(){return tax_year;}


	public boolean getFederal(){return federal.get();}

	public void setFederal(boolean federal){this.federal.set(federal);}

	public BooleanProperty FederalProperty(){return federal;}


	public String getAcceptedData(){return accepted_data.get();}

	public void setAcceptedData(String accepted_data){this.accepted_data.set(accepted_data);}

	public StringProperty AcceptedDataProperty(){return accepted_data;}

	public String getReturnType(){return return_type.get();}

	public void setReturnType(String return_type){this.return_type.set(return_type);}

	public StringProperty ReturnTypeProperty(){return return_type;}


	public String getFilingStatus(){return filing_status.get();}

	public void setFilingStatus(String filing_status){this.filing_status.set(filing_status);}

	public StringProperty FilingStatusProperty(){return filing_status;}

	public double getTotalIrsExemptions(){return total_irs_exemptions.get();}

	public void setTotalIrsExemptions(double total_irs_exemptions){this.total_irs_exemptions.set(total_irs_exemptions);}

	public DoubleProperty TotalIrsExemptionsProperty(){return total_irs_exemptions;}


	public double getRefund(){return refund.get();}

	public void setRefund(double refund){this.refund.set(refund);}

	public DoubleProperty RefundProperty(){return refund;}

	public boolean getPaperState(){return paper_state.get();}

	public void setPaperState(boolean paper_state){this.paper_state.set(paper_state);}

	public BooleanProperty PaperStateProperty(){return paper_state;}


	public boolean getPaperFed(){return paper_fed.get();}

	public void setPaperFed(boolean paper_fed){this.paper_fed.set(paper_fed);}

	public BooleanProperty PaperFedProperty(){return paper_fed;}


	public boolean getRequestingDd(){return requesting_dd.get();}

	public void setRequestingDd(boolean requesting_dd){this.requesting_dd.set(requesting_dd);}

	public BooleanProperty RequestingDdProperty(){return requesting_dd;}


	public double getAgi(){return agi.get();}

	public void setAgi(double agi){this.agi.set(agi);}

	public DoubleProperty AgiProperty(){return agi;}

	public String getCreatedDate(){return created_date.get();}

	public void setCreatedDate(String created_date){this.created_date.set(created_date);}

	public StringProperty CreatedDateProperty(){return created_date;}


	public double getAddCTC(){return addctc.get();}

	public void setAddCTC(double addctc){this.addctc.set(addctc);}

	public DoubleProperty AddCTCProperty(){return addctc;}

	public String getPoundSavingsBonds(){return pound_savings_bonds.get();}

	public void setPoundSavingsBonds(String pound_savings_bonds){this.pound_savings_bonds.set(pound_savings_bonds);}

	public StringProperty PoundSavingsBondsProperty(){return pound_savings_bonds;}

	public String getSavingsBonds(){return savings_bonds.get();}

	public void setSavingsBonds(String savings_bonds){this.savings_bonds.set(savings_bonds);}

	public StringProperty SavingsBondsProperty(){return savings_bonds;}


	public double getEic(){return eic.get();}

	public void setEic(double eic){this.eic.set(eic);}

	public DoubleProperty EicProperty(){return eic;}


	public double getChildTaxCredit(){return child_tax_credit.get();}

	public void setChildTaxCredit(double child_tax_credit){this.child_tax_credit.set(child_tax_credit);}

	public DoubleProperty ChildTaxCreditProperty(){return child_tax_credit;}

	public double getEducationTaxCredit(){return education_tax_credit.get();}

	public void setEducationTaxCredit(double education_tax_credit){this.education_tax_credit.set(education_tax_credit);}

	public DoubleProperty EducationTaxCreditProperty(){return education_tax_credit;}

	public double getElderlyCredit(){return elderly_credit.get();}

	public void setElderlyCredit(double elderly_credit){this.elderly_credit.set(elderly_credit);}

	public DoubleProperty ElderlyCreditProperty(){return elderly_credit;}

	public double getTotalRespPayment(){return total_resp_payment.get();}

	public void setTotalRespPayment(double total_resp_payment){this.total_resp_payment.set(total_resp_payment);}

	public DoubleProperty TotalRespPaymentProperty(){return total_resp_payment;}


	public double getTotalAdvptcRepayment(){return total_advptc_repayment.get();}

	public void setTotalAdvptcRepayment(double total_advptc_repayment){this.total_advptc_repayment.set(total_advptc_repayment);}

	public DoubleProperty TotalAdvptcRepaymentProperty(){return total_advptc_repayment;}


	public double getAverageAdvptcPayment(){return average_advptc_payment.get();}

	public void setAverageAdvptcPayment(double average_advptc_payment){this.average_advptc_payment.set(average_advptc_payment);}

	public DoubleProperty AverageAdvptcPaymentProperty(){return average_advptc_payment;}


	public double getTotalPtc(){return total_ptc.get();}

	public void setTotalPtc(double total_ptc){this.total_ptc.set(total_ptc);}

	public DoubleProperty TotalPtcProperty(){return total_ptc;}

	public double getBalanceDue(){return balance_due.get();}

	public void setBalanceDue(double balance_due){this.balance_due.set(balance_due);}

	public DoubleProperty BalanceDueProperty(){return balance_due;}


	public boolean getItin(){return itin.get();}

	public void setItin(boolean itin){this.itin.set(itin);}

	public BooleanProperty ItinProperty(){return itin;}


	public boolean getExemption7(){return exemption_7.get();}

	public void setExemption7(boolean exemption_7){this.exemption_7.set(exemption_7);}

	public BooleanProperty Exemption7Property(){return exemption_7;}

	public boolean getFullYearCoverage(){return full_year_coverage.get();}

	public void setFullYearCoverage(boolean full_year_coverage){this.full_year_coverage.set(full_year_coverage);}

	public BooleanProperty FullYearCoverageProperty(){return full_year_coverage;}


	public boolean getForm8888(){return form8888.get();}

	public void setForm8888(boolean form8888){this.form8888.set(form8888);}

	public BooleanProperty Form8888Property(){return form8888;}


	public boolean getScheduleA(){return schedule_a.get();}

	public void setScheduleA(boolean schedule_a){this.schedule_a.set(schedule_a);}

	public BooleanProperty ScheduleAProperty(){return schedule_a;}

	public boolean getScheduleB(){return schedule_b.get();}

	public void setScheduleB(boolean schedule_b){this.schedule_b.set(schedule_b);}

	public BooleanProperty ScheduleBProperty(){return schedule_b;}


	public boolean getScheduleC(){return schedule_c.get();}

	public void setScheduleC(boolean schedule_c){this.schedule_c.set(schedule_c);}

	public BooleanProperty ScheduleCProperty(){return schedule_c;}


	public boolean getScheduleCEz(){return schedule_c_ez.get();}

	public void setScheduleCEz(boolean schedule_c_ez){this.schedule_c_ez.set(schedule_c_ez);}

	public BooleanProperty ScheduleCEzProperty(){return schedule_c_ez;}


	public boolean getScheduleD(){return schedule_d.get();}

	public void setScheduleD(boolean schedule_d){this.schedule_d.set(schedule_d);}

	public BooleanProperty ScheduleDProperty(){return schedule_d;}

	public boolean getScheduleE(){return schedule_e.get();}

	public void setScheduleE(boolean schedule_e){this.schedule_e.set(schedule_e);}

	public BooleanProperty ScheduleEProperty(){return schedule_e;}

	public boolean getScheduleF(){return schedule_f.get();}

	public void setScheduleF(boolean schedule_f){this.schedule_f.set(schedule_f);}

	public BooleanProperty ScheduleFProperty(){return schedule_f;}


	public boolean getScheduleH(){return schedule_h.get();}

	public void setScheduleH(boolean schedule_h){this.schedule_h.set(schedule_h);}

	public BooleanProperty ScheduleHProperty(){return schedule_h;}

	public boolean getScheduleR(){return schedule_r.get();}

	public void setScheduleR(boolean schedule_r){this.schedule_r.set(schedule_r);}

	public BooleanProperty ScheduleRProperty(){return schedule_r;}

	public boolean getScheduleSetP(){return schedule_set_p.get();}

	public void setScheduleSetP(boolean schedule_set_p){this.schedule_set_p.set(schedule_set_p);}

	public BooleanProperty ScheduleSetPProperty(){return schedule_set_p;}


	public boolean getScheduleSesP(){return schedule_ses_p.get();}

	public void setScheduleSesP(boolean schedule_ses_p){this.schedule_ses_p.set(schedule_ses_p);}

	public BooleanProperty ScheduleSesPProperty(){return schedule_ses_p;}


	public String getAgencyId(){return agency_id.get();}

	public void setAgencyId(String agency_id){this.agency_id.set(agency_id);}

	public StringProperty AgencyIdProperty(){return agency_id;}

	public double getStateWithholding(){return state_withholding.get();}

	public void setStateWithholding(double state_withholding){this.state_withholding.set(state_withholding);}

	public DoubleProperty StateWithholdingProperty(){return state_withholding;}

	public double getStateTaxLiability(){return state_tax_liability.get();}

	public void setStateTaxLiability(double state_tax_liability){this.state_tax_liability.set(state_tax_liability);}

	public DoubleProperty StateTaxLiabilityProperty(){return state_tax_liability;}

	public double getAAmountTaxpayerIsPlanningToSave(){return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayerIsPlanningToSave(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_save.set(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerIsPlanningToSaveProperty(){return a_amount_taxpayer_is_planning_to_save;}


}

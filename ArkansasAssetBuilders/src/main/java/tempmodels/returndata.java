package model;
import javafx.beans.property.*;
public class returndata{
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
	public returndata(){
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
	public String getClient(){ return client_id.get();}

	public void setClient(String client_id){this.client_idset(client_id);}

	public StringProperty ClientProperty(){return c;}


	public String getClientId(){ return client_id.get();}

	public void setClientId(String client_id){this.client_idset(client_id);}

	public StringProperty ClientIdProperty(){return c;}


	public double getTax(){ return tax_year.get();}

	public void setTax(double tax_year){this.tax_yearset(tax_year);}

	public DoubleProperty TaxProperty(){return c;}


	public double getTaxYear(){ return tax_year.get();}

	public void setTaxYear(double tax_year){this.tax_yearset(tax_year);}

	public DoubleProperty TaxYearProperty(){return c;}


	public bool getFederal(){ return federal.get();}

	public void setFederal(bool federal){this.federalset(federal);}

	public BooleanProperty FederalProperty(){return c;}


	public String getAccepted(){ return accepted_data.get();}

	public void setAccepted(String accepted_data){this.accepted_dataset(accepted_data);}

	public StringProperty AcceptedProperty(){return c;}


	public String getAcceptedData(){ return accepted_data.get();}

	public void setAcceptedData(String accepted_data){this.accepted_dataset(accepted_data);}

	public StringProperty AcceptedDataProperty(){return c;}


	public String getReturn(){ return return_type.get();}

	public void setReturn(String return_type){this.return_typeset(return_type);}

	public StringProperty ReturnProperty(){return c;}


	public String getReturnType(){ return return_type.get();}

	public void setReturnType(String return_type){this.return_typeset(return_type);}

	public StringProperty ReturnTypeProperty(){return c;}


	public String getFiling(){ return filing_status.get();}

	public void setFiling(String filing_status){this.filing_statusset(filing_status);}

	public StringProperty FilingProperty(){return c;}


	public String getFilingStatus(){ return filing_status.get();}

	public void setFilingStatus(String filing_status){this.filing_statusset(filing_status);}

	public StringProperty FilingStatusProperty(){return c;}


	public double getTotal(){ return total_irs_exemptions.get();}

	public void setTotal(double total_irs_exemptions){this.total_irs_exemptionsset(total_irs_exemptions);}

	public DoubleProperty TotalProperty(){return c;}


	public double getTotalIrs(){ return total_irs_exemptions.get();}

	public void setTotalIrs(double total_irs_exemptions){this.total_irs_exemptionsset(total_irs_exemptions);}

	public DoubleProperty TotalIrsProperty(){return c;}


	public double getTotalIrsExemptions(){ return total_irs_exemptions.get();}

	public void setTotalIrsExemptions(double total_irs_exemptions){this.total_irs_exemptionsset(total_irs_exemptions);}

	public DoubleProperty TotalIrsExemptionsProperty(){return c;}


	public double getRefund(){ return refund.get();}

	public void setRefund(double refund){this.refundset(refund);}

	public DoubleProperty RefundProperty(){return c;}


	public bool getPaper(){ return paper_state.get();}

	public void setPaper(bool paper_state){this.paper_stateset(paper_state);}

	public BooleanProperty PaperProperty(){return c;}


	public bool getPaperState(){ return paper_state.get();}

	public void setPaperState(bool paper_state){this.paper_stateset(paper_state);}

	public BooleanProperty PaperStateProperty(){return c;}


	public bool getPaper(){ return paper_fed.get();}

	public void setPaper(bool paper_fed){this.paper_fedset(paper_fed);}

	public BooleanProperty PaperProperty(){return c;}


	public bool getPaperFed(){ return paper_fed.get();}

	public void setPaperFed(bool paper_fed){this.paper_fedset(paper_fed);}

	public BooleanProperty PaperFedProperty(){return c;}


	public bool getRequesting(){ return requesting_dd.get();}

	public void setRequesting(bool requesting_dd){this.requesting_ddset(requesting_dd);}

	public BooleanProperty RequestingProperty(){return c;}


	public bool getRequestingDd(){ return requesting_dd.get();}

	public void setRequestingDd(bool requesting_dd){this.requesting_ddset(requesting_dd);}

	public BooleanProperty RequestingDdProperty(){return c;}


	public double getAgi(){ return agi.get();}

	public void setAgi(double agi){this.agiset(agi);}

	public DoubleProperty AgiProperty(){return c;}


	public String getCreated(){ return created_date.get();}

	public void setCreated(String created_date){this.created_dateset(created_date);}

	public StringProperty CreatedProperty(){return c;}


	public String getCreatedDate(){ return created_date.get();}

	public void setCreatedDate(String created_date){this.created_dateset(created_date);}

	public StringProperty CreatedDateProperty(){return c;}


	public double getAddctc(){ return addctc.get();}

	public void setAddctc(double addctc){this.addctcset(addctc);}

	public DoubleProperty AddctcProperty(){return c;}


	public String getPound(){ return pound_savings_bonds.get();}

	public void setPound(String pound_savings_bonds){this.pound_savings_bondsset(pound_savings_bonds);}

	public StringProperty PoundProperty(){return c;}


	public String getPoundSavings(){ return pound_savings_bonds.get();}

	public void setPoundSavings(String pound_savings_bonds){this.pound_savings_bondsset(pound_savings_bonds);}

	public StringProperty PoundSavingsProperty(){return c;}


	public String getPoundSavingsBonds(){ return pound_savings_bonds.get();}

	public void setPoundSavingsBonds(String pound_savings_bonds){this.pound_savings_bondsset(pound_savings_bonds);}

	public StringProperty PoundSavingsBondsProperty(){return c;}


	public String getSavings(){ return savings_bonds.get();}

	public void setSavings(String savings_bonds){this.savings_bondsset(savings_bonds);}

	public StringProperty SavingsProperty(){return c;}


	public String getSavingsBonds(){ return savings_bonds.get();}

	public void setSavingsBonds(String savings_bonds){this.savings_bondsset(savings_bonds);}

	public StringProperty SavingsBondsProperty(){return c;}


	public double getEic(){ return eic.get();}

	public void setEic(double eic){this.eicset(eic);}

	public DoubleProperty EicProperty(){return c;}


	public double getChild(){ return child_tax_credit.get();}

	public void setChild(double child_tax_credit){this.child_tax_creditset(child_tax_credit);}

	public DoubleProperty ChildProperty(){return c;}


	public double getChildTax(){ return child_tax_credit.get();}

	public void setChildTax(double child_tax_credit){this.child_tax_creditset(child_tax_credit);}

	public DoubleProperty ChildTaxProperty(){return c;}


	public double getChildTaxCredit(){ return child_tax_credit.get();}

	public void setChildTaxCredit(double child_tax_credit){this.child_tax_creditset(child_tax_credit);}

	public DoubleProperty ChildTaxCreditProperty(){return c;}


	public double getEducation(){ return education_tax_credit.get();}

	public void setEducation(double education_tax_credit){this.education_tax_creditset(education_tax_credit);}

	public DoubleProperty EducationProperty(){return c;}


	public double getEducationTax(){ return education_tax_credit.get();}

	public void setEducationTax(double education_tax_credit){this.education_tax_creditset(education_tax_credit);}

	public DoubleProperty EducationTaxProperty(){return c;}


	public double getEducationTaxCredit(){ return education_tax_credit.get();}

	public void setEducationTaxCredit(double education_tax_credit){this.education_tax_creditset(education_tax_credit);}

	public DoubleProperty EducationTaxCreditProperty(){return c;}


	public double getElderly(){ return elderly_credit.get();}

	public void setElderly(double elderly_credit){this.elderly_creditset(elderly_credit);}

	public DoubleProperty ElderlyProperty(){return c;}


	public double getElderlyCredit(){ return elderly_credit.get();}

	public void setElderlyCredit(double elderly_credit){this.elderly_creditset(elderly_credit);}

	public DoubleProperty ElderlyCreditProperty(){return c;}


	public double getTotal(){ return total_resp_payment.get();}

	public void setTotal(double total_resp_payment){this.total_resp_paymentset(total_resp_payment);}

	public DoubleProperty TotalProperty(){return c;}


	public double getTotalResp(){ return total_resp_payment.get();}

	public void setTotalResp(double total_resp_payment){this.total_resp_paymentset(total_resp_payment);}

	public DoubleProperty TotalRespProperty(){return c;}


	public double getTotalRespPayment(){ return total_resp_payment.get();}

	public void setTotalRespPayment(double total_resp_payment){this.total_resp_paymentset(total_resp_payment);}

	public DoubleProperty TotalRespPaymentProperty(){return c;}


	public double getTotal(){ return total_advptc_repayment.get();}

	public void setTotal(double total_advptc_repayment){this.total_advptc_repaymentset(total_advptc_repayment);}

	public DoubleProperty TotalProperty(){return c;}


	public double getTotalAdvptc(){ return total_advptc_repayment.get();}

	public void setTotalAdvptc(double total_advptc_repayment){this.total_advptc_repaymentset(total_advptc_repayment);}

	public DoubleProperty TotalAdvptcProperty(){return c;}


	public double getTotalAdvptcRepayment(){ return total_advptc_repayment.get();}

	public void setTotalAdvptcRepayment(double total_advptc_repayment){this.total_advptc_repaymentset(total_advptc_repayment);}

	public DoubleProperty TotalAdvptcRepaymentProperty(){return c;}


	public double getAverage(){ return average_advptc_payment.get();}

	public void setAverage(double average_advptc_payment){this.average_advptc_paymentset(average_advptc_payment);}

	public DoubleProperty AverageProperty(){return c;}


	public double getAverageAdvptc(){ return average_advptc_payment.get();}

	public void setAverageAdvptc(double average_advptc_payment){this.average_advptc_paymentset(average_advptc_payment);}

	public DoubleProperty AverageAdvptcProperty(){return c;}


	public double getAverageAdvptcPayment(){ return average_advptc_payment.get();}

	public void setAverageAdvptcPayment(double average_advptc_payment){this.average_advptc_paymentset(average_advptc_payment);}

	public DoubleProperty AverageAdvptcPaymentProperty(){return c;}


	public double getTotal(){ return total_ptc.get();}

	public void setTotal(double total_ptc){this.total_ptcset(total_ptc);}

	public DoubleProperty TotalProperty(){return c;}


	public double getTotalPtc(){ return total_ptc.get();}

	public void setTotalPtc(double total_ptc){this.total_ptcset(total_ptc);}

	public DoubleProperty TotalPtcProperty(){return c;}


	public double getBalance(){ return balance_due.get();}

	public void setBalance(double balance_due){this.balance_dueset(balance_due);}

	public DoubleProperty BalanceProperty(){return c;}


	public double getBalanceDue(){ return balance_due.get();}

	public void setBalanceDue(double balance_due){this.balance_dueset(balance_due);}

	public DoubleProperty BalanceDueProperty(){return c;}


	public bool getItin(){ return itin.get();}

	public void setItin(bool itin){this.itinset(itin);}

	public BooleanProperty ItinProperty(){return c;}


	public bool getExemption(){ return exemption_7.get();}

	public void setExemption(bool exemption_7){this.exemption_7set(exemption_7);}

	public BooleanProperty ExemptionProperty(){return c;}


	public bool getExemption7(){ return exemption_7.get();}

	public void setExemption7(bool exemption_7){this.exemption_7set(exemption_7);}

	public BooleanProperty Exemption7Property(){return c;}


	public bool getFull(){ return full_year_coverage.get();}

	public void setFull(bool full_year_coverage){this.full_year_coverageset(full_year_coverage);}

	public BooleanProperty FullProperty(){return c;}


	public bool getFullYear(){ return full_year_coverage.get();}

	public void setFullYear(bool full_year_coverage){this.full_year_coverageset(full_year_coverage);}

	public BooleanProperty FullYearProperty(){return c;}


	public bool getFullYearCoverage(){ return full_year_coverage.get();}

	public void setFullYearCoverage(bool full_year_coverage){this.full_year_coverageset(full_year_coverage);}

	public BooleanProperty FullYearCoverageProperty(){return c;}


	public bool getForm8888(){ return form8888.get();}

	public void setForm8888(bool form8888){this.form8888set(form8888);}

	public BooleanProperty Form8888Property(){return c;}


	public bool getSchedule(){ return schedule_a.get();}

	public void setSchedule(bool schedule_a){this.schedule_aset(schedule_a);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleA(){ return schedule_a.get();}

	public void setScheduleA(bool schedule_a){this.schedule_aset(schedule_a);}

	public BooleanProperty ScheduleAProperty(){return c;}


	public bool getSchedule(){ return schedule_b.get();}

	public void setSchedule(bool schedule_b){this.schedule_bset(schedule_b);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleB(){ return schedule_b.get();}

	public void setScheduleB(bool schedule_b){this.schedule_bset(schedule_b);}

	public BooleanProperty ScheduleBProperty(){return c;}


	public bool getSchedule(){ return schedule_c.get();}

	public void setSchedule(bool schedule_c){this.schedule_cset(schedule_c);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleC(){ return schedule_c.get();}

	public void setScheduleC(bool schedule_c){this.schedule_cset(schedule_c);}

	public BooleanProperty ScheduleCProperty(){return c;}


	public bool getSchedule(){ return schedule_c_ez.get();}

	public void setSchedule(bool schedule_c_ez){this.schedule_c_ezset(schedule_c_ez);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleC(){ return schedule_c_ez.get();}

	public void setScheduleC(bool schedule_c_ez){this.schedule_c_ezset(schedule_c_ez);}

	public BooleanProperty ScheduleCProperty(){return c;}


	public bool getScheduleCEz(){ return schedule_c_ez.get();}

	public void setScheduleCEz(bool schedule_c_ez){this.schedule_c_ezset(schedule_c_ez);}

	public BooleanProperty ScheduleCEzProperty(){return c;}


	public bool getSchedule(){ return schedule_d.get();}

	public void setSchedule(bool schedule_d){this.schedule_dset(schedule_d);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleD(){ return schedule_d.get();}

	public void setScheduleD(bool schedule_d){this.schedule_dset(schedule_d);}

	public BooleanProperty ScheduleDProperty(){return c;}


	public bool getSchedule(){ return schedule_e.get();}

	public void setSchedule(bool schedule_e){this.schedule_eset(schedule_e);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleE(){ return schedule_e.get();}

	public void setScheduleE(bool schedule_e){this.schedule_eset(schedule_e);}

	public BooleanProperty ScheduleEProperty(){return c;}


	public bool getSchedule(){ return schedule_f.get();}

	public void setSchedule(bool schedule_f){this.schedule_fset(schedule_f);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleF(){ return schedule_f.get();}

	public void setScheduleF(bool schedule_f){this.schedule_fset(schedule_f);}

	public BooleanProperty ScheduleFProperty(){return c;}


	public bool getSchedule(){ return schedule_h.get();}

	public void setSchedule(bool schedule_h){this.schedule_hset(schedule_h);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleH(){ return schedule_h.get();}

	public void setScheduleH(bool schedule_h){this.schedule_hset(schedule_h);}

	public BooleanProperty ScheduleHProperty(){return c;}


	public bool getSchedule(){ return schedule_r.get();}

	public void setSchedule(bool schedule_r){this.schedule_rset(schedule_r);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleR(){ return schedule_r.get();}

	public void setScheduleR(bool schedule_r){this.schedule_rset(schedule_r);}

	public BooleanProperty ScheduleRProperty(){return c;}


	public bool getSchedule(){ return schedule_set_p.get();}

	public void setSchedule(bool schedule_set_p){this.schedule_set_pset(schedule_set_p);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleSet(){ return schedule_set_p.get();}

	public void setScheduleSet(bool schedule_set_p){this.schedule_set_pset(schedule_set_p);}

	public BooleanProperty ScheduleSetProperty(){return c;}


	public bool getScheduleSetP(){ return schedule_set_p.get();}

	public void setScheduleSetP(bool schedule_set_p){this.schedule_set_pset(schedule_set_p);}

	public BooleanProperty ScheduleSetPProperty(){return c;}


	public bool getSchedule(){ return schedule_ses_p.get();}

	public void setSchedule(bool schedule_ses_p){this.schedule_ses_pset(schedule_ses_p);}

	public BooleanProperty ScheduleProperty(){return c;}


	public bool getScheduleSes(){ return schedule_ses_p.get();}

	public void setScheduleSes(bool schedule_ses_p){this.schedule_ses_pset(schedule_ses_p);}

	public BooleanProperty ScheduleSesProperty(){return c;}


	public bool getScheduleSesP(){ return schedule_ses_p.get();}

	public void setScheduleSesP(bool schedule_ses_p){this.schedule_ses_pset(schedule_ses_p);}

	public BooleanProperty ScheduleSesPProperty(){return c;}


	public String getAgency(){ return agency_id.get();}

	public void setAgency(String agency_id){this.agency_idset(agency_id);}

	public StringProperty AgencyProperty(){return c;}


	public String getAgencyId(){ return agency_id.get();}

	public void setAgencyId(String agency_id){this.agency_idset(agency_id);}

	public StringProperty AgencyIdProperty(){return c;}


	public double getState(){ return state_withholding.get();}

	public void setState(double state_withholding){this.state_withholdingset(state_withholding);}

	public DoubleProperty StateProperty(){return c;}


	public double getStateWithholding(){ return state_withholding.get();}

	public void setStateWithholding(double state_withholding){this.state_withholdingset(state_withholding);}

	public DoubleProperty StateWithholdingProperty(){return c;}


	public double getState(){ return state_tax_liability.get();}

	public void setState(double state_tax_liability){this.state_tax_liabilityset(state_tax_liability);}

	public DoubleProperty StateProperty(){return c;}


	public double getStateTax(){ return state_tax_liability.get();}

	public void setStateTax(double state_tax_liability){this.state_tax_liabilityset(state_tax_liability);}

	public DoubleProperty StateTaxProperty(){return c;}


	public double getStateTaxLiability(){ return state_tax_liability.get();}

	public void setStateTaxLiability(double state_tax_liability){this.state_tax_liabilityset(state_tax_liability);}

	public DoubleProperty StateTaxLiabilityProperty(){return c;}


	public double getA(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setA(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AProperty(){return c;}


	public double getAAmount(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmount(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountProperty(){return c;}


	public double getAAmountTaxpayer(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayer(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerProperty(){return c;}


	public double getAAmountTaxpayerIs(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayerIs(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerIsProperty(){return c;}


	public double getAAmountTaxpayerIsPlanning(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayerIsPlanning(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerIsPlanningProperty(){return c;}


	public double getAAmountTaxpayerIsPlanningTo(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayerIsPlanningTo(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerIsPlanningToProperty(){return c;}


	public double getAAmountTaxpayerIsPlanningToSave(){ return a_amount_taxpayer_is_planning_to_save.get();}

	public void setAAmountTaxpayerIsPlanningToSave(double a_amount_taxpayer_is_planning_to_save){this.a_amount_taxpayer_is_planning_to_saveset(a_amount_taxpayer_is_planning_to_save);}

	public DoubleProperty AAmountTaxpayerIsPlanningToSaveProperty(){return c;}


}

package model;
import javafx.beans.property.*;
public class question{
	private StringProperty client_id;
	private DoubleProperty tax_year;
	private BooleanProperty consent_to_disclose_tax_return;
	private BooleanProperty consent_to_disclose_taxpayer_d;
	private BooleanProperty consent_to_use_taxpayer_data;
	private BooleanProperty consent_to_disclose_tax_return_1;
	private BooleanProperty consent_to_disclose_tax_return_2;
	private BooleanProperty consent_to_disclose_tax_return_3;
	private BooleanProperty consent_to_disclose_tax_return_4;
	private StringProperty questions_1;
	private StringProperty questions_2;
	private StringProperty questions_3;
	private StringProperty questions_4;
	private StringProperty questions_5;
	private StringProperty questions_6;
	private StringProperty questions_7;
	private StringProperty questions_8;
	private StringProperty questions_9;
	private StringProperty question_a;
	private StringProperty question_b;
	private StringProperty question_c;
	private StringProperty question_d;
	private StringProperty question_e;
	private StringProperty question_f;
	private StringProperty question_g;
	private StringProperty question_h;
	private StringProperty question_i;
	private StringProperty question_j;
	private StringProperty question_k;
	private DoubleProperty persons_5_and_under;
	private DoubleProperty persons_age_6_to_18;
	private DoubleProperty persons_age_65_plus;
	public question(){
		this.client_id = new SimpleStringProperty();
		this.tax_year = new SimpleDoubleProperty();
		this.consent_to_disclose_tax_return = new SimpleBooleanProperty();
		this.consent_to_disclose_taxpayer_d = new SimpleBooleanProperty();
		this.consent_to_use_taxpayer_data = new SimpleBooleanProperty();
		this.consent_to_disclose_tax_return_1 = new SimpleBooleanProperty();
		this.consent_to_disclose_tax_return_2 = new SimpleBooleanProperty();
		this.consent_to_disclose_tax_return_3 = new SimpleBooleanProperty();
		this.consent_to_disclose_tax_return_4 = new SimpleBooleanProperty();
		this.questions_1 = new SimpleStringProperty();
		this.questions_2 = new SimpleStringProperty();
		this.questions_3 = new SimpleStringProperty();
		this.questions_4 = new SimpleStringProperty();
		this.questions_5 = new SimpleStringProperty();
		this.questions_6 = new SimpleStringProperty();
		this.questions_7 = new SimpleStringProperty();
		this.questions_8 = new SimpleStringProperty();
		this.questions_9 = new SimpleStringProperty();
		this.question_a = new SimpleStringProperty();
		this.question_b = new SimpleStringProperty();
		this.question_c = new SimpleStringProperty();
		this.question_d = new SimpleStringProperty();
		this.question_e = new SimpleStringProperty();
		this.question_f = new SimpleStringProperty();
		this.question_g = new SimpleStringProperty();
		this.question_h = new SimpleStringProperty();
		this.question_i = new SimpleStringProperty();
		this.question_j = new SimpleStringProperty();
		this.question_k = new SimpleStringProperty();
		this.persons_5_and_under = new SimpleDoubleProperty();
		this.persons_age_6_to_18 = new SimpleDoubleProperty();
		this.persons_age_65_plus = new SimpleDoubleProperty();
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


	public bool getConsent(){return consent_to_disclose_tax_return.get();}

	public void setConsent(bool consent_to_disclose_tax_return){this.consent_to_disclose_tax_return.set(consent_to_disclose_tax_return);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_tax_return;}


	public bool getConsentTo(){return consent_to_disclose_tax_return.get();}

	public void setConsentTo(bool consent_to_disclose_tax_return){this.consent_to_disclose_tax_return.set(consent_to_disclose_tax_return);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_tax_return;}


	public bool getConsentToDisclose(){return consent_to_disclose_tax_return.get();}

	public void setConsentToDisclose(bool consent_to_disclose_tax_return){this.consent_to_disclose_tax_return.set(consent_to_disclose_tax_return);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_tax_return;}


	public bool getConsentToDiscloseTax(){return consent_to_disclose_tax_return.get();}

	public void setConsentToDiscloseTax(bool consent_to_disclose_tax_return){this.consent_to_disclose_tax_return.set(consent_to_disclose_tax_return);}

	public BooleanProperty ConsentToDiscloseTaxProperty(){return consent_to_disclose_tax_return;}


	public bool getConsentToDiscloseTaxReturn(){return consent_to_disclose_tax_return.get();}

	public void setConsentToDiscloseTaxReturn(bool consent_to_disclose_tax_return){this.consent_to_disclose_tax_return.set(consent_to_disclose_tax_return);}

	public BooleanProperty ConsentToDiscloseTaxReturnProperty(){return consent_to_disclose_tax_return;}


	public bool getConsent(){return consent_to_disclose_taxpayer_d.get();}

	public void setConsent(bool consent_to_disclose_taxpayer_d){this.consent_to_disclose_taxpayer_d.set(consent_to_disclose_taxpayer_d);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_taxpayer_d;}


	public bool getConsentTo(){return consent_to_disclose_taxpayer_d.get();}

	public void setConsentTo(bool consent_to_disclose_taxpayer_d){this.consent_to_disclose_taxpayer_d.set(consent_to_disclose_taxpayer_d);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_taxpayer_d;}


	public bool getConsentToDisclose(){return consent_to_disclose_taxpayer_d.get();}

	public void setConsentToDisclose(bool consent_to_disclose_taxpayer_d){this.consent_to_disclose_taxpayer_d.set(consent_to_disclose_taxpayer_d);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_taxpayer_d;}


	public bool getConsentToDiscloseTaxpayer(){return consent_to_disclose_taxpayer_d.get();}

	public void setConsentToDiscloseTaxpayer(bool consent_to_disclose_taxpayer_d){this.consent_to_disclose_taxpayer_d.set(consent_to_disclose_taxpayer_d);}

	public BooleanProperty ConsentToDiscloseTaxpayerProperty(){return consent_to_disclose_taxpayer_d;}


	public bool getConsentToDiscloseTaxpayerD(){return consent_to_disclose_taxpayer_d.get();}

	public void setConsentToDiscloseTaxpayerD(bool consent_to_disclose_taxpayer_d){this.consent_to_disclose_taxpayer_d.set(consent_to_disclose_taxpayer_d);}

	public BooleanProperty ConsentToDiscloseTaxpayerDProperty(){return consent_to_disclose_taxpayer_d;}


	public bool getConsent(){return consent_to_use_taxpayer_data.get();}

	public void setConsent(bool consent_to_use_taxpayer_data){this.consent_to_use_taxpayer_data.set(consent_to_use_taxpayer_data);}

	public BooleanProperty ConsentProperty(){return consent_to_use_taxpayer_data;}


	public bool getConsentTo(){return consent_to_use_taxpayer_data.get();}

	public void setConsentTo(bool consent_to_use_taxpayer_data){this.consent_to_use_taxpayer_data.set(consent_to_use_taxpayer_data);}

	public BooleanProperty ConsentToProperty(){return consent_to_use_taxpayer_data;}


	public bool getConsentToUse(){return consent_to_use_taxpayer_data.get();}

	public void setConsentToUse(bool consent_to_use_taxpayer_data){this.consent_to_use_taxpayer_data.set(consent_to_use_taxpayer_data);}

	public BooleanProperty ConsentToUseProperty(){return consent_to_use_taxpayer_data;}


	public bool getConsentToUseTaxpayer(){return consent_to_use_taxpayer_data.get();}

	public void setConsentToUseTaxpayer(bool consent_to_use_taxpayer_data){this.consent_to_use_taxpayer_data.set(consent_to_use_taxpayer_data);}

	public BooleanProperty ConsentToUseTaxpayerProperty(){return consent_to_use_taxpayer_data;}


	public bool getConsentToUseTaxpayerData(){return consent_to_use_taxpayer_data.get();}

	public void setConsentToUseTaxpayerData(bool consent_to_use_taxpayer_data){this.consent_to_use_taxpayer_data.set(consent_to_use_taxpayer_data);}

	public BooleanProperty ConsentToUseTaxpayerDataProperty(){return consent_to_use_taxpayer_data;}


	public bool getConsent(){return consent_to_disclose_tax_return_1.get();}

	public void setConsent(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_tax_return_1;}


	public bool getConsentTo(){return consent_to_disclose_tax_return_1.get();}

	public void setConsentTo(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_tax_return_1;}


	public bool getConsentToDisclose(){return consent_to_disclose_tax_return_1.get();}

	public void setConsentToDisclose(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_tax_return_1;}


	public bool getConsentToDiscloseTax(){return consent_to_disclose_tax_return_1.get();}

	public void setConsentToDiscloseTax(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentToDiscloseTaxProperty(){return consent_to_disclose_tax_return_1;}


	public bool getConsentToDiscloseTaxReturn(){return consent_to_disclose_tax_return_1.get();}

	public void setConsentToDiscloseTaxReturn(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentToDiscloseTaxReturnProperty(){return consent_to_disclose_tax_return_1;}


	public bool getConsentToDiscloseTaxReturn1(){return consent_to_disclose_tax_return_1.get();}

	public void setConsentToDiscloseTaxReturn1(bool consent_to_disclose_tax_return_1){this.consent_to_disclose_tax_return_1.set(consent_to_disclose_tax_return_1);}

	public BooleanProperty ConsentToDiscloseTaxReturn1Property(){return consent_to_disclose_tax_return_1;}


	public bool getConsent(){return consent_to_disclose_tax_return_2.get();}

	public void setConsent(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_tax_return_2;}


	public bool getConsentTo(){return consent_to_disclose_tax_return_2.get();}

	public void setConsentTo(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_tax_return_2;}


	public bool getConsentToDisclose(){return consent_to_disclose_tax_return_2.get();}

	public void setConsentToDisclose(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_tax_return_2;}


	public bool getConsentToDiscloseTax(){return consent_to_disclose_tax_return_2.get();}

	public void setConsentToDiscloseTax(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentToDiscloseTaxProperty(){return consent_to_disclose_tax_return_2;}


	public bool getConsentToDiscloseTaxReturn(){return consent_to_disclose_tax_return_2.get();}

	public void setConsentToDiscloseTaxReturn(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentToDiscloseTaxReturnProperty(){return consent_to_disclose_tax_return_2;}


	public bool getConsentToDiscloseTaxReturn2(){return consent_to_disclose_tax_return_2.get();}

	public void setConsentToDiscloseTaxReturn2(bool consent_to_disclose_tax_return_2){this.consent_to_disclose_tax_return_2.set(consent_to_disclose_tax_return_2);}

	public BooleanProperty ConsentToDiscloseTaxReturn2Property(){return consent_to_disclose_tax_return_2;}


	public bool getConsent(){return consent_to_disclose_tax_return_3.get();}

	public void setConsent(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_tax_return_3;}


	public bool getConsentTo(){return consent_to_disclose_tax_return_3.get();}

	public void setConsentTo(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_tax_return_3;}


	public bool getConsentToDisclose(){return consent_to_disclose_tax_return_3.get();}

	public void setConsentToDisclose(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_tax_return_3;}


	public bool getConsentToDiscloseTax(){return consent_to_disclose_tax_return_3.get();}

	public void setConsentToDiscloseTax(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentToDiscloseTaxProperty(){return consent_to_disclose_tax_return_3;}


	public bool getConsentToDiscloseTaxReturn(){return consent_to_disclose_tax_return_3.get();}

	public void setConsentToDiscloseTaxReturn(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentToDiscloseTaxReturnProperty(){return consent_to_disclose_tax_return_3;}


	public bool getConsentToDiscloseTaxReturn3(){return consent_to_disclose_tax_return_3.get();}

	public void setConsentToDiscloseTaxReturn3(bool consent_to_disclose_tax_return_3){this.consent_to_disclose_tax_return_3.set(consent_to_disclose_tax_return_3);}

	public BooleanProperty ConsentToDiscloseTaxReturn3Property(){return consent_to_disclose_tax_return_3;}


	public bool getConsent(){return consent_to_disclose_tax_return_4.get();}

	public void setConsent(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentProperty(){return consent_to_disclose_tax_return_4;}


	public bool getConsentTo(){return consent_to_disclose_tax_return_4.get();}

	public void setConsentTo(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentToProperty(){return consent_to_disclose_tax_return_4;}


	public bool getConsentToDisclose(){return consent_to_disclose_tax_return_4.get();}

	public void setConsentToDisclose(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentToDiscloseProperty(){return consent_to_disclose_tax_return_4;}


	public bool getConsentToDiscloseTax(){return consent_to_disclose_tax_return_4.get();}

	public void setConsentToDiscloseTax(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentToDiscloseTaxProperty(){return consent_to_disclose_tax_return_4;}


	public bool getConsentToDiscloseTaxReturn(){return consent_to_disclose_tax_return_4.get();}

	public void setConsentToDiscloseTaxReturn(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentToDiscloseTaxReturnProperty(){return consent_to_disclose_tax_return_4;}


	public bool getConsentToDiscloseTaxReturn4(){return consent_to_disclose_tax_return_4.get();}

	public void setConsentToDiscloseTaxReturn4(bool consent_to_disclose_tax_return_4){this.consent_to_disclose_tax_return_4.set(consent_to_disclose_tax_return_4);}

	public BooleanProperty ConsentToDiscloseTaxReturn4Property(){return consent_to_disclose_tax_return_4;}


	public String getQuestions(){return questions_1.get();}

	public void setQuestions(String questions_1){this.questions_1.set(questions_1);}

	public StringProperty QuestionsProperty(){return questions_1;}


	public String getQuestions1(){return questions_1.get();}

	public void setQuestions1(String questions_1){this.questions_1.set(questions_1);}

	public StringProperty Questions1Property(){return questions_1;}


	public String getQuestions(){return questions_2.get();}

	public void setQuestions(String questions_2){this.questions_2.set(questions_2);}

	public StringProperty QuestionsProperty(){return questions_2;}


	public String getQuestions2(){return questions_2.get();}

	public void setQuestions2(String questions_2){this.questions_2.set(questions_2);}

	public StringProperty Questions2Property(){return questions_2;}


	public String getQuestions(){return questions_3.get();}

	public void setQuestions(String questions_3){this.questions_3.set(questions_3);}

	public StringProperty QuestionsProperty(){return questions_3;}


	public String getQuestions3(){return questions_3.get();}

	public void setQuestions3(String questions_3){this.questions_3.set(questions_3);}

	public StringProperty Questions3Property(){return questions_3;}


	public String getQuestions(){return questions_4.get();}

	public void setQuestions(String questions_4){this.questions_4.set(questions_4);}

	public StringProperty QuestionsProperty(){return questions_4;}


	public String getQuestions4(){return questions_4.get();}

	public void setQuestions4(String questions_4){this.questions_4.set(questions_4);}

	public StringProperty Questions4Property(){return questions_4;}


	public String getQuestions(){return questions_5.get();}

	public void setQuestions(String questions_5){this.questions_5.set(questions_5);}

	public StringProperty QuestionsProperty(){return questions_5;}


	public String getQuestions5(){return questions_5.get();}

	public void setQuestions5(String questions_5){this.questions_5.set(questions_5);}

	public StringProperty Questions5Property(){return questions_5;}


	public String getQuestions(){return questions_6.get();}

	public void setQuestions(String questions_6){this.questions_6.set(questions_6);}

	public StringProperty QuestionsProperty(){return questions_6;}


	public String getQuestions6(){return questions_6.get();}

	public void setQuestions6(String questions_6){this.questions_6.set(questions_6);}

	public StringProperty Questions6Property(){return questions_6;}


	public String getQuestions(){return questions_7.get();}

	public void setQuestions(String questions_7){this.questions_7.set(questions_7);}

	public StringProperty QuestionsProperty(){return questions_7;}


	public String getQuestions7(){return questions_7.get();}

	public void setQuestions7(String questions_7){this.questions_7.set(questions_7);}

	public StringProperty Questions7Property(){return questions_7;}


	public String getQuestions(){return questions_8.get();}

	public void setQuestions(String questions_8){this.questions_8.set(questions_8);}

	public StringProperty QuestionsProperty(){return questions_8;}


	public String getQuestions8(){return questions_8.get();}

	public void setQuestions8(String questions_8){this.questions_8.set(questions_8);}

	public StringProperty Questions8Property(){return questions_8;}


	public String getQuestions(){return questions_9.get();}

	public void setQuestions(String questions_9){this.questions_9.set(questions_9);}

	public StringProperty QuestionsProperty(){return questions_9;}


	public String getQuestions9(){return questions_9.get();}

	public void setQuestions9(String questions_9){this.questions_9.set(questions_9);}

	public StringProperty Questions9Property(){return questions_9;}


	public String getQuestion(){return question_a.get();}

	public void setQuestion(String question_a){this.question_a.set(question_a);}

	public StringProperty QuestionProperty(){return question_a;}


	public String getQuestionA(){return question_a.get();}

	public void setQuestionA(String question_a){this.question_a.set(question_a);}

	public StringProperty QuestionAProperty(){return question_a;}


	public String getQuestion(){return question_b.get();}

	public void setQuestion(String question_b){this.question_b.set(question_b);}

	public StringProperty QuestionProperty(){return question_b;}


	public String getQuestionB(){return question_b.get();}

	public void setQuestionB(String question_b){this.question_b.set(question_b);}

	public StringProperty QuestionBProperty(){return question_b;}


	public String getQuestion(){return question_c.get();}

	public void setQuestion(String question_c){this.question_c.set(question_c);}

	public StringProperty QuestionProperty(){return question_c;}


	public String getQuestionC(){return question_c.get();}

	public void setQuestionC(String question_c){this.question_c.set(question_c);}

	public StringProperty QuestionCProperty(){return question_c;}


	public String getQuestion(){return question_d.get();}

	public void setQuestion(String question_d){this.question_d.set(question_d);}

	public StringProperty QuestionProperty(){return question_d;}


	public String getQuestionD(){return question_d.get();}

	public void setQuestionD(String question_d){this.question_d.set(question_d);}

	public StringProperty QuestionDProperty(){return question_d;}


	public String getQuestion(){return question_e.get();}

	public void setQuestion(String question_e){this.question_e.set(question_e);}

	public StringProperty QuestionProperty(){return question_e;}


	public String getQuestionE(){return question_e.get();}

	public void setQuestionE(String question_e){this.question_e.set(question_e);}

	public StringProperty QuestionEProperty(){return question_e;}


	public String getQuestion(){return question_f.get();}

	public void setQuestion(String question_f){this.question_f.set(question_f);}

	public StringProperty QuestionProperty(){return question_f;}


	public String getQuestionF(){return question_f.get();}

	public void setQuestionF(String question_f){this.question_f.set(question_f);}

	public StringProperty QuestionFProperty(){return question_f;}


	public String getQuestion(){return question_g.get();}

	public void setQuestion(String question_g){this.question_g.set(question_g);}

	public StringProperty QuestionProperty(){return question_g;}


	public String getQuestionG(){return question_g.get();}

	public void setQuestionG(String question_g){this.question_g.set(question_g);}

	public StringProperty QuestionGProperty(){return question_g;}


	public String getQuestion(){return question_h.get();}

	public void setQuestion(String question_h){this.question_h.set(question_h);}

	public StringProperty QuestionProperty(){return question_h;}


	public String getQuestionH(){return question_h.get();}

	public void setQuestionH(String question_h){this.question_h.set(question_h);}

	public StringProperty QuestionHProperty(){return question_h;}


	public String getQuestion(){return question_i.get();}

	public void setQuestion(String question_i){this.question_i.set(question_i);}

	public StringProperty QuestionProperty(){return question_i;}


	public String getQuestionI(){return question_i.get();}

	public void setQuestionI(String question_i){this.question_i.set(question_i);}

	public StringProperty QuestionIProperty(){return question_i;}


	public String getQuestion(){return question_j.get();}

	public void setQuestion(String question_j){this.question_j.set(question_j);}

	public StringProperty QuestionProperty(){return question_j;}


	public String getQuestionJ(){return question_j.get();}

	public void setQuestionJ(String question_j){this.question_j.set(question_j);}

	public StringProperty QuestionJProperty(){return question_j;}


	public String getQuestion(){return question_k.get();}

	public void setQuestion(String question_k){this.question_k.set(question_k);}

	public StringProperty QuestionProperty(){return question_k;}


	public String getQuestionK(){return question_k.get();}

	public void setQuestionK(String question_k){this.question_k.set(question_k);}

	public StringProperty QuestionKProperty(){return question_k;}


	public double getPersons(){return persons_5_and_under.get();}

	public void setPersons(double persons_5_and_under){this.persons_5_and_under.set(persons_5_and_under);}

	public DoubleProperty PersonsProperty(){return persons_5_and_under;}


	public double getPersons5(){return persons_5_and_under.get();}

	public void setPersons5(double persons_5_and_under){this.persons_5_and_under.set(persons_5_and_under);}

	public DoubleProperty Persons5Property(){return persons_5_and_under;}


	public double getPersons5And(){return persons_5_and_under.get();}

	public void setPersons5And(double persons_5_and_under){this.persons_5_and_under.set(persons_5_and_under);}

	public DoubleProperty Persons5AndProperty(){return persons_5_and_under;}


	public double getPersons5AndUnder(){return persons_5_and_under.get();}

	public void setPersons5AndUnder(double persons_5_and_under){this.persons_5_and_under.set(persons_5_and_under);}

	public DoubleProperty Persons5AndUnderProperty(){return persons_5_and_under;}


	public double getPersons(){return persons_age_6_to_18.get();}

	public void setPersons(double persons_age_6_to_18){this.persons_age_6_to_18.set(persons_age_6_to_18);}

	public DoubleProperty PersonsProperty(){return persons_age_6_to_18;}


	public double getPersonsAge(){return persons_age_6_to_18.get();}

	public void setPersonsAge(double persons_age_6_to_18){this.persons_age_6_to_18.set(persons_age_6_to_18);}

	public DoubleProperty PersonsAgeProperty(){return persons_age_6_to_18;}


	public double getPersonsAge6(){return persons_age_6_to_18.get();}

	public void setPersonsAge6(double persons_age_6_to_18){this.persons_age_6_to_18.set(persons_age_6_to_18);}

	public DoubleProperty PersonsAge6Property(){return persons_age_6_to_18;}


	public double getPersonsAge6To(){return persons_age_6_to_18.get();}

	public void setPersonsAge6To(double persons_age_6_to_18){this.persons_age_6_to_18.set(persons_age_6_to_18);}

	public DoubleProperty PersonsAge6ToProperty(){return persons_age_6_to_18;}


	public double getPersonsAge6To18(){return persons_age_6_to_18.get();}

	public void setPersonsAge6To18(double persons_age_6_to_18){this.persons_age_6_to_18.set(persons_age_6_to_18);}

	public DoubleProperty PersonsAge6To18Property(){return persons_age_6_to_18;}


	public double getPersons(){return persons_age_65_plus.get();}

	public void setPersons(double persons_age_65_plus){this.persons_age_65_plus.set(persons_age_65_plus);}

	public DoubleProperty PersonsProperty(){return persons_age_65_plus;}


	public double getPersonsAge(){return persons_age_65_plus.get();}

	public void setPersonsAge(double persons_age_65_plus){this.persons_age_65_plus.set(persons_age_65_plus);}

	public DoubleProperty PersonsAgeProperty(){return persons_age_65_plus;}


	public double getPersonsAge65(){return persons_age_65_plus.get();}

	public void setPersonsAge65(double persons_age_65_plus){this.persons_age_65_plus.set(persons_age_65_plus);}

	public DoubleProperty PersonsAge65Property(){return persons_age_65_plus;}


	public double getPersonsAge65Plus(){return persons_age_65_plus.get();}

	public void setPersonsAge65Plus(double persons_age_65_plus){this.persons_age_65_plus.set(persons_age_65_plus);}

	public DoubleProperty PersonsAge65PlusProperty(){return persons_age_65_plus;}


}

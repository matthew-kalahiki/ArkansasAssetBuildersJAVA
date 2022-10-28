package com.aab.arkansasassetbuilders;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import model.*;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

public class HelloController {

    @FXML
    private BorderPane filterMenu;

    @FXML
    private BorderPane resultsView;

    @FXML
    private Label welcomeText;

    @FXML
    private TextField clientID;

    @FXML
    private TextArea resultArea;

    @FXML
    private Button openFilter;

    @FXML
    private Button filterButton;

    @FXML
    private TextField name;

    @FXML
    private DatePicker dob;

    @FXML
    private TextField l4ss;

    @FXML
    private ChoiceBox taxYear;

    @FXML
    private TextField address;

    @FXML
    private TextField zip;

    @FXML
    private TextField county;

    @FXML
    private TextField state;

    @FXML
    private TextField federalReturn;

    @FXML
    private TextField totalRefund;

    @FXML
    private TextField eitc;

    @FXML
    private TextField ctc;

    @FXML
    private TextField dependents;

    @FXML
    private TextField surveyScore;

    @FXML
    private TableView resultsTable;

    @FXML
    private TableColumn<DataObject, String> clientIDColumn;

    @FXML
    private TableColumn<DataObject, String> firstNameColumn;

    @FXML
    private TableColumn<DataObject, String> lastNameColumn;

    @FXML
    private TableColumn<DataObject, String> doBColumn;

    @FXML
    private TableColumn<DataObject, Integer> last4ssColumn;

    @FXML
    private TableColumn<DataObject, Integer> taxYearColumn;

    @FXML
    private TableColumn<DataObject, String> addressColumn;

    @FXML
    private TableColumn<DataObject, Integer> zipColumn;

    @FXML
    private TableColumn<DataObject, String> countyColumn;

    @FXML
    private TableColumn<DataObject, String> stateColumn;

    @FXML
    private TableColumn<DataObject, Integer> federalReturnColumn;

    @FXML
    private TableColumn<DataObject, Integer> totalRefundColumn;

    @FXML
    private TableColumn<DataObject, Integer> eitcColumn;

    @FXML
    private TableColumn<DataObject, Integer> ctcColumn;

    @FXML
    private TableColumn<DataObject, Integer> dependentsColumn;

    @FXML
    private TableColumn<DataObject, Integer> surveyScoreColumn;

    @FXML
    private void initialize () {
        /*
        The setCellValueFactory(...) that we set on the table columns are used to determine
        which field inside the Employee objects should be used for the particular column.
        The arrow -> indicates that we're using a Java 8 feature called Lambdas.
        (Another option would be to use a PropertyValueFactory, but this is not type-safe
        We're only using StringProperty values for our table columns in this example.
        When you want to use IntegerProperty or DoubleProperty, the setCellValueFactory(...)
        must have an additional asObject():
        */
        clientIDColumn.setCellValueFactory(cellData -> cellData.getValue().Client_IDProperty());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        doBColumn.setCellValueFactory(cellData -> cellData.getValue().doBProperty());
        last4ssColumn.setCellValueFactory(cellData -> cellData.getValue().last4SSProperty().asObject());
        /*
        taxYearColumn.setCellValueFactory(cellData -> cellData.getValue().taxYearProperty().asObject());
        addressColumn.setCellValueFactory(cellData -> cellData.getValue().addressProperty());
        zipColumn.setCellValueFactory(cellData -> cellData.getValue().zipProperty().asObject());
        countyColumn.setCellValueFactory(cellData -> cellData.getValue().countyProperty());
        stateColumn.setCellValueFactory(cellData -> cellData.getValue().stateProperty());
        federalReturnColumn.setCellValueFactory(cellData -> cellData.getValue().federalReturnProperty().asObject());
        totalRefundColumn.setCellValueFactory(cellData-> cellData.getValue().totalRefundProperty().asObject());
        eitcColumn.setCellValueFactory(cellData -> cellData.getValue().EITCProperty().asObject());
        ctcColumn.setCellValueFactory(cellData -> cellData.getValue().CTCProperty().asObject());
        dependentsColumn.setCellValueFactory(cellData -> cellData.getValue().dependentsProperty().asObject());
        surveyScoreColumn.setCellValueFactory(cellData -> cellData.getValue().surveyScoreProperty().asObject());

         */
    }

    @FXML
    private void searchClient(ActionEvent actionEvent) throws ClassNotFoundException, SQLException{
        try{
            Client client = ClientDAO.searchClient(clientID.getText());
            populateAndShowClient(client);
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error occurred while getting client information from DB.\n" + e);
            throw e;
        }
    }

    @FXML
    private void searchClients(ActionEvent actionEvent) throws ClassNotFoundException, SQLException{
        try{
            String condition = "";
            boolean[] cols = {!name.getText().isEmpty(), dob.getValue() != null, !l4ss.getText().isEmpty()};
            int numCols = 0;
            for(boolean b : cols){
                if(b){numCols++;}
            }
            if(numCols > 0){
                condition += "WHERE ";
            }
            if(cols[0]){
                numCols--;
                String fn = name.getText().split("\\s+")[0];
                String ln = name.getText().split("\\s+")[1];
                condition += "FirstName = " + fn + " AND LastName = " + ln;
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[1]){
                numCols--;
                condition += "DoB = " + dob.getValue().format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[2]){
                numCols--;
                condition += "Last4SS = " + l4ss.getText();
                //if(numCols > 0){condition += " AND ";}
            }
            ObservableList<DataObject> clientData = ClientDAO.searchClients(condition);
            populateClients(clientData);
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error occurred while getting client information from DB.\n" + e);
            throw e;
        }
    }

    @FXML
    private void populateClient(Client client) throws ClassNotFoundException{
        ObservableList<Client> clientData = FXCollections.observableArrayList();
        clientData.add(client);
        System.out.println(clientData.size());
        resultsTable.setItems(clientData);
    }

    @FXML
    private void setClientInfoToTextArea(Client client){
        resultArea.setText("First Name: " + client.getFirstName() + "\n" + "Last Name: " + client.getLastName());
    }

    @FXML
    private void populateAndShowClient(Client client) throws ClassNotFoundException{
        if(client != null){
            populateClient(client);
            setClientInfoToTextArea(client);
        }else{
            resultArea.setText("This client does not exist!\n");
        }
    }

    @FXML
    private void populateData(ObservableList<DataObject> dataObjects) throws ClassNotFoundException{
        resultsTable.setItems(dataObjects);
    }

    @FXML
    private void populateClients(ObservableList<DataObject> clientData) throws ClassNotFoundException{
        resultsTable.setItems(clientData);
    }
    @FXML
    private void populateDemographics(ObservableList<Demographic> demographicData) throws ClassNotFoundException{
        resultsTable.setItems(demographicData);
    }
    @FXML
    private void populateReturnData(ObservableList<ReturnData> returnDataData)throws ClassNotFoundException{
        resultsTable.setItems(returnDataData);
    }
    @FXML
    private void populateYears(ObservableList<TaxYear> taxYearData){
        resultsTable.setItems(taxYearData);
    }

    @FXML
    private void openFilterMenu(){
        resultsView.setVisible(false);
        //resultsView.setDisable(true);
        filterMenu.setVisible(true);
        //filterMenu.setDisable(false);
    }

    @FXML
    private void filter(ActionEvent actionEvent) throws ClassNotFoundException, SQLException{
        resultsView.setVisible(true);
        filterMenu.setVisible(false);
        try{
            String condition = "";
            boolean[] cols = {!name.isDisable(), !dob.isDisable(), !l4ss.isDisable(), !taxYear.isDisable(), !address.isDisable(), !zip.isDisable(), !county.isDisable(), !state.isDisable(), !federalReturn.isDisable(), !totalRefund.isDisable(), !eitc.isDisable(), !ctc.isDisable(), !dependents.isDisable(), !surveyScore.isDisable()};
            boolean[] conds = {!name.getText().isEmpty(), dob.getValue() != null, !l4ss.getText().isEmpty(), taxYear.getValue() != null, !address.getText().isEmpty(), !zip.getText().isEmpty(), !county.getText().isEmpty(), !state.getText().isEmpty(), !federalReturn.getText().isEmpty(), !totalRefund.getText().isEmpty(), !eitc.getText().isEmpty(), !ctc.getText().isEmpty(), !dependents.getText().isEmpty(), !surveyScore.getText().isEmpty()};
            boolean clientFilter = false;
            boolean demographicFilter = false;
            boolean returnDataFilter = false;
            boolean taxYearFilter = false;
            int numCols = 0;
            for(int i = 0; i < conds.length; i++){
                if(cols[i] && conds[i]){numCols++;}
                if(i < 3 && cols[i]){
                    clientFilter = true;
                }
                else if(i == 3 && cols[i]){
                    taxYearFilter = true;
                }
                else if(i > 3 && i < 8 && cols[i]){
                    demographicFilter = true;
                }else if(i >= 8 && cols[i]){
                    returnDataFilter = true;
                }
            }
            if(numCols > 0){
                condition += " WHERE ";
            }
            if(cols[0] && conds[0]){
                numCols--;
                String fn = name.getText().split("\\s+")[0];
                String ln = name.getText().split("\\s+")[1];
                condition += "FirstName = '" + fn + "' AND LastName = '" + ln + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[1] && conds[1]){
                numCols--;
                condition += "DoB = '" + dob.getValue().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[2] && conds[2]){
                numCols--;
                condition += "Last4SS = '" + l4ss.getText() + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[3] && conds[3]){
                numCols--;
                if(demographicFilter){
                    condition += "Demographic.";
                }else if(returnDataFilter){
                    condition += "ReturnData.";
                }
                condition += "TaxYear = " + taxYear.getValue().toString();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[4] && conds[4]){
                numCols--;
                condition += "Address = '" + address.getText() + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[5] && conds[5]){
                numCols--;
                condition += "Zip = " + zip.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[6] && conds[6]){
                numCols--;
                condition += "County = '" + county.getText() + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[7] && conds[7]){
                numCols--;
                condition += "State = '" + state.getText() + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[8] && conds[8]){
                numCols--;
                condition += "FederalReturn = " + federalReturn.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[9] && conds[9]){
                numCols--;
                condition += "TotalRefund = " + totalRefund.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[10] && conds[10]){
                numCols--;
                condition += "EITC = " + eitc.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[11] && conds[11]){
                numCols--;
                condition += "CTC = " + ctc.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[12] && conds[12]){
                numCols--;
                condition += "Dependents = " + dependents.getText();
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[13] && conds[13]){
                condition += "SurveyScore = " + surveyScore.getText();
            }
            System.out.println(condition);
            if(demographicFilter && returnDataFilter && clientFilter){
                ObservableList<DataObject> clientDemographicReturnDataData = DataBase.searchDemographicsAndReturnDataAndClients(condition);
                populateData(clientDemographicReturnDataData);
            }else if(demographicFilter && returnDataFilter){
                ObservableList<DataObject> demographicReturnDataData = DataBase.searchDemographicsAndReturnData(condition);
                populateData(demographicReturnDataData);
            }else if(demographicFilter && clientFilter){
                //pickup here
                ObservableList<DataObject> demographicClientData = DataBase.searchDemographicsAndClients(condition);
                populateData(demographicClientData);
            }else if(demographicFilter){
                ObservableList<DataObject> demographicData = DataBase.searchDemographics(condition);
                populateData(demographicData);
            }else if(returnDataFilter && clientFilter){
                ObservableList<DataObject> returnDataClientData = DataBase.searchReturnDataAndClients(condition);
                populateData(returnDataClientData);
            }else if(returnDataFilter){
                ObservableList<DataObject> returnDataData = DataBase.searchReturnData(condition);
                populateData(returnDataData);
            }else if(taxYearFilter){
                ObservableList<DataObject> taxYearData = DataBase.searchTaxYears(condition);
                populateData(taxYearData);
            }else {
                ObservableList<DataObject> clientData = ClientDAO.searchClients(condition);
                populateClients(clientData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error occurred while getting client information from DB.\n" + e);
            throw e;
        }
    }
    @FXML
    private void nameBoxAction(){
        name.setDisable(!name.isDisable());
        firstNameColumn.setVisible(!firstNameColumn.isVisible());
        lastNameColumn.setVisible(!lastNameColumn.isVisible());
        if(firstNameColumn.isVisible()){
            firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
            lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        }else{
            firstNameColumn.setCellValueFactory(null);
            lastNameColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void dobBoxAction(){
        dob.setDisable(!dob.isDisable());
        doBColumn.setVisible(doBColumn.isVisible());
        if(doBColumn.isVisible()){
            doBColumn.setCellValueFactory(cellData -> cellData.getValue().doBProperty());
        }else{
            doBColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void l4ssBoxAction(){
        l4ss.setDisable(!l4ss.isDisable());
        last4ssColumn.setVisible(!last4ssColumn.isVisible());
        if(last4ssColumn.isVisible()){
            last4ssColumn.setCellValueFactory(cellData -> cellData.getValue().last4SSProperty().asObject());
        }else{
            last4ssColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void taxYearBoxAction(){
        taxYear.setDisable(!taxYear.isDisable());
        taxYearColumn.setVisible(!taxYearColumn.isVisible());
        if(taxYearColumn.isVisible()) {
            taxYearColumn.setCellValueFactory(cellData -> cellData.getValue().taxYearProperty().asObject());
        }else{
            taxYearColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void addressBoxAction(){
        address.setDisable(!address.isDisable());
        addressColumn.setVisible(!addressColumn.isVisible());
        if(addressColumn.isVisible()){
            addressColumn.setCellValueFactory(cellData -> cellData.getValue().addressProperty());
        }else{
            addressColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void zipBoxAction(){
        zip.setDisable(!zip.isDisable());
        zipColumn.setVisible(!zip.isVisible());
        if(zipColumn.isVisible()){
            zipColumn.setCellValueFactory(cellData -> cellData.getValue().zipProperty().asObject());
        }else{
            zipColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void countyBoxAction(){
        county.setDisable(!county.isDisable());
        countyColumn.setVisible(!countyColumn.isVisible());
        if(countyColumn.isVisible()){
            countyColumn.setCellValueFactory(cellData -> cellData.getValue().countyProperty());
        }else{
            countyColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void stateBoxAction(){
        state.setDisable(!state.isDisable());
        stateColumn.setVisible(!stateColumn.isVisible());
        if(stateColumn.isVisible()){
            stateColumn.setCellValueFactory(cellData -> cellData.getValue().stateProperty());
        }else{
            stateColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void federalReturnBoxAction(){
        federalReturn.setDisable(!federalReturn.isDisable());
        federalReturnColumn.setVisible(!federalReturnColumn.isVisible());
        if(federalReturnColumn.isVisible()){
            federalReturnColumn.setCellValueFactory(cellData -> cellData.getValue().federalReturnProperty().asObject());
        }else{
            federalReturnColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void totalRefundBoxAction(){
        totalRefund.setDisable(!totalRefund.isDisable());
        totalRefundColumn.setVisible(!totalRefundColumn.isVisible());
        if(totalRefundColumn.isVisible()){
            totalRefundColumn.setCellValueFactory(cellData-> cellData.getValue().totalRefundProperty().asObject());
        }else{
            totalRefundColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void eitcBoxAction(){
        eitc.setDisable(!eitc.isDisable());
        eitcColumn.setVisible(!eitcColumn.isVisible());
        if(eitcColumn.isVisible()){
            eitcColumn.setCellValueFactory(cellData -> cellData.getValue().EITCProperty().asObject());
        }else{
            eitcColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void ctcBoxAction(){
        ctc.setDisable(!ctc.isDisable());
        ctcColumn.setVisible(!ctcColumn.isVisible());
        if(ctcColumn.isVisible()){
            ctcColumn.setCellValueFactory(cellData -> cellData.getValue().CTCProperty().asObject());
        }else{
            ctcColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void dependentsBoxAction(){
        dependents.setDisable(!dependents.isDisable());
        dependentsColumn.setVisible(!ctcColumn.isVisible());
        if(dependentsColumn.isVisible()){
            dependentsColumn.setCellValueFactory(cellData -> cellData.getValue().dependentsProperty().asObject());
        }else{
            dependentsColumn.setCellValueFactory(null);
        }
    }
    @FXML
    private void surveyScoreBoxAction(){
        surveyScore.setDisable(!surveyScore.isDisable());
        surveyScoreColumn.setVisible(!surveyScoreColumn.isVisible());
        if(surveyScoreColumn.isVisible()){
            surveyScoreColumn.setCellValueFactory(cellData -> cellData.getValue().surveyScoreProperty().asObject());
        }else{
            surveyScoreColumn.setCellValueFactory(null);
        }
    }
}
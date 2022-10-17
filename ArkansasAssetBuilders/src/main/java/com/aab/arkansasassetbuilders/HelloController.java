package com.aab.arkansasassetbuilders;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import model.Client;
import model.ClientDAO;

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
    private TableView resultsTable;

    @FXML
    private TableColumn<Client, String> clientIDColumn;

    @FXML
    private TableColumn<Client, String> firstNameColumn;

    @FXML
    private TableColumn<Client, String> lastNameColumn;

    @FXML
    private TableColumn<Client, String> doBColumn;

    @FXML
    private TableColumn<Client, Integer> last4ssColumn;

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
        clientIDColumn.setCellValueFactory(cellData -> cellData.getValue().IDProperty());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
        doBColumn.setCellValueFactory(cellData -> cellData.getValue().doBProperty());
        last4ssColumn.setCellValueFactory(cellData -> cellData.getValue().last4SSProperty().asObject());
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
            ObservableList<Client> clientData = ClientDAO.searchClients(condition);
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
            resultArea.setText("This employee does not exist!\n");
        }
    }

    @FXML
    private void populateClients(ObservableList<Client> clientData) throws ClassNotFoundException{
        resultsTable.setItems(clientData);
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
                condition += "FirstName = '" + fn + "' AND LastName = '" + ln + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[1]){
                numCols--;
                condition += "DoB = '" + dob.getValue().format(DateTimeFormatter.ofPattern("MM/dd/yyyy")) + "'";
                if(numCols > 0){condition += " AND ";}
            }
            if(cols[2]){
                numCols--;
                condition += "Last4SS = '" + l4ss.getText() + "'";
                //if(numCols > 0){condition += " AND ";}
            }
            System.out.println(condition);
            ObservableList<Client> clientData = ClientDAO.searchClients(condition);
            populateClients(clientData);
        } catch (SQLException e) {
            e.printStackTrace();
            resultArea.setText("Error occurred while getting client information from DB.\n" + e);
            throw e;
        }
    }
}
package com.aab.arkansasassetbuilders;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Client;
import model.ClientDAO;

import java.sql.SQLException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField clientID;

    @FXML
    private TextArea resultArea;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
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
    private void populateClient(Client client) throws ClassNotFoundException{
        ObservableList<Client> clientData = FXCollections.observableArrayList();
        clientData.add(client);
        //employeeTable.setItems(clientData);
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
}
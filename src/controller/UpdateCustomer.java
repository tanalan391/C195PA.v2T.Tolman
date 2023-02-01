package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UpdateCustomer implements Initializable {
    public TextField customerID;
    public TextField customerName;
    public TextField address;
    public TextField postalCode;
    public TextField phoneNumber;
    public Label firstLevelLabel;
    public Button saveButton;
    public Button cancelButton;
    public ComboBox<String> firstLevel;
    public ComboBox<String> countryDropdown;

    public void initialize(URL url, ResourceBundle resourceBundle){
        countryDropdown.setItems(FXCollections.observableArrayList("United States","Canada","United Kingdom"));

        targetCustomerData();

    }

    private void targetCustomerData() {
       /* customerID.setText(String.valueOf(targetCustomer.getCustomerID()));
        customerName.setText(String.valueOf(targetCustomer.getCustomerName()));
        address.setText(String.valueOf(targetCustomer.getCustomerAddress()));
        postalCode.setText(String.valueOf(targetCustomer.getPostalCode()));
        phoneNumber.setText(String.valueOf(targetCustomer.getPhoneNumber()));
        firstLevel.getSelectionModel();
        countryDropdown.getSelectionModel();

        */
    }

    public void onSave(ActionEvent actionEvent) {
    }

    public void onCancel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
        Stage stage = (Stage) ((Button)actionEvent.getSource()).getScene().getWindow();
        Scene scene = new Scene(root, 1000, 400);
        stage.setTitle("Global Scheduling System");
        stage.setScene(scene);
        stage.show();
    }

    public void onCountryDropdown(ActionEvent actionEvent) {


    }
}

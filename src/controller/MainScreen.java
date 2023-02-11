package controller;

//import DAO.AppointmentDAOImp;
import DAO.CustomerDAOImp;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreen implements Initializable {
    public TableColumn custIDCol;
    public TableColumn custNameCol;
    public TableColumn custAddressCol;
    public TableColumn custPostalCodeCol;
    public TableColumn custPhoneNumberCol;
    public Button custSearchButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void showCustomers(ActionEvent actionEvent){
        ObservableList<customers> customerList= CustomerDAOImp.getAllCustomers();
        for (customers c : customerList){
            System.out.println("Customer ID: " + c.getID() + "Name: " + c.getName() + "Address: " + c.getAddress() + "Postal Code: "+ c.getPostalCode() + "Phone Number: " + c.getPhoneNumber());
        }
    }

    public void onCustSearch(ActionEvent actionEvent) {
    }
/*
    public void showAppointments(ActionEvent actionEvent){
        ObservableList<appointment> appointmentList = AppointmentDAOImp.getAllAppointments();

    }*/
}

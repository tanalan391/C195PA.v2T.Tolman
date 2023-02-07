package controller;

//import DAO.AppointmentDAOImp;
import DAO.CustomerDAOImp;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import model.*;

import java.net.URL;
import java.util.ResourceBundle;

public class MainScreen implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void showCustomers(ActionEvent actionEvent){
        ObservableList<customers> customerList= CustomerDAOImp.getAllCustomers();
        for (customers c : customerList){
            System.out.println("Customer ID: " + c.getID() + "Name: " + c.getName() + "Address: " + c.getAddress() + "Postal Code: "+ c.getPostalCode() + "Phone Number: " + c.getPhoneNumber());
        }
    }
/*
    public void showAppointments(ActionEvent actionEvent){
        ObservableList<appointment> appointmentList = AppointmentDAOImp.getAllAppointments();

    }*/
}

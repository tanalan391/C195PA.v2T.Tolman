package DAO;

import javafx.collections.ObservableList;
import model.customers;
import java.sql.*;
import javafx.collections.FXCollections;


public class CustomerDAOImp {

    public static ObservableList<customers> getAllCustomers(){
        ObservableList<customers> customerList = FXCollections.observableArrayList();

        try {
            String sql = "SELECT * from customers";

            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return customerList;
    }
}

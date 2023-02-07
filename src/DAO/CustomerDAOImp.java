package DAO;

import javafx.collections.ObservableList;
import model.customers;
import java.sql.*;
import javafx.collections.FXCollections;


public class CustomerDAOImp {

    public static ObservableList<customers> getAllCustomers(){
        ObservableList<customers> customerList = FXCollections.observableArrayList();

        try {
            String sql = "SELECT * FROM client_schedule.customers";

            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int customerID = rs.getInt("Customer_ID");
                String name = rs.getString("Customer_Name");
                String address = rs.getString("Address");
                int postalCode = rs.getInt("Postal_Code");
                String phoneNumber = rs.getString("Phone");

                customers c = new customers(customerID, name, address, postalCode, phoneNumber);
                customerList.add(c);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return customerList;
    }
}

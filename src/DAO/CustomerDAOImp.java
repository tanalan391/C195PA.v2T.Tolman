package DAO;

import javafx.collections.ObservableList;
import model.customers;
import java.sql.*;
import javafx.collections.FXCollections;


public abstract class CustomerDAOImp {

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


    public static int insert(String name, int divisionID) throws SQLException{

            String sql = "INSERT INTO client_schedule.customers (Customer_Name, Division_ID) VALUES(?,? )";
            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2,divisionID);
            int rowsAffected = ps.executeUpdate();


        return rowsAffected;
    }

    public static int update(int customerID, String name) throws SQLException{

        String sql = "UPDATE client_schedule.customers SET Customer_Name = ? WHERE Customer_ID = ?";
        PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);
        ps.setInt(2, customerID);
        ps.setString(1, name);
        int rowsAffected = ps.executeUpdate();
        return rowsAffected;
    }











}

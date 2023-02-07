/*package DAO;

import javafx.collections.ObservableList;
import model.appointment;
import java.sql.*;
import java.time.ZonedDateTime;

import javafx.collections.FXCollections;

public class AppointmentDAOImp {

    public static ObservableList<appointment> getAllAppointments(){
        ObservableList<appointment> appointmentList = FXCollections.observableArrayList();

        try{
            String sql = "SELECT * FROM client_schedule.appointments";

            PreparedStatement ps = DBConnection.getConnection().prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                int appID = rs.getInt("Appointment_ID");
                String title = rs.getString("Title");
                String description = rs.getString("Description");
                String location = rs.getString("Location");
                String contact = rs.getString("Contact");
                String type = rs.getString("Type");
                DateTime start = rs.getDate("Start");
                ZonedDateTime end = rs.getDate("End");
                int customerID = rs.getInt("Customer_ID");
                int userID = rs.getInt("User_ID");

                appointment ap = new appointment(appID, title, description, location, contact, type, start, end, customerID, userID );
                appointmentList.add(ap);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return appointmentList;
    }

}
*/
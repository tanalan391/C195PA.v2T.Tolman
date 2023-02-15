package main;

import DAO.CustomerDAOImp;
import DAO.DBConnection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/view/Login.fxml"));
        primaryStage.setTitle("Global Scheduling System");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) throws SQLException {
        DBConnection.startConnection();
        //launch(args);
        int rowsAffected = CustomerDAOImp.update(4, "Ms. Tillman");
        if (rowsAffected > 0){
            System.out.println("Insert Successful");
        }
        else {
            System.out.println("Insert Failed");
        }


        DBConnection.closeConnection();
    }
}

package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    public Button loginButton;
    public PasswordField passwordField;
    public TextField usernameField;

    public void onLoginButton(ActionEvent actionEvent) {
        try{
           // String u = usernameField.getText();
           // String p = passwordField.getText();
            Parent root = FXMLLoader.load(getClass().getResource("/view/MainScreen.fxml"));
            Stage stage = (Stage)((Button)actionEvent.getSource()).getScene().getWindow();
            Scene scene = new Scene(root, 600,400);
            stage.setTitle("Global Scheduling System");
            stage.setScene(scene);
            stage.show();


        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Incorrect Username or Password!");
            alert.showAndWait();
        }
    }

    public void onPasswordField(ActionEvent actionEvent) {
    }

    public void onUsernameField(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}

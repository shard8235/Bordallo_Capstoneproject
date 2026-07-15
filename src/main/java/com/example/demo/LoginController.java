package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassword;

    @FXML
    void login(ActionEvent event) {

        if (txtUsername.getText().equals("admin")
                && txtPassword.getText().equals("admin")) {

            try {

                FXMLLoader fxmlLoader = new FXMLLoader(
                        getClass().getResource("dashboard-view.fxml"));

                Scene scene = new Scene(fxmlLoader.load());

                Stage stage = (Stage) txtUsername.getScene().getWindow();
                stage.setScene(scene);
                stage.setTitle("Hotel Reservation System");
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Username or Password!");
            alert.showAndWait();

        }

    }

    @FXML
    void clearInputs(ActionEvent event) {

        txtUsername.clear();
        txtPassword.clear();

    }
}

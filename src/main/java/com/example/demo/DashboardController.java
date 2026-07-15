package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Button btnLogout;

    @FXML
    void bookingHistory(ActionEvent event) {

        new Alert(Alert.AlertType.INFORMATION,
                "Booking History feature coming soon!")
                .showAndWait();

    }

    @FXML
    void availableRooms(ActionEvent event) {

        new Alert(Alert.AlertType.INFORMATION,
                "Available Rooms feature coming soon!")
                .showAndWait();

    }

    @FXML
    void createReservation(ActionEvent event) {

        new Alert(Alert.AlertType.INFORMATION,
                "Create Reservation feature coming soon!")
                .showAndWait();

    }

    @FXML
    void logout(ActionEvent event) {

        try {

            FXMLLoader fxmlLoader = new FXMLLoader(
                    getClass().getResource("login-view.fxml"));

            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage) btnLogout.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Login");
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

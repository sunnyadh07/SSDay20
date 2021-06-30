package com.sunnyadhikari.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private TextField lastNameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField studentIDField;
    @FXML
    private Button submitButton;

    @FXML
    private void onSubmit(ActionEvent actionEvent) {
        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION,"User created", "Welcome, " + nameField.getText());
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("User Created");
        alert.setContentText("Welcome, " + nameField.getText());
        alert.setHeaderText(null);
        alert.show();
    }
}

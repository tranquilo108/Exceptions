package com.example.hw3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class WritePersonController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button writeButton;
    @FXML
    private TextField dateField;

    @FXML
    private TextField nameField;

    @FXML
    private TextField phoneField;

    @FXML
    private ToggleGroup sex;
    @FXML
    private Text dateEx;

    @FXML
    private Text nameEx;
    @FXML
    private Text phoneEx;

    @FXML
    void UnlockWriteBun(ActionEvent event) {
        writeButton.setDisable(false);
    }

    @FXML
    void onWriteClick(ActionEvent event) {
        clearExceptions();
        boolean data = true;
        Parser parser = new Parser();
        Person person = parser.getData(nameField.getText(), phoneField.getText(), dateField.getText(),
                sex.getSelectedToggle().getUserData().toString());


        if (person.getName().split(": ")[0].equals("Error")) {
            nameEx.setText(person.getName());
            data = false;
        }
        if (person.getPhone().split(": ")[0].equals("Error")) {
            phoneEx.setText(person.getPhone());
            data = false;
        }
        if (person.getDate().split(": ")[0].equals("Error")) {
            dateEx.setText(person.getDate());
            data = false;
        }

        if (data) {
            String path = person.getName().split(" ")[0] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path, true)) {
                fileWriter.write(person.toString());
                Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                successAlert.setTitle("Успешно");
                successAlert.setHeaderText("Информация успешно записана в файл");
                successAlert.showAndWait();
            } catch (IOException e) {
                Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                errorAlert.setTitle("Ошибка");
                errorAlert.setHeaderText("Ошибка записи в файл");
                errorAlert.setContentText("При записи в файл произошла ошибка:\n" + Arrays.toString(e.getStackTrace()));
                errorAlert.showAndWait();
            }
        }
    }

    void clearExceptions() {
        nameEx.setText("");
        phoneEx.setText("");
        dateEx.setText("");
    }
}
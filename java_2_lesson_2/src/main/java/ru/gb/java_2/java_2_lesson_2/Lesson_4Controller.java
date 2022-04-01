package ru.gb.java_2.java_2_lesson_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Lesson_4Controller {

    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;

    @FXML
    private void pushButtonToSend(ActionEvent actionEvent) {
       final String text = messageField.getText();
       if (text.isEmpty()) {
           return;
       }
       messageArea.appendText(text + "\n");
       messageField.clear();
       messageField.requestFocus();

    }

}
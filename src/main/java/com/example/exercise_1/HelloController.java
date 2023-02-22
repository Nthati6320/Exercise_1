package com.example.exercise_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField textfield;
    private  int number = 0;

    @FXML
    void Decrease(ActionEvent event) {
        number--;
        textfield.setText("" + number);


    }

    @FXML
    void Increase(ActionEvent event) {
        number++;
        textfield.setText("" + number);


    }

}

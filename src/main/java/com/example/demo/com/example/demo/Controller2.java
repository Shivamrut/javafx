package com.example.demo;



//07
import javafx.fxml.FXML;
import javafx.scene.control.Label;
public class Controller2 {
    @FXML
    private Label label_name;

    public void displayName(String username)
    {
        label_name.setText("Hello "+ username);
    }

}

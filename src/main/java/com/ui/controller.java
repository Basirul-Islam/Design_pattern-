package com.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;
public class controller implements Initializable {
    @FXML
    Button Select_file;
    @FXML
    Label path;
    @FXML
    ComboBox choose_file;
    @FXML
    Button convert_file;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choose_file.getItems().addAll("CSV", "Jason", "XML");
    }
    public void print(ActionEvent event){
        System.out.println("it works");
    }
}

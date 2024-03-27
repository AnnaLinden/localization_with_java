package com.example.localised_hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {
    //@FXML
    //private Label welcomeText;
    @FXML
    private Button firstButton, secondButton, thirdButton;
    @FXML
    private Label nameLabel;



    private ResourceBundle bundle;

    private void loadLanguage(String lang, String country){
        Locale locale = new Locale (lang, country);
        bundle = ResourceBundle.getBundle("messages",locale);
       // welcomeText.setText(bundle.getString("greeting"));
        firstButton.setText(bundle.getString("firstButton"));
        secondButton.setText(bundle.getString("secondButton"));
        thirdButton.setText(bundle.getString("thirdButton"));
        nameLabel.setText(bundle.getString("nameLabel"));

    }

    @FXML
    protected void onHelloButtonClick() {
        //welcomeText.setText("Welcome to JavaFX Application!");
        loadLanguage("en", "EN");
    }

    public void onbtnFRClick(ActionEvent actionEvent) {
        loadLanguage("fr", "FR");
    }

    public void onbtnENClick(ActionEvent actionEvent){
        loadLanguage("en", "EN");
    }

    public void onbtnFAClick(ActionEvent actionEvent) {
        loadLanguage("fa", "FA");
    }

    public void onbtnJPClick(ActionEvent actionEvent) {
        loadLanguage("jp", "JP");
    }
}
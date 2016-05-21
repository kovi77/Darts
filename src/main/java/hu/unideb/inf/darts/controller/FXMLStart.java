/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class.
 * @author Ak
 */
public class FXMLStart {

    @FXML
    private Button loginButton;
    @FXML
    private Button registrationButton;

    @FXML
    private void loginAction(ActionEvent event) throws IOException {
        MainApp.stage = (Stage) loginButton.getScene().getWindow();
        MainApp.setLoader(new FXMLLoader(getClass().getResource("/fxml/loginScene.fxml")));
        MainApp.setRoot(MainApp.getLoader().load());
        MainApp.getLoader().<FXMLGameOnScene>getController();
        MainApp.setScene(new Scene(MainApp.getRoot()));
        MainApp.stage.setScene(MainApp.getScene());
        MainApp.stage.show();
    }

    @FXML
    private void registrationAction(ActionEvent event) throws IOException {
        MainApp.stage = (Stage) registrationButton.getScene().getWindow();
        MainApp.setLoader(new FXMLLoader(getClass().getResource("/fxml/registrationScene.fxml")));
        MainApp.setRoot(MainApp.getLoader().load());
        MainApp.getLoader().<FXMLGameOnScene>getController();
        MainApp.setScene(new Scene(MainApp.getRoot()));
        MainApp.stage.setScene(MainApp.getScene());
        MainApp.stage.show();
    }
    
}

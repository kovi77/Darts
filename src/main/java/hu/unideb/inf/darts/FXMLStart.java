/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import hu.unideb.inf.darts.MainApp;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
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
        MainApp.loader = new FXMLLoader(getClass().getResource("/fxml/loginScene.fxml"));
        MainApp.root = MainApp.loader.load();
        MainApp.loader.<FXMLGameOnScene>getController();
        MainApp.scene = new Scene(MainApp.root);
        MainApp.stage.setScene(MainApp.scene);
        MainApp.stage.show();
    }

    @FXML
    private void registrationAction(ActionEvent event) throws IOException {
        MainApp.stage = (Stage) registrationButton.getScene().getWindow();
        MainApp.loader = new FXMLLoader(getClass().getResource("/fxml/registrationScene.fxml"));
        MainApp.root = MainApp.loader.load();
        MainApp.loader.<FXMLGameOnScene>getController();
        MainApp.scene = new Scene(MainApp.root);
        MainApp.stage.setScene(MainApp.scene);
        MainApp.stage.show();
    }
    
}

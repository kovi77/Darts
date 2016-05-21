/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts.controller;

import hu.unideb.inf.darts.manager.CreateFolder;
import hu.unideb.inf.darts.manager.Login;
import hu.unideb.inf.darts.manager.Reader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.xml.bind.JAXBException;
import org.xml.sax.SAXException;

/**
 * FXML Controller class.
 * @author Ak
 */
public class FXMLLogin implements Initializable {

    @FXML
    private TextField userTextField1;
    @FXML
    private TextField userTextField2;
    @FXML
    private Button loginButton;
    @FXML
    private Label plsFillLabel;

    private Reader r = new Reader();
    private CreateFolder cf = new CreateFolder();
    private Login l = new Login();
    @FXML
    private Button backButton;

    @FXML
    private void loginAction(ActionEvent event) throws IOException, SAXException, JAXBException {
        cf.create();
        r.read();
        l.login(userTextField1.getText(), userTextField2.getText());
        plsFillLabel.setText(l.getInvalidName());
        if (l.isCheck1()) {
            MainApp.stage = (Stage) loginButton.getScene().getWindow();
            MainApp.setLoader(new FXMLLoader(getClass().getResource("/fxml/optionsScene.fxml")));
            MainApp.setRoot(MainApp.getLoader().load());
            MainApp.getLoader().<FXMLOptions>getController();
            MainApp.setScene(new Scene(MainApp.getRoot()));
            MainApp.stage.setScene(MainApp.getScene());
            MainApp.stage.show();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userTextField1.setText("A");
        userTextField2.setText("B");
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        MainApp.stage = (Stage) backButton.getScene().getWindow();
        MainApp.setLoader(new FXMLLoader(getClass().getResource("/fxml/start.fxml")));
        MainApp.setRoot(MainApp.getLoader().load());
        MainApp.getLoader().<FXMLOptions>getController();
        MainApp.setScene(new Scene(MainApp.getRoot()));
        MainApp.stage.setScene(MainApp.getScene());
        MainApp.stage.show();
    }
}

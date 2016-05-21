/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import hu.unideb.inf.darts.CreateFolder;
import hu.unideb.inf.darts.MainApp;
import hu.unideb.inf.darts.Reader;
import hu.unideb.inf.darts.Registration;
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
 *
 * @author Ak
 */
public class FXMLRegistration implements Initializable {

    @FXML
    private Button registrationButton;
    @FXML
    private Label msgLabel;
    @FXML
    private TextField nameTextField;
    @FXML
    private Button backButton;
    Registration r = new Registration();
    private Reader rd = new Reader();
    private CreateFolder cf = new CreateFolder();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        msgLabel.setText("");
    }

    @FXML
    private void registrationAction(ActionEvent event) throws SAXException, JAXBException, IOException {
        r.registration(nameTextField.getText());
        msgLabel.setText(r.getInvalidName());
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        MainApp.stage = (Stage) backButton.getScene().getWindow();
        MainApp.loader = new FXMLLoader(getClass().getResource("/fxml/start.fxml"));
        MainApp.root = MainApp.loader.load();
        MainApp.loader.<FXMLOptions>getController();
        MainApp.scene = new Scene(MainApp.root);
        MainApp.stage.setScene(MainApp.scene);
        MainApp.stage.show();
    }

}

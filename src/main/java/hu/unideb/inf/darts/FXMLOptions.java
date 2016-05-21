/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import hu.unideb.inf.darts.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import org.slf4j.LoggerFactory;

/**
 * FXML Controller class.
 *
 * @author Ak
 */
public class FXMLOptions implements Initializable {

    
    @FXML
    private RadioButton radio301;
    @FXML
    private RadioButton radio501;
    @FXML
    private RadioButton startPlayer1;
    @FXML
    private RadioButton startPlayer2;
    @FXML
    private RadioButton legs2;
    @FXML
    private RadioButton legs3;
    @FXML
    private RadioButton legs4;
    @FXML
    private RadioButton legs5;
    @FXML
    private RadioButton legs6;
    @FXML
    private RadioButton legs7;
    @FXML
    private Button nextButton;

    final ToggleGroup groupScore = new ToggleGroup();
    final ToggleGroup groupStartPlayer = new ToggleGroup();
    final ToggleGroup groupLegs = new ToggleGroup();

    private String p1;// = Manager.darts.getPlayer1().getName();
    private String p2;// = Manager.darts.getPlayer2().getName();
    private String score;
    private String startPlayer;
    private String legs;
    private static ManagerImpl m = new ManagerImpl();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        p1 = m.player1.getName();
        p2 = m.player2.getName();
        radio301.setToggleGroup(groupScore);
        radio501.setToggleGroup(groupScore);
        radio301.setUserData("301");
        radio501.setUserData("501");
        groupScore.selectToggle(radio301);
        score = groupScore.getSelectedToggle().getUserData().toString();

        groupScore.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                if (groupScore.getSelectedToggle() != null) {
                    score = groupScore.getSelectedToggle().getUserData().toString();
                }
            }
        });

        startPlayer1.setToggleGroup(groupStartPlayer);
        startPlayer2.setToggleGroup(groupStartPlayer);
        startPlayer1.setUserData("Player1");
        startPlayer2.setUserData("Player2");
        startPlayer1.setText(p1);
        startPlayer2.setText(p2);
        groupStartPlayer.selectToggle(startPlayer1);
        startPlayer = groupStartPlayer.getSelectedToggle().getUserData().toString();

        groupStartPlayer.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                if (groupStartPlayer.getSelectedToggle() != null) {
                    startPlayer = groupStartPlayer.getSelectedToggle().getUserData().toString();
                }
            }
        });

        legs2.setToggleGroup(groupLegs);
        legs3.setToggleGroup(groupLegs);
        legs4.setToggleGroup(groupLegs);
        legs5.setToggleGroup(groupLegs);
        legs6.setToggleGroup(groupLegs);
        legs7.setToggleGroup(groupLegs);
        legs2.setUserData("2");
        legs3.setUserData("3");
        legs4.setUserData("4");
        legs5.setUserData("5");
        legs6.setUserData("6");
        legs7.setUserData("7");
        groupLegs.selectToggle(legs2);
        legs = groupLegs.getSelectedToggle().getUserData().toString();

        groupLegs.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            public void changed(ObservableValue<? extends Toggle> ov, Toggle old_toggle, Toggle new_toggle) {
                if (groupLegs.getSelectedToggle() != null) {
                    legs = groupLegs.getSelectedToggle().getUserData().toString();
                }
            }
        });
    }

    @FXML
    private void nextButtonAction(ActionEvent event) throws IOException {
        m.setPlayer(startPlayer,m.getPlayer1(),m.getPlayer2(),m.getDarts());
        m.options(score,m.getDarts());
        m.setLeg(legs,m.getDarts());

        MainApp.stage = (Stage) nextButton.getScene().getWindow();
        MainApp.loader = new FXMLLoader(getClass().getResource("/fxml/gameOnScene.fxml"));
        MainApp.root = MainApp.loader.load();
        MainApp.loader.<FXMLGameOnScene>getController();
        MainApp.scene = new Scene(MainApp.root);
        MainApp.stage.setScene(MainApp.scene);
        MainApp.stage.show();
    }

}

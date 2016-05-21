/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts.controller;

import hu.unideb.inf.darts.model.Darts;
import hu.unideb.inf.darts.model.Darts;
import hu.unideb.inf.darts.manager.ManagerImpl;
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
import javafx.scene.shape.Rectangle;

/**
 * FXML Controller class.
 *
 * @author Ak
 */
public class FXMLGameOnScene implements Initializable {

    @FXML
    private Button simple1;
    @FXML
    private Button simple2;
    @FXML
    private Button simple3;
    @FXML
    private Button simple4;
    @FXML
    private Button simple5;
    @FXML
    private Button simple6;
    @FXML
    private Button simple7;
    @FXML
    private Button simple8;
    @FXML
    private Button simple9;
    @FXML
    private Button simple10;
    @FXML
    private Button simple11;
    @FXML
    private Button simple12;
    @FXML
    private Button simple13;
    @FXML
    private Button simple14;
    @FXML
    private Button simple15;
    @FXML
    private Button simple16;
    @FXML
    private Button simple17;
    @FXML
    private Button simple18;
    @FXML
    private Button simple19;
    @FXML
    private Button simple20;
    @FXML
    private Button bull;
    @FXML
    private Button bulleye;
    @FXML
    private Button bust;
    @FXML
    private Button double1;
    @FXML
    private Button double2;
    @FXML
    private Button double3;
    @FXML
    private Button double4;
    @FXML
    private Button double5;
    @FXML
    private Button double6;
    @FXML
    private Button double7;
    @FXML
    private Button double8;
    @FXML
    private Button double9;
    @FXML
    private Button double10;
    @FXML
    private Button double11;
    @FXML
    private Button double12;
    @FXML
    private Button double13;
    @FXML
    private Button double14;
    @FXML
    private Button double15;
    @FXML
    private Button double16;
    @FXML
    private Button double17;
    @FXML
    private Button double18;
    @FXML
    private Button double19;
    @FXML
    private Button double20;
    @FXML
    private Button triple1;
    @FXML
    private Button triple2;
    @FXML
    private Button triple3;
    @FXML
    private Button triple4;
    @FXML
    private Button triple5;
    @FXML
    private Button triple6;
    @FXML
    private Button triple7;
    @FXML
    private Button triple8;
    @FXML
    private Button triple9;
    @FXML
    private Button triple10;
    @FXML
    private Button triple11;
    @FXML
    private Button triple12;
    @FXML
    private Button triple13;
    @FXML
    private Button triple14;
    @FXML
    private Button triple15;
    @FXML
    private Button triple16;
    @FXML
    private Button triple17;
    @FXML
    private Button triple18;
    @FXML
    private Button triple19;
    @FXML
    private Button triple20;
    @FXML
    private Label score1;
    @FXML
    private Label score2;
    @FXML
    private Label player1;
    @FXML
    private Label player2;
    @FXML
    private Rectangle rec1;
    @FXML
    private Rectangle rec2;

    private ManagerImpl m = new ManagerImpl();
    private Darts darts = m.getDarts();
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        player1.setText(darts.getPlayer1().getName());
        player2.setText(darts.getPlayer2().getName());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
    }

    private void nextScene() throws IOException {
        //MainApp.stage = (Stage) button.getScene().getWindow();
        MainApp.setLoader(new FXMLLoader(getClass().getResource("/fxml/resultsScene.fxml")));
        MainApp.setRoot(MainApp.getLoader().load());
        MainApp.getLoader().<FXMLOptions>getController();
        MainApp.setScene(new Scene(MainApp.getRoot()));
        MainApp.stage.setScene(MainApp.getScene());
        MainApp.stage.show();
    }

    @FXML
    private void simple1Action(ActionEvent event) throws IOException {
        m.calc(1, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple2Action(ActionEvent event) throws IOException {
        m.calc(2, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple3Action(ActionEvent event) throws IOException {
        m.calc(3, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple4Action(ActionEvent event) throws IOException {
        m.calc(4, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple5Action(ActionEvent event) throws IOException {
        m.calc(5, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple6Action(ActionEvent event) throws IOException {
        m.calc(6, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple7Action(ActionEvent event) throws IOException {
        m.calc(7, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple8Action(ActionEvent event) throws IOException {
        m.calc(8, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple9Action(ActionEvent event) throws IOException {
        m.calc(9, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple10Action(ActionEvent event) throws IOException {

        m.calc(10, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple11Action(ActionEvent event) throws IOException {

        m.calc(11, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple12Action(ActionEvent event) throws IOException {

        m.calc(12, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple13Action(ActionEvent event) throws IOException {

        m.calc(13, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple14Action(ActionEvent event) throws IOException {

        m.calc(14, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple15Action(ActionEvent event) throws IOException {

        m.calc(15, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple16Action(ActionEvent event) throws IOException {

        m.calc(16, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple17Action(ActionEvent event) throws IOException {

        m.calc(17, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple18Action(ActionEvent event) throws IOException {

        m.calc(18, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple19Action(ActionEvent event) throws IOException {

        m.calc(19, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void simple20Action(ActionEvent event) throws IOException {

        m.calc(20, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void bullAction(ActionEvent event) throws IOException {

        m.calc(25, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void bulleyeAction(ActionEvent event) throws IOException {

        m.calc(50, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void bustAction(ActionEvent event) throws IOException {

        m.calc(0, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double1Action(ActionEvent event) throws IOException {

        m.calc(2, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double2Action(ActionEvent event) throws IOException {

        m.calc(4, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double3Action(ActionEvent event) throws IOException {

        m.calc(6, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double4Action(ActionEvent event) throws IOException {

        m.calc(8, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double5Action(ActionEvent event) throws IOException {

        m.calc(10, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double6Action(ActionEvent event) throws IOException {

        m.calc(12, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double7Action(ActionEvent event) throws IOException {

        m.calc(14, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double8Action(ActionEvent event) throws IOException {

        m.calc(16, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double9Action(ActionEvent event) throws IOException {

        m.calc(18, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double10Action(ActionEvent event) throws IOException {

        m.calc(20, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double11Action(ActionEvent event) throws IOException {

        m.calc(22, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double12Action(ActionEvent event) throws IOException {

        m.calc(24, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double13Action(ActionEvent event) throws IOException {

        m.calc(26, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double14Action(ActionEvent event) throws IOException {

        m.calc(28, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double15Action(ActionEvent event) throws IOException {

        m.calc(30, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double16Action(ActionEvent event) throws IOException {

        m.calc(32, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double17Action(ActionEvent event) throws IOException {

        m.calc(34, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double18Action(ActionEvent event) throws IOException {

        m.calc(36, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double19Action(ActionEvent event) throws IOException {

        m.calc(38, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void double20Action(ActionEvent event) throws IOException {

        m.calc(40, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple1Action(ActionEvent event) throws IOException {

        m.calc(3, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple2Action(ActionEvent event) throws IOException {

        m.calc(6, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple3Action(ActionEvent event) throws IOException {

        m.calc(9, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple4Action(ActionEvent event) throws IOException {

        m.calc(12, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple5Action(ActionEvent event) throws IOException {

        m.calc(15, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple6Action(ActionEvent event) throws IOException {

        m.calc(18, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple7Action(ActionEvent event) throws IOException {

        m.calc(21, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple8Action(ActionEvent event) throws IOException {

        m.calc(24, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple9Action(ActionEvent event) throws IOException {

        m.calc(27, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple10Action(ActionEvent event) throws IOException {

        m.calc(30, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple11Action(ActionEvent event) throws IOException {

        m.calc(33, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple12Action(ActionEvent event) throws IOException {

        m.calc(36, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple13Action(ActionEvent event) throws IOException {

        m.calc(39, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple14Action(ActionEvent event) throws IOException {

        m.calc(42, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple15Action(ActionEvent event) throws IOException {

        m.calc(45, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple16Action(ActionEvent event) throws IOException {

        m.calc(48, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple17Action(ActionEvent event) throws IOException {

        m.calc(51, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple18Action(ActionEvent event) throws IOException {

        m.calc(54, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void triple19Action(ActionEvent event) throws IOException {

        m.calc(57, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

    @FXML
    private void tripl20Action(ActionEvent event) throws IOException {

        m.calc(60, m.getDarts());
        score1.setText(Integer.toString(darts.getPlayer1().getScore()));
        score2.setText(Integer.toString(darts.getPlayer2().getScore()));
        rec1.setOpacity(m.getOp1());
        rec2.setOpacity(m.getOp2());
        if (m.getWin()) {
            nextScene();
        }
    }

}

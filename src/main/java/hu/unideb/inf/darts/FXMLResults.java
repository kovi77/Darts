/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.unideb.inf.darts;

import hu.unideb.inf.darts.Darts;
import hu.unideb.inf.darts.MainApp;
import hu.unideb.inf.darts.Writer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
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
import javafx.stage.Stage;
import javax.xml.bind.JAXBException;
import org.slf4j.LoggerFactory;

/**
 * FXML Controller class.
 *
 * @author Ak
 */
public class FXMLResults implements Initializable {

    @FXML
    private Label nameP1;
    @FXML
    private Label nameP2;
    @FXML
    private Label matchesP1;
    @FXML
    private Label avgP1;
    @FXML
    private Label highScoreP1;
    @FXML
    private Label counter1P1;
    @FXML
    private Label counter2P1;
    @FXML
    private Label counter3P1;
    @FXML
    private Label matchesP2;
    @FXML
    private Label avgP2;
    @FXML
    private Label highScoreP2;
    @FXML
    private Label counter2P2;
    @FXML
    private Label counter3P2;

    @FXML
    private Label counter1P2;

    private static Writer writer = new Writer();

    private ManagerImpl m = new ManagerImpl();
    private Darts darts = m.getDarts();

    @FXML
    private Button newGame;
    @FXML
    private Rectangle rec1;
    @FXML
    private Rectangle rec2;
    @FXML
    private Label matchesP11;
    @FXML
    private Label matchesP21;
    
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(FXMLResults.class);
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        if (m.getWinner1() > m.getWinner2()) {
            logger.info("1.Játékos nyert");
            rec2.setOpacity(0.2);
        }
        if (m.getWinner1() < m.getWinner2()) {
            logger.info("2.Játékos nyert");
            rec1.setOpacity(0.2);
        }
        m.setResults(m.getDarts());
        nameP1.setText(darts.getPlayer1().getName());
        nameP2.setText(darts.getPlayer2().getName());
        matchesP11.setText(Integer.toString(darts.getPlayer1().getMatches()));
        matchesP21.setText(Integer.toString(darts.getPlayer2().getMatches()));
        matchesP1.setText(Integer.toString(darts.getPlayer1().getWonMatches()));
        matchesP2.setText(Integer.toString(darts.getPlayer2().getWonMatches()));
        avgP1.setText(Double.toString(darts.getPlayer1().getAvg()));
        avgP2.setText(Double.toString(darts.getPlayer2().getAvg()));
        highScoreP1.setText(Double.toString(darts.getPlayer1().getHighScore()));
        highScoreP2.setText(Double.toString(darts.getPlayer2().getHighScore()));
        counter1P1.setText(Integer.toString(darts.getPlayer1().getCounter1()));
        counter1P2.setText(Integer.toString(darts.getPlayer2().getCounter1()));
        counter2P1.setText(Integer.toString(darts.getPlayer1().getCounter2()));
        counter2P2.setText(Integer.toString(darts.getPlayer2().getCounter2()));
        counter3P1.setText(Integer.toString(darts.getPlayer1().getCounter3()));
        counter3P2.setText(Integer.toString(darts.getPlayer2().getCounter3()));

    }

    @FXML
    private void newGameAction(ActionEvent event) throws JAXBException, FileNotFoundException, IOException, URISyntaxException {
        writer.write();
        logger.info("Új játék");
        MainApp.stage = (Stage) newGame.getScene().getWindow();
        MainApp.loader = new FXMLLoader(getClass().getResource("/fxml/optionsScene.fxml"));
        MainApp.root = MainApp.loader.load();
        MainApp.loader.<FXMLOptions>getController();
        MainApp.scene = new Scene(MainApp.root);
        MainApp.stage.setScene(MainApp.scene);
        MainApp.stage.show();
    }

    @FXML
    private void exitAction(ActionEvent event) throws JAXBException, FileNotFoundException, URISyntaxException {
        writer.write();
        MainApp.stage.close();
    }

}

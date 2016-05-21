/**
 * hu.unideb.inf.darts csomag magában tartalmazza a működéshez szükséges fájlokat.
 */
package hu.unideb.inf.darts;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ak
 */
public class MainApp extends Application {

    /**
     * stage.
     */
    public static Stage stage;
    //ne statikusak legyenek

    /**
     * root.
     */
    public static Parent root;

    /**
     * loader.
     */
    public static FXMLLoader loader;

    /**
     * scene.
     */
    public static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("/fxml/start.fxml"));

        scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");

        stage.setTitle("DARTS SCOREBOARD");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application. main() serves only as fallback in case the application can not be launched through
     * deployment artifacts, e.g., in IDEs with limited FX support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args){
        launch(args);
    }

}

/**
 * hu.unideb.inf.darts csomag magában tartalmazza a működéshez szükséges fájlokat.
 */
package hu.unideb.inf.darts.controller;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * A {@code Darts} játék Main osztálya.
 * @author Ak
 */
public class MainApp extends Application {

    /**
     * Stage.
     */
    public static Stage stage;

    /**
     * Root.
     */
    private static Parent root;

    /**
     * Loader.
     */
    private static FXMLLoader loader;

    /**
     * Scene.
     */
    private static Scene scene;

    /**
     * @return the root
     */
    public static Parent getRoot() {
        return root;
    }

    /**
     * @param aRoot the root to set
     */
    public static void setRoot(Parent aRoot) {
        root = aRoot;
    }

    /**
     * @return the loader
     */
    public static FXMLLoader getLoader() {
        return loader;
    }

    /**
     * @param aLoader the loader to set
     */
    public static void setLoader(FXMLLoader aLoader) {
        loader = aLoader;
    }

    /**
     * @return the scene
     */
    public static Scene getScene() {
        return scene;
    }

    /**
     * @param aScene the scene to set
     */
    public static void setScene(Scene aScene) {
        scene = aScene;
    }

    @Override
    public void start(Stage stage) throws Exception {
        setRoot(FXMLLoader.load(getClass().getResource("/fxml/start.fxml")));

        setScene(new Scene(getRoot()));
        getScene().getStylesheets().add("/styles/Styles.css");

        stage.setTitle("DARTS SCOREBOARD");
        stage.setScene(getScene());
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

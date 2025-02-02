package uk.ac.soton.comp2211;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import uk.ac.soton.comp2211.ui.Window;

/**
 * JavaFX Application class
 */
public class App extends Application {

    /**
     * Base resolution width
     */
    private final int width = 800;

    /**
     * Base resolution height
     */
    private final int height = 600;

    private static App instance;
    private Stage stage;

    /**
     * Start the application
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        launch();
    }

    /**
     * Called by JavaFX with the primary stage as a parameter. Begins the application
     * @param stage the default stage, main window
     */
    @Override
    public void start(Stage stage) {
        instance = this;
        this.stage = stage;
        openApp();
    }

    /**
     * Create the application Window with the specified width and height
     */
    public void openApp() {

        //Change the width and height in this class to change the base rendering resolution for all parts
        var runwayWindow = new Window(stage,width,height);
        //Display the Window
        stage.show();
    }

    /**
     * Shutdown the app
     */
    public void shutdown() {
        System.exit(0);
    }

    /**
     * Get the singleton App instance
     * @return the app
     */
    public static App getInstance() {
        return instance;
    }

}
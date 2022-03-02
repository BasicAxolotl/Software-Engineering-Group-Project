package uk.ac.soton.comp2211;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

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
     * Start the game
     * @param args commandline arguments
     */
    public static void main(String[] args) {
        launch();
    }

    /**
     * Called by JavaFX with the primary stage as a parameter. Begins the game by opening the Game Window
     * @param stage the default stage, main window
     */
    @Override
    public void start(Stage stage) {
        instance = this;
        this.stage = stage;

        //Open game window
        openGame();
    }

    /**
     * Create the GameWindow with the specified width and height
     */
    public void openGame() {

        //Change the width and height in this class to change the base rendering resolution for all game parts
        var sp = new StackPane(new ImageView("https://pbs.twimg.com/media/ESUotm-U8AAqvYe.jpg"));
        var gameWindow = new Scene(sp,800,600);
        stage.setScene(gameWindow);
        //Display the GameWindow
        stage.show();
    }

    /**
     * Shutdown the game
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
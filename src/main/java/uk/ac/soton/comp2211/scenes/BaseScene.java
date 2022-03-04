package uk.ac.soton.comp2211.scenes;

import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import uk.ac.soton.comp2211.ui.Window;

/**
 * A Base Scene used in the system. Handles common functionality between all scenes.
 */
public abstract class  BaseScene {

    protected final Window window;

    protected StackPane root;
    protected Scene scene;

    /**
     * Create a new scene, passing in the Window the scene will be displayed in
     * @param window the Window
     */
    public BaseScene(Window window) {
        this.window = window;
    }

    /**
     * Initialise this scene. Called after creation
     */
    public abstract void initialise();

    /**
     * Build the layout of the scene
     */
    public abstract void build();

    /**
     * Create a new JavaFX scene using the root contained within this scene
     * @return JavaFX scene
     */
    public Scene setScene() {
        var previous = window.getScene();
        Scene scene = new Scene(root, previous.getWidth(), previous.getHeight(), Color.BLACK);
        this.scene = scene;
        return scene;
    }

    /**
     * Get the JavaFX scene contained inside
     * @return JavaFX scene
     */
    public Scene getScene() {
        return this.scene;
    }

}


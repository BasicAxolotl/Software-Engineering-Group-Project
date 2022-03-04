package uk.ac.soton.comp2211.scenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import uk.ac.soton.comp2211.scenes.BaseScene;
import uk.ac.soton.comp2211.ui.Window;

public class MenuScene extends BaseScene {

    /**
     * Create a new Menu scene, passing in the Window the scene will be displayed in
     *
     * @param window the Window
     */
    public MenuScene(Window window) {
        super(window);
    }

    @Override
    public void initialise() {
    }

    @Override
    public void build() {
        root = new StackPane();
        var foreground = new VBox();
        foreground.getChildren().add(new ImageView("https://images.all-free-download.com/images/graphiclarge/airport_runway_top_view_clip_art_19866.jpg"));
        var button1 = new Button("Add Obstacle");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                window.startObstacleScene();
            }
        });
        foreground.getChildren().add(button1);
        foreground.setAlignment(Pos.CENTER);
        this.root.getChildren().add(foreground);
    }
}

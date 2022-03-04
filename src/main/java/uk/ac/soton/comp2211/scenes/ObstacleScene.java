package uk.ac.soton.comp2211.scenes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import uk.ac.soton.comp2211.ui.Window;

public class ObstacleScene extends BaseScene{

    public ObstacleScene(Window window) {
        super(window);
    }

    @Override
    public void initialise() {

    }

    @Override
    public void build() {
        root = new StackPane();
        var tf1 = new TextField();
        var tf2 = new TextField();
        var tf3 = new TextField();
        var tf4 = new TextField();
        var middle1 = new HBox(new TextFlow(new Text("Obstacle name")), tf1);
        middle1.setAlignment(Pos.CENTER);
        var middle2 = new HBox(new TextFlow(new Text("Obstacle width (m)")), tf2);
        middle2.setAlignment(Pos.CENTER);
        var middle3 = new HBox(new TextFlow(new Text("Obstacle height (m)")), tf3);
        middle3.setAlignment(Pos.CENTER);
        var middle4 = new HBox(new TextFlow(new Text("Obstacle description")), tf4);
        middle4.setAlignment(Pos.CENTER);
        var button1 = new Button("Add Obstacle");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                window.startMenu();
            }
        });
        var foreground = new VBox(middle1,middle2,middle3,middle4,button1);
        foreground.setAlignment(Pos.CENTER);
        this.root.getChildren().add(foreground);
    }
}

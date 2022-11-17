package pack1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {
 
    // launch the application
    public void start(Stage s)
    {
        // set title for the stage
        s.setTitle("Pr6");
 
        // create a textfield
        TextField b = new TextField("Enter Name");
 
        // set preferred column count
        b.setPrefColumnCount(7);
        
        // create a tile pane
        TilePane r = new TilePane();
 
        // create a label
        Label l = new Label("Your Name");
 
        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                l.setText(b.getText());
            }
        };
 
        // when enter is pressed
        b.setOnAction(event);
 
        // add textfield
        r.getChildren().add(b);
        r.getChildren().add(l);
 
        // create a scene
        Scene sc = new Scene(r, 200, 200);
 
        // set the scene
        s.setScene(sc);
 
        s.show();
    }
 
    public static void main(String args[])
    {
        // launch the application
        launch(args);
    }
}
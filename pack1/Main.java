package pack1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

 public class Main extends Application 
{
//Start
 public void start(Stage s)
{
//Title
 s.setTitle("Pr6"); 
//TextField
 TextField b = new TextField("Enter Name");
 b.setPrefColumnCount(7);       
//TilePane
 TilePane r = new TilePane();
//Label
 Label l = new Label("Your Name"); 
 //ActionEvent
 EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() 
{
 public void handle(ActionEvent e)
{
 l.setText(b.getText());
}
};
//Enter Key ActionEvent
 b.setOnAction(event);
//Adding TextField
 r.getChildren().add(b);
 r.getChildren().add(l);
//Scene
 Scene sc = new Scene(r, 200, 200);
 s.setScene(sc);
 s.show();
} 
 public static void main(String args[])
{
//Launch
 launch(args);
}
 }

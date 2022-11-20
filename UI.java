package pack1;

import javafx.application.Application; 
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.Pane; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 

//Start
public class UI extends Application 
{ 
Pane p; 
public static void main(String[] args) 
{ 
launch(args); 
} 
public void start(Stage stage) 
{ 
//Pane
p = new Pane(); 
p.setMinSize(400, 325); 
p.setBackground(new Background(new BackgroundFill( Color.rgb(255, 255, 255), null, null) )); 
//Horizontal Box 
HBox hb = new HBox(); 
hb.setMinSize(100, 50); 
hb.setPadding(new Insets(10,10,10,10)); 
hb.setSpacing(7); 
hb.setBackground(new Background(new BackgroundFill( Color.rgb(255, 255, 255), null, null) )); 
//Vertical Box 
VBox vb = new VBox(); 
vb.setPadding(new Insets(15,15,15,15)); 
vb.setSpacing(15); 
 vb.setBackground(new Background(new BackgroundFill( Color.rgb(100, 100, 100), null, null) )); 
 vb.getChildren().addAll(p, hb); 

//Scene
Scene scene = new Scene(vb); 
stage.setScene(scene); 
stage.setTitle("Basic JavaFx Configuration"); 
stage.setWidth(500.0); 
stage.setHeight(440.0); 
stage.show(); 
} // End Start 
}
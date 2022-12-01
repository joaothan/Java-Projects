package p1;

import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets; 
import javafx.scene.Scene; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.Pane; 
import javafx.scene.layout.VBox;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color; 
import javafx.stage.Stage; 

//Start
public class main extends Application 
{ 
Pane p; 
public static void main(String[] args) 
{ 
launch(args); 
} 
public void start(Stage stage) 
{ 	
//Buttons
	RadioButton b1700 = new RadioButton("1700");
	RadioButton b1800 = new RadioButton("1800");
	RadioButton b1900 = new RadioButton("1900");
	RadioButton b2000 = new RadioButton("2000");
{
	//Dialog 1
		Dialog<String> dialog1 = new Dialog<String>();

	//Extras
		dialog1.setTitle("Tuning in to the 1700s");
		ButtonType type = new ButtonType("Ok", ButtonData.OK_DONE);
		dialog1.getDialogPane().getButtonTypes().add(type);
		
	//Content
		dialog1.setContentText("1752, Benjamin Franklin invents the Lighting Rod");

	//Button Controls
		 b1700.setOnAction(e -> 
{
	         dialog1.showAndWait();
}); 
}

{
	//Dialog 2
		Dialog<String> dialog2 = new Dialog<String>();

	//Extras
		dialog2.setTitle("Tuning in to the 1800s");
		ButtonType type2 = new ButtonType("Ok", ButtonData.OK_DONE);
		dialog2.getDialogPane().getButtonTypes().add(type2);
		
	//Content
		dialog2.setContentText("1841, Samuel Slocum invents the Stapler");

	//Button Controls
		b1800.setOnAction(e -> 
{
	       dialog2.showAndWait();
}); 
}

{
	//Dialog 3
		Dialog<String> dialog3 = new Dialog<String>();

	//Extras
		dialog3.setTitle("Tuning in to the 1900s");
		ButtonType type3 = new ButtonType("Ok", ButtonData.OK_DONE);
		dialog3.getDialogPane().getButtonTypes().add(type3);
			
	//Content
		dialog3.setContentText("1901, Mercedes invents the Gas-Powered Car");

	//Button Controls
		b1900.setOnAction(e -> 
{
		      dialog3.showAndWait();
}); 
}

{
	//Dialog 4
		Dialog<String> dialog4 = new Dialog<String>();

	//Extras
		dialog4.setTitle("Tuning in to the 2000s");
		ButtonType type4 = new ButtonType("Ok", ButtonData.OK_DONE);
		dialog4.getDialogPane().getButtonTypes().add(type4);
				
	//Content
		dialog4.setContentText("2007, Steve Jobs invents the IPhone");
		
	//Button Controls
		b2000.setOnAction(e -> 
{
			 dialog4.showAndWait();
}); 
}
	

//Image 
	Image img1 = new Image("C:\\Users\\Jonathan\\Downloads\\Radio.png");
	ImageView imgView = new ImageView();
	imgView = new ImageView(img1);
	imgView.setLayoutX(-10);
	imgView.setLayoutY(-40);
	imgView.setFitWidth(img1.getWidth()/ 2.75);
	imgView.setFitHeight(img1.getHeight()/ 2.75);
	
	
//Pane
p = new Pane(); 
p.setMinSize(300, 300); 
p.setBackground(new Background(new BackgroundFill( Color.rgb(255, 255, 255), null, null) )); 
p.getChildren().add(imgView);
//Horizontal Box 
HBox hb = new HBox(); 
hb.setMinSize(100, 50); 
hb.setPadding(new Insets(10,10,10,10)); 
hb.setSpacing(7); 
hb.setBackground(new Background(new BackgroundFill( Color.rgb(255, 255, 255), null, null) )); 
hb.getChildren().addAll(b1700, b1800, b1900, b2000);
//Vertical Box 
VBox vb = new VBox(); 
vb.setPadding(new Insets(15,15,15,15)); 
vb.setSpacing(15); 
 vb.setBackground(new Background(new BackgroundFill( Color.rgb(100, 100, 100), null, null) )); 
 vb.getChildren().addAll(p, hb); 

//Scene
Scene scene = new Scene(vb); 
stage.setScene(scene); 
stage.setTitle("Radio"); 
stage.setWidth(500.0); 
stage.setHeight(440.0); 
stage.show(); 
} // End Start 
}
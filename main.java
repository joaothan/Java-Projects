package p1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class main extends Application
{
	Pane p;
	Circle sonicCircle;
	Circle waspCircle;
	Circle powerCircle;
	Circle coinCircleL;
	Circle coinCircleR;
	
	
public static void main(String[] args) 
{
		launch(args);
}

public void start(Stage stage)
{
	
//Images
	Image bgImg = new Image("E:\\Final Project\\backgroundS.png");
	Image sonicImg = new Image("E:\\Final Project\\sonicR.png");
	Image waspImg = new Image("E:\\Final Project\\wasp.png");
	Image powerImg = new Image("E:\\Final Project\\power.png");
	Image coinImgL = new Image("E:\\Final Project\\coinL.png");
		
		
//Circles and Images
	sonicCircle = new Circle(25, 218, 20);
	sonicCircle.setStroke(null);
	sonicCircle.setFill(new ImagePattern(sonicImg));
		
	waspCircle = new Circle(230, 200, 35);
	waspCircle.setStroke(null);
	waspCircle.setFill(new ImagePattern(waspImg));
		
	powerCircle = new Circle(80, 218, 10);
	powerCircle.setStroke(null);
	powerCircle.setFill(new ImagePattern(powerImg));
		
	coinCircleL = new Circle(250, 220, 10);
	coinCircleL.setStroke(null);
	coinCircleL.setFill(new ImagePattern(coinImgL));
		
	coinCircleR = new Circle(215, 160, 10);
	coinCircleR.setStroke(null);
	coinCircleR.setFill(new ImagePattern(coinImgL));
		
//Pane and Background Image
	p = new Pane();
	p.setMinSize(400, 325);
	p.setBackground(new Background(new BackgroundFill( Color.rgb(190, 220, 190), null, null) ));
	p.getChildren().addAll(sonicCircle, waspCircle, powerCircle, coinCircleL, coinCircleR);
		
	 	BackgroundSize backgroundSize = new BackgroundSize(200, 155, true, true, true, false);
	 	BackgroundImage backgroundImage = new BackgroundImage(bgImg, 
			                                                  BackgroundRepeat.REPEAT, 
			                                                  BackgroundRepeat.NO_REPEAT, 
			                                                  BackgroundPosition.CENTER, 
			                                                  backgroundSize);
	 	p.setBackground(new Background(backgroundImage));
		
	 	
//Buttons
	 Button btnStart = new Button("Start");
	 btnStart.setFocusTraversable(false);
	 	
	 Button btnStop = new Button("Stop");
	 btnStop.setFocusTraversable(false);
	 	
	 Button btnLeft = new Button("Left");
	 btnLeft.setFocusTraversable(false);
	 	
	 Button btnRight = new Button("Right");
	 btnRight.setFocusTraversable(false);
	 	
	 	
//Timer
	 Timer t = new Timer(coinCircleL, coinCircleR);
	 	
//Button Controls
	 ButtonControls btnCtrls = new ButtonControls();
	 btnStart.setOnAction((ActionEvent e) -> {t.start(); });
	 btnStop.setOnAction((ActionEvent e) -> {t.stop(); });
	 btnLeft.setOnAction((ActionEvent e) -> { btnCtrls.Left(sonicCircle); });
	 btnRight.setOnAction((ActionEvent e) -> { btnCtrls.Right(sonicCircle); });
	 	
//Horizontal box for buttons
	HBox hb = new HBox();
	hb.setMinSize(100, 50);
	hb.setPadding(new Insets(10,10,10,10));
	hb.setSpacing(7);
	hb.setBackground(new Background(new BackgroundFill( Color.rgb(150, 200, 150), null, null) ));
	hb.getChildren().addAll(btnStart, btnStop, btnLeft, btnRight);
		
//Vertical box
	VBox vb = new VBox();
	vb.setPadding(new Insets(15,15,15,15));
	vb.setSpacing(15);
	vb.setBackground(new Background(new BackgroundFill( Color.rgb(100, 100, 100), null, null) ));
	vb.getChildren().addAll(p, hb);
		
//Scene
	Scene scene = new Scene(vb);
				
	scene.setOnKeyPressed(new EventHandler<KeyEvent>() 
{
public void handle(KeyEvent event) 
{
	switch (event.getCode()) 
{
	case UP:         					
		 btnCtrls.Up(sonicCircle); 
		 break;
	case DOWN:  
		 btnCtrls.Down(sonicCircle); 	
		 break;
	case RIGHT: 
		 btnCtrls.Right(sonicCircle);   	
		 break;		          	
	case LEFT:    
	     btnCtrls.Left(sonicCircle);
	     break;
		 default:			
// No default
		 break;
}  // end switch  	  	
			    	  	
} // end handle
}); // endOnkeyressed
				
		stage.setScene(scene);
					
		stage.setTitle("Sonic");
		stage.setWidth(500.0);
		stage.setHeight(440.0);
		stage.show();
	} // End Start
} // End MainClass
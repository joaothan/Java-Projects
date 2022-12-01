package p1;

import javafx.animation.AnimationTimer;
import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Timer extends AnimationTimer 
{
	long lastUpdate = 0;
	Circle CoinL;
	Circle CoinR;
	Image coinImgL;
	Image coinImgR;
	
public Timer(Circle coinL, Circle coinR)
{
	CoinL = coinL;
	CoinR = coinR;
	coinImgL = new Image("E:\\Final Project\\coinL.png");
	coinImgR = new Image("E:\\Final Project\\coinR.png");
}
	
public void handle()
{		
	
}
	
public void handle(long now)
{
	lastUpdate++;
	if (lastUpdate >= 50)
{				
	lastUpdate = 0;
			
	CoinL.setFill(new ImagePattern(coinImgL ));
	CoinR.setFill(new ImagePattern(coinImgL ));	
}
	else if (lastUpdate == 25)
{
	CoinL.setFill(new ImagePattern(coinImgR ));
	CoinR.setFill(new ImagePattern(coinImgR ));	

}
	
} // end handle
	
} // End timer1
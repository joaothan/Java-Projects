package p1;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class ButtonControls 
{
	double x;
	double y;
	boolean flag = true;
	
	Image sonicImg = new Image("E:\\Final Project\\sonicR.png");
	Image sonicImgL = new Image("E:\\Final Project\\sonicL.png");
	
public ButtonControls()
{
		
}

public void Left(Circle c)
{
	getPosition(c);
	c.setFill(new ImagePattern(sonicImgL));	
	flag = false;
		
	if (x < 40)
{
//Left most boundary
	c.setCenterX(x);
}
	else
{
	c.setCenterX(c.getCenterX() - 10);
}
	
}
	
public void Right(Circle c)
{	
	getPosition(c);
	c.setFill(new ImagePattern(sonicImg));	
	flag = true;
		
	if (x > 440)
{
//Right most boundary
	c.setCenterX(x);
}
	else
{
//move forward
	c.setCenterX(c.getCenterX()+ 10);
}
	
}
	
public void Up(Circle c)
{
	getPosition(c);
		
	if (y < 20)
{
//Reached the bottom
	c.setCenterY(y);
}
	else
{   
	c.setCenterY(c.getCenterY() - 50);
	if(flag == true)
{
//jump right 
	c.setCenterX(c.getCenterX() + 30);
}
	else
{
//jump left
	c.setCenterX(c.getCenterX() - 0);
}
	
}
	
}
	
public void Down(Circle c)
{
	getPosition(c);
		
	if (y >= 218)
{
//Reached the bottom
	c.setCenterY(y);
}
	else
{
//move down
	c.setCenterY(c.getCenterY()+ 50);
}
		
}
	
private void getPosition(Circle c)
{
	x = c.getCenterX();
	y = c.getCenterY();
	System.out.println(x + " " + y);
}

}

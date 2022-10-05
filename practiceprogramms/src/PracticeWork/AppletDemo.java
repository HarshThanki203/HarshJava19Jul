package PracticeWork;
import java.awt.*;
import javax.swing.*;


public class AppletDemo extends JApplet {

	  public void print(Graphics g)
	  {
		  
		g.setColor(Color.red);
		  g.drawString("Hello Welcome To Applets...",50,50);
		  
		  g.drawLine(20,30,20,300);
		  
		  g.setColor(Color.green);
		  g.drawRect(70,100,30,50);
	  }
}

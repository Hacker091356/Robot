import java.awt.*;
import  java.awt.event.InputEvent;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 
import javax.imageio.ImageIO;

public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot Neil = new Robot();
        Neil.mouseMove(0,1200);
        Neil.setAutoDelay(500);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(200);
        Neil.mouseMove(100,720);
        Neil.setAutoDelay(500);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(2000);
        Neil.mouseMove(1200,500);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(1000);
        Neil.mouseMove(1200,900);
        Neil.setAutoDelay(600);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(1500);
        Neil.mouseMove(735,85);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(400);
        Neil.mouseMove(735,190);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= Neil.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to" + file.getPath()); 

    }
    
}
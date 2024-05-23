import java.awt.*;
import  java.awt.event.InputEvent;
public class ApplicationRobot{
    public static void main(String[] args) throws Exception{
        Robot Neil = new Robot();
        Neil.mouseMove(0,1200);
        Neil.setAutoDelay(1000);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(300);
        Neil.mouseMove(100,720);
        Neil.setAutoDelay(1000);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(3000);
        Neil.mouseMove(1200,500);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(2000);
        Neil.mouseMove(1200,900);
        Neil.setAutoDelay(600);
        Neil.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        Neil.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        Neil.setAutoDelay(2000);
        Neil.mouseMove(735,60);
    }
}
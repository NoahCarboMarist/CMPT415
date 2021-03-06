package lab5;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Craft{

    private String craft = "/res/craft-1.png";
    private int dx;
    private int dy;
    private int x;
    private int y;
    public int boardH;
    public int boardW;
    private Image image;
    private boolean isMoving = false;
    private boolean isMovingLeft = false;

    public Craft() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
        image = ii.getImage();
      
        x = 40;
        y = 60;
       
    }


    public void move() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
    	 if(isMoving) {
    		 if(isMovingLeft) {
    			 craft = "/res/craft-l-a.png";
    		 }
    		 else {
    			 craft = "/res/craft-a.png";
    		 }
         }
    	 else {
    		 if(isMovingLeft) {
    			 craft = "/res/craft-l.png";
    		 }
    		 else {
    			 craft = "/res/craft-1.png";
    	 }
    	 }
         ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
         image = ii.getImage();
    	
        return image;
    }


    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();
        isMoving = true;

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
            isMovingLeft = true;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
            isMovingLeft = false;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        isMoving = false;

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}

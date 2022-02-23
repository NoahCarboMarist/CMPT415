package lab6;

import java.awt.Image;
import java.awt.event.KeyEvent;

import java.util.ArrayList;

import javax.swing.ImageIcon;

@SuppressWarnings({"rawtypes", "unchecked"})
public class Craft {

    private String craft = "/res/craft-2.png";
    private String craftr = "/res/craft.png";
    
    private boolean isMoving = false;
    private boolean firing = false;

    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image image;
    private Image imager;

    private ArrayList missiles;

    private final int CRAFT_SIZE = 20;

    public Craft() {
        ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
        image = ii.getImage();
        ImageIcon il = new ImageIcon(this.getClass().getResource(craftr));
        imager = il.getImage();
        missiles = new ArrayList();
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
    		craft = "/res/craft-a.png";
    	}
    	
    	else{
    		craft = "/res/craft-1.png";
    	}
    	 if(firing) {
    		 return imager;
    	 }
        ImageIcon ii = new ImageIcon(this.getClass().getResource(craft));
        image = ii.getImage();
    	
        return image;
    }

    public ArrayList getMissiles() {
        return missiles;
    }

    public void keyPressed(KeyEvent e) {
    	isMoving = true;
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_SPACE) {
        	firing = true;
            fire();
        }

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void fire() {
        missiles.add(new Missile(x + CRAFT_SIZE, y + CRAFT_SIZE/2));
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
            isMoving = false;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
            isMoving = false;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
            isMoving = false;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
            isMoving = false;
        }
        if(key == KeyEvent.VK_SPACE) {
        	firing = false;
        }
    }
}
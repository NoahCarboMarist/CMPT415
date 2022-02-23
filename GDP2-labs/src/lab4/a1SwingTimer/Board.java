package lab4.a1SwingTimer;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Board extends JPanel implements ActionListener {

    Image star;
    Timer timer;
    int x, y, dx, dy;

    public Board() {
        setBackground(Color.BLACK);

        ImageIcon ii =
            new ImageIcon(this.getClass().getResource("/lab4/res/star.png"));
        star = ii.getImage();

        setDoubleBuffered(true);

        x = y = 10;
        dx = dy = 1;
        timer = new Timer(25, this);
        timer.start();
    }


    @Override
	public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(star, x, y, this);
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }


    @Override
	public void actionPerformed(ActionEvent e) {

    	  x += dx;
          y += dy;

          //Redirects direction of travel when edges of frame are reached
          if (y > getHeight() - star.getHeight(null) || y<0) {
             dy *= -1;
          }
          else if(x > getWidth() - star.getWidth(null) || x<0){
              dx *= -1;
          }
          repaint();
      }
}
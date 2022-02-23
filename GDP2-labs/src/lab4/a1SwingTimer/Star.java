package lab4.a1SwingTimer;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Star extends JFrame {

    public Star() {

        add(new Board());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(280, 240);
        setLocationRelativeTo(null);
        setTitle("Star");
        setResizable(true);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Star();
    }
}
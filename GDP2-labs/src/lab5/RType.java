package lab5;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class RType extends JFrame {

    public RType() {

        add(new Board());

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("R - Type");
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RType();
    }
}

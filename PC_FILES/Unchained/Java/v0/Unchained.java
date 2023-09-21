import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Unchained {
    JFrame window = new JFrame("Unchained v0.1");
    JPanel start = new JPanel();

    Unchained() {
        // Can keep the sizes the same as it actually does go end to end
        // Can start to remove the different sections out
        // Will just use this as the main interface for the screen loading
        start.setPreferredSize(new Dimension(1000, 750));
        start.setBackground(Color.BLACK);

        window.add(start);
        window.setLayout(new FlowLayout());
        window.getContentPane().setBackground(Color.BLACK);
        window.setSize(1000, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }

    public static void main(String args[]) {
        Unchained unchained = new Unchained();
    }
}
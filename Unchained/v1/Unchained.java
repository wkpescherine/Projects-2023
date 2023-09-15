import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Unchained {
    JFrame window = new JFrame("Unchained v1.1.1");

    Unchained() {
        window.setLayout(null);
        window.setSize(800, 600);
        window.getContentPane().setBackground(Color.BLACK);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }

    public static void main(String arp[]) {
        Unchained unchained = new Unchained();
    }
}

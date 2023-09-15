import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Unchained {
    StartScreen start = new StartScreen();

    JFrame window = new JFrame("Unchained v1.2.2");
    JPanel container = new JPanel();

    Unchained() {
        container.setPreferredSize(new Dimension(880, 680));
        container.setBounds(-40, -40, 880, 680);
        container.setBackground(Color.RED);

        container.add(start.entry);

        window.add(container);
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

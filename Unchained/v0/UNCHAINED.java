package Unchained.v0;

import javax.swing.*;
import java.awt.*;

public class UNCHAINED {
    MainScreen main = new MainScreen();

    JFrame window = new JFrame("Unchained v0.3.1");
    JPanel container = new JPanel();

    UNCHAINED(){
        container.setPreferredSize(new Dimension(880,680));
        container.setBounds(-40, -40, 880, 680);
        container.setBackground(Color.RED);

        container.add(main.main);

        window.add(container);	
        window.setLayout(null);
        window.setSize(800, 600);
		window.getContentPane().setBackground(Color.BLACK);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }

    public static void main(String arp[]){
        UNCHAINED unchained = new UNCHAINED();
    }
}

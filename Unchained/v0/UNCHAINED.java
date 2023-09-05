package Unchained.v0;

import javax.swing.JFrame;
import java.awt.*;

public class UNCHAINED {
    JFrame window = new JFrame("Unchained v0.1");

    UNCHAINED(){
        window.setLayout(new FlowLayout());
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

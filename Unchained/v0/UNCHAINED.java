package Unchained.v0;

import javax.swing.*;
import java.awt.*;

public class UNCHAINED {
    JFrame window = new JFrame("Unchained v0.2");
    JPanel startGUI = new JPanel();
    JButton start = new JButton("START");
    JButton load = new JButton("LOAD");

    UNCHAINED(){
        startGUI.add(start);
        startGUI.add(load);
        startGUI.setBackground(Color.BLACK);
        startGUI.setPreferredSize(new Dimension(100,400));
        start.setAlignmentX(Component.CENTER_ALIGNMENT);
        start.setAlignmentY(Component.CENTER_ALIGNMENT);

        window.getContentPane().add(startGUI);
        window.setLayout(new BoxLayout(window.getContentPane(),BoxLayout.LINE_AXIS));
	    window.add(startGUI);
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

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class HOTD{
	JLabel version = new JLabel("version 1");
    JFrame window = new JFrame("HOTD bot");

    PlayTracker(){
		version.setForeground(Color.WHITE);

		window.add(version);
		window.setLayout(new FlowLayout());
        window.getContentPane().setBackground(Color.BLACK);
		window.setSize(500,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }
    public static void main(String args[]){
		HOTD bot = new HOTD();
	}   
}
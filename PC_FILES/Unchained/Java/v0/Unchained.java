import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Unchained {
    JFrame window = new JFrame("Unchained v0.1.1");
    Start start = new Start();
    Load load = new Load();

    String state = "LOAD";

    Unchained() {
        renderScreen();
        // Can keep the sizes the same as it actually does go end to end
        // Can start to remove the different sections out
        // Will just use this as the main interface for the screen loading

        start.start.setBounds(0, 0, 1000, 750);

        load.load.setBounds(0, 0, 1000, 750);

        window.add(start.start);
        window.add(load.load);
        window.setLayout(null);
        window.getContentPane().setBackground(Color.BLACK);
        window.setSize(1000, 750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setResizable(false);
    }

    public static void main(String args[]) {
        Unchained unchained = new Unchained();
    }

    public void renderScreen() {
        start.start.setVisible(false);
        load.load.setVisible(false);
        if (state.equals("START")) {
            start.start.setVisible(true);
        }
        if (state.equals("LOAD")) {
            load.load.setVisible(true);
        }
    }
}
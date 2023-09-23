import java.awt.*;
import java.awt.event.*;
import java.io.ObjectInputFilter.Config;

import javax.swing.*;

public class Unchained implements ActionListener {
    JFrame window = new JFrame("Unchained v0.2.3");
    Start start = new Start();
    Saved saved = new Saved();

    Unchained() {
        renderScreen();
        // Can keep the sizes the same as it actually does go end to end
        // Can start to remove the different sections out
        // Will just use this as the main interface for the screen loading

        start.start.setBounds(0, 0, 1000, 750);
        start.begin.addActionListener(this);
        start.saved.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "SAVE";
                        renderScreen();
                    }
                });

        saved.saved.setBounds(0, 0, 1000, 750);
        saved.back.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "MAIN";
                        renderScreen();
                    }
                });
        saved.load.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "GAME";
                        renderScreen();
                    }
                });

        window.add(start.start);
        window.add(saved.saved);
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
        saved.saved.setVisible(false);
        if (GameConfig.state.equals("MAIN")) {
            start.start.setVisible(true);
        }
        if (GameConfig.state.equals("SAVE")) {
            saved.saved.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        GameConfig.state = "CREATE";
        renderScreen();
    }
}
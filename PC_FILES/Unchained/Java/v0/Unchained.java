import java.awt.*;
import java.awt.event.*;
import java.io.ObjectInputFilter.Config;

import javax.swing.*;

public class Unchained implements ActionListener {
    JFrame window = new JFrame("Unchained v0.2.5");
    Start start = new Start();
    Saved saved = new Saved();
    Game game = new Game();
    CreateChar create = new CreateChar();

    Unchained() {
        renderScreen();
        // Can keep the sizes the same as it actually does go end to end
        // Can start to remove the different sections out
        // Will just use this as the main interface for the screen loading

        // START GAME SCREEN SWITCHIUNG
        start.start.setBounds(0, 0, 1000, 750);
        start.begin.addActionListener(this);
        start.saved.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "SAVE";
                        renderScreen();
                    }
                });

        // SAVED GANE SCREEN SWITCHING
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

        // CREATECHAR SCREEN SWITCHING
        create.create.setBounds(0, 0, 1000, 750);
        create.play.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "GAME";
                        renderScreen();
                    }
                });
        create.exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "MAIN";
                        renderScreen();
                    }
                });

        // GAME SCREEN SWITCHING
        game.game.setBounds(0, 0, 1990, 750);
        game.exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        GameConfig.state = "MAIN";
                        renderScreen();
                    }
                });

        window.add(start.start);
        window.add(saved.saved);
        window.add(create.create);
        window.add(game.game);
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
        create.create.setVisible(false);
        game.game.setVisible(false);
        if (GameConfig.state.equals("MAIN")) {
            start.start.setVisible(true);
        }
        if (GameConfig.state.equals("SAVE")) {
            saved.saved.setVisible(true);
        }
        if (GameConfig.state.equals("CREATE")) {
            create.create.setVisible(true);
        }
        if (GameConfig.state.equals("GAME")) {
            create.create.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        GameConfig.state = "CREATE";
        renderScreen();
    }
}
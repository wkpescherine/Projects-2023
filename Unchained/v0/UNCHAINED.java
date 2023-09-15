import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Unchained implements ActionListener {
    MainScreen start = new MainScreen();
    SavedScreen save = new SavedScreen();
    CharScreen toon = new CharScreen();
    GameScreen game = new GameScreen();

    JFrame window = new JFrame("Unchained v0.8.0");
    JPanel container = new JPanel();

    Unchained() {
        renderScreen();

        start.load.addActionListener(this);
        start.start.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gameState.gameScreenState = "CHAR";
                        renderScreen();
                    }
                });
        save.back.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gameState.gameScreenState = "MAIN";
                        renderScreen();
                    }
                });
        toon.back.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gameState.gameScreenState = "MAIN";
                        renderScreen();
                    }
                });
        toon.begin.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gameState.gameScreenState = "GAME";
                        renderScreen();
                    }
                });
        game.exit.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        gameState.gameScreenState = "MAIN";
                        renderScreen();
                    }
                });

        container.setPreferredSize(new Dimension(880, 680));
        container.setBounds(-40, -40, 880, 680);
        container.setBackground(Color.RED);

        container.add(start.main);
        container.add(save.save);
        container.add(toon.toon);
        container.add(game.game);

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

    public void renderScreen() {
        start.main.setVisible(false);
        save.save.setVisible(false);
        toon.toon.setVisible(false);
        game.game.setVisible(false);
        if (gameState.gameScreenState.equals("MAIN")) {
            start.main.setVisible(true);
        }
        if (gameState.gameScreenState.equals("LOAD")) {
            save.save.setVisible(true);
        }
        if (gameState.gameScreenState.equals("CHAR")) {
            toon.toon.setVisible(true);
        }
        if (gameState.gameScreenState.equals("GAME")) {
            game.game.setVisible(true);
        }
    }

    public void actionPerformed(ActionEvent e) {
        gameState.gameScreenState = "LOAD";
        renderScreen();
    }
}

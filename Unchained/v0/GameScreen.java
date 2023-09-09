package Unchained.v0;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GameScreen {
    JPanel game = new JPanel();
    JButton exit = new JButton("Exit");

    GameScreen(){
        game.setVisible(false);

        game.setLayout(null);
        game.setPreferredSize(new Dimension(860,660));
        exit.setPreferredSize(new Dimension(100, 50));
        game.setBounds(-20, -20, 430, 330);
        exit.setBounds(330, 280, 100, 50);
        game.add(exit);
    }
}

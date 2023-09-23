import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Game {
    JPanel game = new JPanel();
    JButton exit = new JButton("Exit");

    Game() {
        exit.setPreferredSize(new Dimension(100, 50));
        exit.setBounds(450, 325, 100, 50);

        game.add(exit);
        game.setLayout(null);
        game.setPreferredSize(new Dimension(1000, 750));
    }
}

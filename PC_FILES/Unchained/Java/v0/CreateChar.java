import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class CreateChar {
    JPanel create = new JPanel();
    JButton play = new JButton("Play");
    JButton exit = new JButton("Exit");

    CreateChar() {
        exit.setPreferredSize(new Dimension(100, 50));
        exit.setBounds(395, 350, 100, 50);
        play.setPreferredSize(new Dimension(100, 50));
        play.setBounds(505, 350, 100, 50);

        create.add(play);
        create.add(exit);
        create.setLayout(null);
        create.setPreferredSize(new Dimension(1000, 750));
    }
}

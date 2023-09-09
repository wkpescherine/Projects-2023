package Unchained.v0;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CharScreen {
    JPanel toon = new JPanel();
    JButton back = new JButton("Back");
    JButton begin = new JButton("Begin");

    CharScreen(){
        toon.setVisible(false);

        toon.setLayout(null);
        toon.setPreferredSize(new Dimension(860,660));
        back.setPreferredSize(new Dimension(100, 50));
        begin.setPreferredSize(new Dimension(100, 50));
        toon.setBounds(-20, -20, 430, 330);
        back.setBounds(330, 280, 100, 50);
        begin.setBounds(430, 280, 100, 50);
        toon.add(back);
        toon.add(begin);
    }
}

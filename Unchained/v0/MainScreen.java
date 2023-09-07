package Unchained.v0;

import javax.swing.*;
import java.awt.*;

public class MainScreen {
    JPanel main = new JPanel();
    JButton start = new JButton("Start");

    MainScreen(){
        main.add(start);
        main.setLayout(new FlowLayout());
        main.setPreferredSize(new Dimension(430,330));
        main.setBounds(-40, -40, 430, 330);
    }
}

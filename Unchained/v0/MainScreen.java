package Unchained.v0;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainScreen implements ActionListener{
    JPanel main = new JPanel();
    JButton start = new JButton("Start");
    JButton load = new JButton("Load");

    MainScreen(){
        load.addActionListener(this);

        main.setVisible(false);
        main.setLayout(null);

        main.setPreferredSize(new Dimension(860,660));
        start.setPreferredSize(new Dimension(100, 50));
        load.setPreferredSize(new Dimension(100, 50));
        
        main.setBounds(-20, -20, 430, 330);
        start.setBounds(380, 230, 100, 50);
        load.setBounds(380, 280, 100, 50);
        
        main.add(start);
        main.add(load);
    }

    public void actionPerformed(ActionEvent e){
        gameState.gameScreenState= "LOAD";
    }
}

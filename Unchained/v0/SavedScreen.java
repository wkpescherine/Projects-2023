package Unchained.v0;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SavedScreen implements ActionListener{
    JPanel save = new JPanel();
    JButton back = new JButton("Back");

    SavedScreen(){
        save.setVisible(false);
        
        back.addActionListener(this);
        save.setLayout(null);
        save.setPreferredSize(new Dimension(860,660));
        back.setPreferredSize(new Dimension(100, 50));
        save.setBounds(-20, -20, 430, 330);
        back.setBounds(380, 280, 100, 50);
        save.add(back);
    }
    public void actionPerformed(ActionEvent e){
        gameState.gameScreenState= "MAIN";
    }
}

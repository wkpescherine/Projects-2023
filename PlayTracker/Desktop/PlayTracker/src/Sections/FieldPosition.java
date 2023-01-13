package src.Sections;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import src.Main.Display;

public class FieldPosition implements ActionListener{
    JButton opp = new JButton("OPP");
    JButton own = new JButton("OWN");
    public JPanel field_pos = new JPanel();

    public FieldPosition(){
        opp.addActionListener(this);
        own.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.side_of_field = "OWN";
                    Display.updateUI();
				}
			}
		);

        opp. setPreferredSize(new DimensionUIResource(30, 25));
        own. setPreferredSize(new DimensionUIResource(30, 25));
        
        field_pos.setPreferredSize(new Dimension (347,35));
        field_pos.setLayout(new FlowLayout());
        field_pos.add(opp);
        field_pos.add(own);
    }

    public void actionPerformed(ActionEvent e) {
        Config.side_of_field = "OPP"; 
        Display.updateUI();  
    }
}
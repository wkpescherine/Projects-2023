package src.Sections;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Down implements ActionListener{
    JButton first = new JButton("1st");
    JButton second = new JButton("2nd");
    JButton third = new JButton("3rd");
    JButton fourth = new JButton("4th");
    public JPanel downs = new JPanel();
    
    public Down(){
        first.addActionListener(this);
        second.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.down = "2nd";
				}
			}
		);
        third.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.down = "3rd";
				}
			}
		);
        fourth.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.down = "4th";
				}
			}
		);
        downs.setPreferredSize(new Dimension (210,35));
        first.setPreferredSize(new Dimension (30,25));
        second.setPreferredSize(new Dimension (30,25));
        third.setPreferredSize(new Dimension (30,25));
        fourth.setPreferredSize(new Dimension (30,25));
        downs.add(first);
        downs.add(second);
        downs.add(third);
        downs.add(fourth);
        downs.setPreferredSize(new Dimension (165,35));
        downs.setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Config.down = "1st";   
    }
}
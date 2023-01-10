package src.Sections;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Distance implements ActionListener {
    JButton less1 = new JButton("<1");
    JButton y1to3 = new JButton("1-3");
    JButton y4to6 = new JButton("4-6");
    JButton y7to9 = new JButton("7-9");
    JButton y10 = new JButton("10");
    JButton y11to15 = new JButton("11-15");
    JButton y16to20 = new JButton("16-20");
    JButton y21over = new JButton("21+");
    public JPanel distance = new JPanel();

    public Distance(){
        less1.addActionListener(this);
        y1to3.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "1-3";
				}
			}
		);
        y4to6.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "4-6";
				}
			}
		);
        y7to9.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "7-9";
				}
			}
		);
        y10.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "10";
				}
			}
		);
        y11to15.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "11-15";
				}
			}
		);
        y16to20.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "16-20";
				}
			}
		);
        y21over.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.yards = "21+";
				}
			}
		);
        distance.setPreferredSize(new Dimension (530,35));
        less1.setPreferredSize(new Dimension (60,25));
        y1to3.setPreferredSize(new Dimension (60,25));
        y4to6.setPreferredSize(new Dimension (60,25));
        y7to9.setPreferredSize(new Dimension (60,25));
        y10.setPreferredSize(new Dimension (60,25));
        y11to15.setPreferredSize(new Dimension (60,25));
        y16to20.setPreferredSize(new Dimension (60,25));
        y21over.setPreferredSize(new Dimension (60,25));
        distance.setLayout(new FlowLayout());
        distance.add(less1);
        distance.add(y1to3);
        distance.add(y4to6);
        distance.add(y7to9);
        distance.add(y10);
        distance.add(y11to15);
        distance.add(y16to20);
        distance.add(y21over);
    }
    public void actionPerformed(ActionEvent e) {
        Config.yards = "<1";   
    }
}
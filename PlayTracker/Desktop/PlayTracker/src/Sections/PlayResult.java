package src.Sections;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import src.Main.Display;

public class PlayResult implements ActionListener{
    JButton completion = new JButton("COM");
    JButton incomplete = new JButton("INC");
    JButton run = new JButton("RUN");
    JButton interception = new JButton("INT");
    JButton fumble = new JButton("FUM");
    JButton penalty = new JButton("PEN");
    public JPanel playresult = new JPanel();
    
    public PlayResult(){
        completion.addActionListener(this);
        incomplete.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.play_result = "INC";
                    Display.updateUI();
				}
			}
		);
        run.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.play_result = "RUN";
                    Display.updateUI();
				}
			}
		);
        interception.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.play_result = "INT";
                    Display.updateUI();
				}
			}
		);
        fumble.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.play_result = "FUM";
                    Display.updateUI();
				}
			}
		);
        penalty.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.play_result = "PEN";
                    Display.updateUI();
				}
			}
		);

        completion.setPreferredSize(new Dimension (39,25));
        incomplete.setPreferredSize(new Dimension (39,25));
        run.setPreferredSize(new Dimension (39,25));
        interception.setPreferredSize(new Dimension (39,25));
        fumble.setPreferredSize(new Dimension (39,25));
        penalty.setPreferredSize(new Dimension (39,25));

        playresult.setPreferredSize(new Dimension (700,35));
        playresult.setLayout(new FlowLayout());
        playresult.add(completion);
        playresult.add(incomplete);
        playresult.add(run);
        playresult.add(interception);
        playresult.add(fumble);
        playresult.add(penalty);
    }

    public void actionPerformed(ActionEvent e){
        Config.play_result = "COMP";
        Display.updateUI();
	}
}

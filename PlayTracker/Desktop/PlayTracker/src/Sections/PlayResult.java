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
        completion.setPreferredSize(new Dimension (39,25));

        playresult.setPreferredSize(new Dimension (700,35));
        playresult.setLayout(new FlowLayout());
        playresult.add(completion);
    }

    public void actionPerformed(ActionEvent e){
        Config.play_result = "COMP";
        Display.updateUI();
	}
}

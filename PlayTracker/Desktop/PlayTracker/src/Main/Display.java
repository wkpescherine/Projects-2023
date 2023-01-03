package src.Main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import src.Sections.Config;

public class Display implements ActionListener {
    JPanel results = new JPanel();
    JLabel offensiveTeam = new JLabel("Offense");
    JLabel defensiveTeam = new JLabel("Defense");
    JLabel quarter = new JLabel("Qtr");
    JLabel minute = new JLabel("Min");
    JLabel teamOnOff = new JLabel("");
    JLabel teamOnDef = new JLabel("");
    JLabel qtrNum = new JLabel("");
    JLabel minNum = new JLabel("");
    JLabel divider1 = new JLabel(":");
    JLabel divider2 = new JLabel(":");
    JLabel divider3 = new JLabel(":");
    JLabel divider4 = new JLabel(":");
    JLabel down = new JLabel("down");
    JLabel divider5 = new JLabel(":");
    JLabel downValue = new JLabel("");
    JLabel yards = new JLabel("Yrds");
    JLabel divider6 = new JLabel(":");
    JLabel yardsValue = new JLabel("");
    JButton update = new JButton("Update");
    JButton changePoss = new JButton("Change of Poss");

    Config config = new Config();

    Display(){
        update.addActionListener(this);
        changePoss.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    String tempTeam = config.offense;
                    config.offense = config.defense;
                    config.defense = tempTeam;
                    updateUI();
				}
			}
		);

        offensiveTeam.setPreferredSize(new Dimension (60,25));
        defensiveTeam.setPreferredSize(new Dimension (60,25));
        quarter.setPreferredSize(new Dimension (60,25));
        minute.setPreferredSize(new Dimension (60,25));
        divider1.setPreferredSize(new Dimension (20,25));
        divider2.setPreferredSize(new Dimension (20,25));
        divider3.setPreferredSize(new Dimension (20,25));
        divider4.setPreferredSize(new Dimension (20,25));
        teamOnOff.setPreferredSize(new Dimension (40,25));
        teamOnDef.setPreferredSize(new Dimension (40,25));
        qtrNum.setPreferredSize(new Dimension (40,25));
        minNum.setPreferredSize(new Dimension (40,25));
        down.setPreferredSize(new Dimension (40,25));
        divider5.setPreferredSize(new Dimension (20,25));
        downValue.setPreferredSize(new Dimension (40,25));
        yards.setPreferredSize(new Dimension (40,25));
        divider6.setPreferredSize(new Dimension (20,25));
        yardsValue.setPreferredSize(new Dimension (40,25));

        results.setPreferredSize(new Dimension (290,520));
        results.add(offensiveTeam);
        results.add(divider1);
        results.add(teamOnOff);
        results.add(defensiveTeam);
        results.add(divider2);
        results.add(teamOnDef);
        results.add(quarter);
        results.add(divider3);
        results.add(qtrNum);
        results.add(minute);
        results.add(divider4);
        results.add(minNum);
        results.add(down);
        results.add(divider5);
        results.add(downValue);
        results.add(yards);
        results.add(divider6);
        results.add(yardsValue);
        results.add(update);
        results.add(changePoss);
    }

    public void updateUI(){
        teamOnOff.setText(config.offense);
        teamOnDef.setText(config.defense);
        qtrNum.setText(config.quarter);
        minNum.setText(config.minute);
        downValue.setText(config.down);
        yardsValue.setText(config.yards);
    }

    public void actionPerformed(ActionEvent e){
        updateUI();
	}
}
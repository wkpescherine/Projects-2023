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
    static JLabel teamOnOff = new JLabel("");
    static JLabel teamOnDef = new JLabel("");
    static JLabel qtrNum = new JLabel("");
    static JLabel minNum = new JLabel("");
    JLabel divider1 = new JLabel(":");
    JLabel divider2 = new JLabel(":");
    JLabel divider3 = new JLabel(":");
    JLabel divider4 = new JLabel(":");
    JLabel down = new JLabel("down");
    JLabel divider5 = new JLabel(":");
    static JLabel downValue = new JLabel("");
    JLabel yards = new JLabel("Yrds");
    JLabel divider6 = new JLabel(":");
    static JLabel yardsValue = new JLabel("");
    JLabel playsResult = new JLabel("Play Result");
    JLabel divider7 = new JLabel(":");
    static JLabel resultPlay = new JLabel("");
    JButton update = new JButton("Update");
    JButton changePoss = new JButton("Change of Poss");

    public Display(){
        update.addActionListener(this);
        changePoss.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    String tempTeam = Config.offense;
                    Config.offense = Config.defense;
                    Config.defense = tempTeam;
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
        down.setPreferredSize(new Dimension (60,25));
        divider5.setPreferredSize(new Dimension (20,25));
        downValue.setPreferredSize(new Dimension (40,25));
        yards.setPreferredSize(new Dimension (60,25));
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
        results.add(playsResult);
        results.add(divider7);
        results.add(resultPlay);
        results.add(update);
        results.add(changePoss);
    }

    public static void updateUI(){
        teamOnOff.setText(Config.offense);
        teamOnDef.setText(Config.defense);
        qtrNum.setText(Config.quarter);
        minNum.setText(Config.minute);
        downValue.setText(Config.down);
        yardsValue.setText(Config.yards);
        resultPlay.setText(Config.play_result);
    }

    public static void changePoss(){
        String tempTeam = Config.offense;
        Config.offense = Config.defense;
        Config.defense = tempTeam;
    }

    public void actionPerformed(ActionEvent e){
        updateUI();
	}
}
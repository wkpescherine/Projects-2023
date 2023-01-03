package src.Main;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

import src.Sections.Teams;
import src.Sections.Quarter;
import src.Sections.Config;
import src.Sections.Minutes;
import src.Sections.Down;
import src.Sections.Distance;

public class SetTracker implements ActionListener{
    JPanel main = new JPanel();
    JButton AnalyzeO = new JButton("Analyze Offense");
    JButton AnalyzeD = new JButton("Analyze Defense");
    JButton save = new JButton("Save Data");

    Config config = new Config();
    Teams teams = new Teams();
    Quarter quarter = new Quarter();
    Minutes minutes = new Minutes();
    Down down = new Down();
    Distance distance = new Distance();

    SetTracker(){
        save.setPreferredSize(new Dimension (720,25));
        AnalyzeD.setPreferredSize(new Dimension (355,25));
        AnalyzeO.setPreferredSize(new Dimension (355,25));
        save.addActionListener(this);
        main.add(teams.teams);
        main.add(quarter.qtr);
        main.add(minutes.min);
        main.add(down.downs);
        main.add(distance.distance);
        main.add(AnalyzeO);
        main.add(AnalyzeD);
        main.add(save);
        main.setPreferredSize(new Dimension (750,520));
        main.setLayout(new FlowLayout());
        main.setBackground(Color.BLACK);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            FileWriter myWriter = new FileWriter("/Users/wkpescherine/Desktop/Languages/Java/PlayTracker/src/Main/GameData.txt", true);
            BufferedWriter bWriter = new BufferedWriter(myWriter);
            PrintWriter pWriter = new PrintWriter(bWriter);
                pWriter.write(config.offense+","+config.defense+","+config.quarter+","+config.minute+","+config.down+","+config.distance+"\r");
                pWriter.close();
        }catch(IOException err){
            err.printStackTrace();
        }      
    }
}
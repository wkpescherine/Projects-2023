package src.Sections;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Teams implements ActionListener {
    JButton offense =  new JButton("OFF");
    JButton defense =  new JButton("DEF");
    JButton BUF = new JButton("Buf");
    JButton NYJ = new JButton("NYJ");
    JButton MIA = new JButton("Mia");
    JButton NE = new JButton("NE");
    JButton PIT = new JButton("Pit");
    JButton BAL = new JButton("Bal");
    JButton CLE = new JButton("Cle");
    JButton CIN = new JButton("Cin");
    JButton KC  = new JButton("KC");
    JButton LV  = new JButton("LV");
    JButton DEN = new JButton("Den");
    JButton LAC = new JButton("LAC");
    JButton IND = new JButton("Ind");
    JButton JAX = new JButton("Jax");
    JButton HOU = new JButton("Hou");
    JButton TEN = new JButton("Ten");
    JButton DAL = new JButton("Dal");
    JButton NYG = new JButton("NYG");
    JButton PHI = new JButton("Phi");
    JButton WAS = new JButton("Was");
    JButton GB  = new JButton("GB");
    JButton MIN = new JButton("Min");
    JButton DET = new JButton("Det");
    JButton CHI = new JButton("Chi");
    JButton TB  = new JButton("TB");
    JButton NO  = new JButton("NO");
    JButton CAR = new JButton("Car");
    JButton ATL = new JButton("Atl");
    JButton SF  = new JButton("SF");
    JButton LAR = new JButton("LAR");
    JButton SEA = new JButton("Sea");
    JButton ARI = new JButton("Ari");

    public JPanel teams = new JPanel();
    
    public Teams(){
        offense.addActionListener(this);
        offense.setPreferredSize(new Dimension (35,25));
        defense.setPreferredSize(new Dimension (35,25));
        defense.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    Config.off_def = "def";
				}
			}
		);
        BUF.setPreferredSize(new Dimension (35,25));
        BUF.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(Config.off_def.equals("off")){
                        Config.offense = "BUF";
                    }else{ Config.defense= "BUF";}
				}
			}
		);
        MIA.setPreferredSize(new Dimension (35,25));
        MIA.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(Config.off_def.equals("off")){
                        Config.offense = "MIA";
                    }else{ Config.defense= "MIA";}
				}
			}
		);
        NYJ.setPreferredSize(new Dimension (35,25));
        NYJ.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(Config.off_def.equals("off")){
                        Config.offense = "NYJ";
                    }else{ Config.defense= "NYJ";}
				}
			}
		);
        NE.setPreferredSize(new Dimension (35,25));
        NE.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "NE";
                    }else{ config.defense= "NE";}
				}
			}
		);
        PIT.setPreferredSize(new Dimension (35,25));
        PIT.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "PIT";
                    }else{ config.defense= "PIT";}
				}
			}
		);
        BAL.setPreferredSize(new Dimension (35,25));
        BAL.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "BAL";
                    }else{ config.defense= "BAL";}
				}
			}
		);
        CLE.setPreferredSize(new Dimension (35,25));
        CLE.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "CLE";
                    }else{ config.defense= "CLE";}
				}
			}
		);
        CIN.setPreferredSize(new Dimension (35,25));
        CIN.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "CIN";
                    }else{ config.defense= "CIN";}
				}
			}
		);
        KC.setPreferredSize(new Dimension (35,25));
        KC.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "KC";
                    }else{ config.defense= "KC";}
				}
			}
		);
        LV.setPreferredSize(new Dimension (35,25));
        LV.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "LV";
                    }else{ config.defense= "LV";}
				}
			}
		);
        DEN.setPreferredSize(new Dimension (35,25));
        DEN.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "DEN";
                    }else{ config.defense= "DEN";}
				}
			}
		);
        LAC.setPreferredSize(new Dimension (35,25));
        LAC.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "LAC";
                    }else{ config.defense= "LAC";}
				}
			}
		);
        IND.setPreferredSize(new Dimension (35,25));
        IND.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "IND";
                    }else{ config.defense= "IND";}
				}
			}
		);
        JAX.setPreferredSize(new Dimension (35,25));
        JAX.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "JAX";
                    }else{ config.defense= "JAX";}
				}
			}
		);
        HOU.setPreferredSize(new Dimension (35,25));
        HOU.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "HOU";
                    }else{ config.defense= "HOU";}
				}
			}
		);
        TEN.setPreferredSize(new Dimension (35,25));
        TEN.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "TEN";
                    }else{ config.defense= "TEN";}
				}
			}
		);
        DAL.setPreferredSize(new Dimension (35,25));
        DAL.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "DAL";
                    }else{ config.defense= "DAL";}
				}
			}
		);
        NYG.setPreferredSize(new Dimension (35,25));
        NYG.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "NYG";
                    }else{ config.defense= "NYG";}
				}
			}
		);
        PHI.setPreferredSize(new Dimension (35,25));
        PHI.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "PHI";
                    }else{ config.defense= "PHI";}
				}
			}
		);
        WAS.setPreferredSize(new Dimension (35,25));
        WAS.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "WAS";
                    }else{ config.defense= "WAS";}
				}
			}
		);
        GB.setPreferredSize(new Dimension (35,25));
        GB.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "GB";
                    }else{ config.defense= "GB";}
				}
			}
		);
        MIN.setPreferredSize(new Dimension (35,25));
        MIN.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "MIN";
                    }else{ config.defense= "MIN";}
				}
			}
		);
        DET.setPreferredSize(new Dimension (35,25));
        DET.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "DET";
                    }else{ config.defense= "DET";}
				}
			}
		);
        CHI.setPreferredSize(new Dimension (35,25));
        CHI.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "CHI";
                    }else{ config.defense= "CHI";}
				}
			}
		);
        TB.setPreferredSize(new Dimension (35,25));
        TB.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "TB";
                    }else{ config.defense= "TB";}
				}
			}
		);
        NO.setPreferredSize(new Dimension (35,25));
        NO.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "NO";
                    }else{ config.defense= "NO";}
				}
			}
		);
        CAR.setPreferredSize(new Dimension (35,25));
        CAR.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "CAR";
                    }else{ config.defense= "CAR";}
				}
			}
		);
        ATL.setPreferredSize(new Dimension (35,25));
        ATL.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "ATL";
                    }else{ config.defense= "ATL";}
				}
			}
		);
        SF.setPreferredSize(new Dimension (35,25));
        SF.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "SF";
                    }else{ config.defense= "SF";}
				}
			}
		);
        SEA.setPreferredSize(new Dimension (35,25));
        SEA.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "SEA";
                    }else{ config.defense= "SEA";}
				}
			}
		);
        LAR.setPreferredSize(new Dimension (35,25));
        LAR.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(config.off_def.equals("off")){
                        config.offense = "LAR";
                    }else{ config.defense= "LAR";}
				}
			}
		);
        ARI.setPreferredSize(new Dimension (35,25));
        ARI.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
					if(Config.off_def.equals("off")){
                        Config.offense = "ARI";
                    }else{ Config.defense= "ARI";}
				}
			}
		);

        teams.setPreferredSize(new Dimension (700,60));
        teams.add(offense);
        teams.add(BUF);
        teams.add(MIA);
        teams.add(NYJ);
        teams.add(NE);
        teams.add(PIT);
        teams.add(BAL);
        teams.add(CLE);
        teams.add(CIN);
        teams.add(KC);
        teams.add(LV);
        teams.add(DEN);
        teams.add(LAC);
        teams.add(IND);
        teams.add(JAX);
        teams.add(HOU);
        teams.add(TEN);
        teams.add(defense);
        teams.add(DAL);
        teams.add(NYG);
        teams.add(PHI);
        teams.add(WAS);
        teams.add(GB);
        teams.add(MIN);
        teams.add(DET);
        teams.add(CHI);
        teams.add(TB);
        teams.add(NO);
        teams.add(CAR);
        teams.add(ATL);
        teams.add(SF);
        teams.add(SEA);
        teams.add(ARI);
        teams.add(LAR);
    }

    public void actionPerformed(ActionEvent e){
        config.off_def = "off";
	}
}
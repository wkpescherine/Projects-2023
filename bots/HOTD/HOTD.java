import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Hotd implements ActionListener{
	JLabel version = new JLabel("version 1");
    JFrame window = new JFrame("HOTD bot");
	JButton Active = new JButton("Activate/Disable");

	String status = "false";

	Integer number = 0;

    Hotd(){
		Active.addActionListener(this);
		version.setForeground(Color.WHITE);

		window.add(Active);
		window.add(version);
		window.setLayout(new FlowLayout());
        window.getContentPane().setBackground(Color.BLACK);
		window.setSize(200,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }
    public static void main(String args[]){
		Hotd bot = new Hotd();
	}   

	public void actionPerformed(ActionEvent e){
		if(status == "false"){
			status = "true";
			counter();
		}else{
			status = "false";
		}
	}

	public void counter(){
		while(status == "true"){
			number +=1;
			System.out.println(number);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter();
		}
	}
}
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Robot;


public class Bot implements ActionListener{
	JLabel version = new JLabel("version 2");
    JFrame window = new JFrame("Bot");
	JButton Active = new JButton("Activate");
	JButton Disable = new JButton("Disable");

	String status = "false";

	Integer number = 0;

    Bot(){
		Active.addActionListener(this);
		version.setForeground(Color.WHITE);
		Disable.setVisible(false);
		Disable.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent e){
                    status = "false";
					Active.setVisible(true);
					Disable.setVisible(false);
				}
			}
		);

		window.add(Active);
		window.add(Disable);
		window.add(version);
		window.setLayout(new FlowLayout());
        window.getContentPane().setBackground(Color.BLACK);
		window.setSize(200,300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setResizable(false);
    }
    public static void main(String args[]){
		Bot bot = new Bot();
	}   

	public void actionPerformed(ActionEvent e){
		status = "true";
		Active.setVisible(false);
		Disable.setVisible(true);
		try {
			counter();
		} catch (AWTException e1) {
			e1.printStackTrace();
		}
	}

	public void counter()throws AWTException{
		while(status == "true"){
			try {
				Robot r = new Robot();
				int mask = InputEvent.BUTTON1_DOWN_MASK;
				number +=1;
				System.out.println("Before");
				r.mouseMove(10, 40);
				r.mousePress(mask);
				r.mousePress(mask);
				System.out.println("After");
				System.out.println(number);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
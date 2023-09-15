import javax.swing.*;
import java.awt.*;

public class StartScreen {
    JPanel entry = new JPanel();
    JButton start = new JButton("Start");
    JButton load = new JButton("Load");

    StartScreen(){
        entry.setVisible(false);
        entry.setLayout(null);

        entry.setPreferredSize(new Dimension(860,660));
        start.setPreferredSize(new Dimension(100, 50));
        load.setPreferredSize(new Dimension(100, 50));
        
        entry.setBounds(-20, -20, 430, 330);
        start.setBounds(380, 230, 100, 50);
        load.setBounds(380, 280, 100, 50);
        
        entry.add(start);
        entry.add(load);
}

import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Start {
    JPanel start = new JPanel();
    JButton begin = new JButton("Start");
    JButton saved = new JButton("Saved");

    Start() {
        begin.setPreferredSize(new Dimension(100, 50));
        begin.setBounds(395, 350, 100, 50);
        saved.setPreferredSize(new Dimension(100, 50));
        saved.setBounds(505, 350, 100, 50);

        start.add(begin);
        start.add(saved);
        start.setLayout(null);
        start.setPreferredSize(new Dimension(1000, 750));
    }
}

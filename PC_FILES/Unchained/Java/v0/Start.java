import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Start {
    JPanel start = new JPanel();
    JButton begin = new JButton("Start");
    JButton load = new JButton("Load");

    Start() {
        begin.setPreferredSize(new Dimension(100, 50));
        begin.setBounds(395, 350, 100, 50);
        load.setPreferredSize(new Dimension(100, 50));
        load.setBounds(505, 350, 100, 50);

        start.add(begin);
        start.add(load);
        start.setLayout(null);
        start.setPreferredSize(new Dimension(1000, 750));
    }
}

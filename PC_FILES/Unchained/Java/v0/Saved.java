import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Saved {
    JPanel saved = new JPanel();
    JButton back = new JButton("Back");
    JButton load = new JButton("Load");

    Saved() {
        back.setPreferredSize(new Dimension(100, 50));
        load.setPreferredSize(new Dimension(100, 50));

        back.setBounds(395, 350, 100, 50);
        load.setBounds(505, 350, 100, 50);

        saved.add(back);
        saved.add(load);
        saved.setLayout(null);
        saved.setPreferredSize(new Dimension(1000, 750));
    }
}

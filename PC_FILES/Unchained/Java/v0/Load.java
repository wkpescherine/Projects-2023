import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Load {
    JPanel load = new JPanel();
    JButton back = new JButton("Back");
    JButton loading = new JButton("Load");

    Load() {
        back.setPreferredSize(new Dimension(100, 50));
        loading.setPreferredSize(new Dimension(100, 50));

        back.setBounds(395, 350, 100, 50);
        loading.setBounds(505, 350, 100, 50);

        load.add(back);
        load.add(loading);
        load.setLayout(null);
        load.setPreferredSize(new Dimension(1000, 750));
    }
}

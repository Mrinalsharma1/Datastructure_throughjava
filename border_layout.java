import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class border_layout {
    JFrame f;

    border_layout() {
        f = new JFrame();
        JButton j1 = new JButton("North");
        JButton j2 = new JButton("South");
        JButton j3 = new JButton("East");
        JButton j4 = new JButton("West");
        JButton j5 = new JButton("Center");

        f.setLayout(new BorderLayout(20, 15));
        f.add(j1, BorderLayout.NORTH);
        f.add(j2, BorderLayout.SOUTH);
        f.add(j3, BorderLayout.EAST);
        f.add(j4, BorderLayout.WEST);
        f.add(j5, BorderLayout.CENTER);

        f.setSize(500, 600);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new border_layout();
    }
}

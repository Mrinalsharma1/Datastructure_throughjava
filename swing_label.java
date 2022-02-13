// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

// public class swing_label extends Frame implements ActionListner {
//     JTextField tf;
//     JLabel jl;
//     JButton jb;

//     // constructer crreated
//     swing_label() {
//         tf = new JTextField();
//         tf.setBounds(50, 50, 150, 20);
//         jl = new JLabel();
//         jl.setBounds(60, 100, 250, 20);
//         jb = new JButton();
//         jb.setBounds(70, 150, 300, 30);
//         jb.ActionListener(this);
//         add(jb);
//         add(tf);
//         add(jl);
//         setSize(400, 400);
//         setLayout(null);
//         setVisible(true);
//     }

//     public void actionPerformed(ActionEvent e) {
//         try {
//             String host = tf.getText();
//             String ip = java.net.InetAddress.getByName(host).getHostAddress();
//             jl.setText("IP of" + host + "is:" + ip);
//         } catch (Exception ex) {
//             // TODO: handle exception
//             System.out.println(ex);
//         }
//     }

//     public static void main(String[] args) {
//         new swing_label();
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_label extends Frame implements ActionListener {
    JTextField tf, t;
    JLabel l;
    JButton b;

    swing_label() {
        t = new JTextField("Know your ip here");
        t.setBounds(150, 90, 200, 20);
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        l = new JLabel();
        l.setBounds(50, 100, 250, 20);
        b = new JButton("Find IP");
        b.setBounds(50, 150, 95, 30);
        b.addActionListener(this);
        add(t);
        add(b);
        add(tf);
        add(l);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            String host = tf.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP of " + host + " is: " + ip);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        new swing_label();
    }
}
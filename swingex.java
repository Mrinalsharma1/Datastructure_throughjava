import javax.swing.JButton;
import javax.swing.JFrame;

public class swingex {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton b = new JButton("Click");
        b.setBounds(100, 130, 100, 30);
        f.add(b);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);

    }
}

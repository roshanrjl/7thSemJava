import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        InnerGui gui = new InnerGui();
    }

}

class InnerGui extends JFrame {
    InnerGui() {
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Name");
        l.setBounds(30, 100, 200, 50);
        JTextField tf = new JTextField("Roshan");
        tf.
        tf.setBounds(30, 120, 200, 10);

        add(l);
        add(tf);
        setLayout(null);
        setVisible(true);
    }

}

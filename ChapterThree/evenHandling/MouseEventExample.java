import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventExample implements MouseListener, ActionListener {

    JTextField t;
    JButton btn;
    JFrame f;

    public MouseEventExample() {

        f = new JFrame();
        btn = new JButton("Submit");

        t = new JTextField("This is the Best Class ");
        JTextField ft = new JTextField("hello");
        ft.setFocusable(true);

        // t.setBounds(30, 20, 100, 200);
        f.add(t);
        f.add(ft);
        // f.addMouseListener(this);

        // btn.setBounds(30, 10, 50, 50);
        f.add(btn);
        btn.addActionListener(this);

        f.setSize(300, 300);
        f.setLayout(new GridLayout(0, 1));
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void mouseClicked(MouseEvent e) {
        t.setText("Mouse Clicked");

        // System.out.println(e);
    }

    public void mousePressed(MouseEvent e) {
        t.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        t.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        t.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        t.setText("Mouse Exited");
    }

    // buuton

    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(btn))
            System.out.println(t.getText());

    }

    public static void main(String[] args) {
        new MouseEventExample();
    }

}

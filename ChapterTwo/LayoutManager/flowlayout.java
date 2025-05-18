package LayoutManager;
import java.awt.*;
import javax.swing.*;

public class flowlayout {
    public flowlayout() {
        JFrame frame = new JFrame("FlowLayout Example");


        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        JButton button7 = new JButton("Button 7");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        frame.setLayout(layout);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new flowlayout();
    }

}

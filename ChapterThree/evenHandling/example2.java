package ChapterThree.evenHandling;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;

public class example2 implements KeyListener{
    JFrame f;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;
    JButton b;

    public example2(){
       f = new JFrame();
       t1= new JTextField(20);
       t2= new JTextField(20);
       t3= new JTextField(28);
       l1= new JLabel("Enter First number:");
       l2= new JLabel("Enter second number:");
       l3= new JLabel("Result:");
       b=new JButton("ok");

         FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER); 
         f.setLayout(flowLayout); // Set layout BEFORE adding components
            f.add(l1);
            f.add(t1);
            f.add(l2);
            f.add(t2);
            f.add(l3);
            f.add(t3);
            
            f.add(b);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Add default close operation
            f.setSize(400,100); 
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            b.addKeyListener(this);

    }
    public void keyTyped(KeyEvent e) {
        // Not used
    }
    public void KeyRelesed(KeyEvent e) {
        // Not used
    }
    public void keyPressed(KeyEvent e){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        if(e.getKeyChar()==a){
            t3.setText("The sum is: "+(a+b));
        }
        else if(e.getKeyChar()==s){
            t3.setText("The sum is: "+(a-b));
        }
        else{
            t3.setText("Invalid input");
        }
    }

    

    public static void main(String[] args) {
        new example2();
    }
    
}

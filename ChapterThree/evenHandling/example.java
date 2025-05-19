package ChapterThree.evenHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.util.concurrent.Flow; // Unused import

public class example implements ActionListener { // Implement ActionListener

    JFrame frame; // Changed f to frame for consistency
    JTextField t1,t2;
    JButton b;
         public example(){
            frame = new JFrame("Copy Text Example"); // Use 'frame' and give a title
            t1 = new JTextField(20); // Correct initialization
            t2 = new JTextField(20); // Correct initialization
            b = new JButton("copy");

            FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER); // Use a more descriptive name
            frame.setLayout(flowLayout); // Set layout BEFORE adding components

            frame.add(t1); // Add components in desired order
            frame.add(b);
            frame.add(t2);
            
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Add default close operation
            frame.setSize(400,100); // Adjusted size for better fit
            frame.setLocationRelativeTo(null); // Center the frame
            frame.setVisible(true);
            
            b.addActionListener(this);
        }

        @Override // Good practice to use @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == b) { // Good practice to check the source
                String s1=t1.getText();
                t2.setText(s1);
            }
        }

        
    public static void main(String[] args) {
        // Run GUI creation on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new example();
            }
        });
    }
}
package LayoutManager;
import java.awt.*;
import javax.swing.*;

public class gridBaglayout {
    public gridBaglayout(){
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added default close operation

        GridBagLayout layout = new GridBagLayout();
        frame.setLayout(layout); // Set the layout for the frame

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5,5,5,5); // Optional: add some padding between components

        // Button "one"
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1; // Reset gridwidth for single-cell components
        frame.add(new JButton("one"), gbc);

        // Button "two"
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=2; // Spans two columns
        frame.add(new JButton("two"), gbc);

        // Button "three"
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2; // Spans two columns
        // Note: This button will start at gridx=0 and span 2 columns,
        // potentially overlapping with where "four" might go if not careful.
        // Let's assume you want it to span columns 0 and 1.
        frame.add(new JButton("three"), gbc);

        // Button "four"
        // If "three" spans gridx=0 and gridx=1, then "four" at gridx=0, gridy=2 is fine.
        gbc.gridx=0;
        gbc.gridy=2;    
        gbc.gridwidth=1; // Reset gridwidth
        frame.add(new JButton("four"), gbc);
        
        // Add a fifth button to demonstrate column 2, row 2
        gbc.gridx=2; // This was previously occupied by button "two" in row 0
                     // and potentially by "three" in row 1 if its gridwidth was 3.
                     // Let's place it in a new spot.
        gbc.gridy=2;
        gbc.gridwidth=1;
        frame.add(new JButton("five"), gbc);


        frame.pack(); // Adjusts frame size to fit components
        // Or set a fixed size: frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true); // Make the frame visible
       
    }
    public static void main(String[] args) {
        // It's good practice to run Swing GUI code on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new gridBaglayout();
            } 
        });
    }
    
}
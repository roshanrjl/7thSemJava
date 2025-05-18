package LayoutManager;
import javax.swing. *;
import java.awt. *;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class layout {
    public layout(){
        JFrame frame = new JFrame("Layout Example"); // Added a title
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Good practice to close the app

        // Button with an image
        JButton button1 = new JButton("One with Image");
        try {
            // Ensure you have an image named "icon.png" in the same directory
            // or provide the full path to your image file.
            ImageIcon icon = new ImageIcon("icon.png"); // Or "e:\\7thSemJava\\ChapterTwo\\LayoutManager\\icon.png"
            // Scale image if necessary (optional)
            Image img = icon.getImage();
            Image newimg = img.getScaledInstance(20, 20,  java.awt.Image.SCALE_SMOOTH);
            icon = new ImageIcon(newimg);
            button1.setIcon(icon);
        } catch (Exception e) {
            System.out.println("Image not found or error loading: " + e.getMessage());
            button1.setText("Image Error"); // Fallback text
        }
        
        JButton button2= new JButton("Open Facebook");  
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
                } catch (IOException | URISyntaxException ex) {
                    System.err.println("Error opening link: " + ex.getMessage());
                    JOptionPane.showMessageDialog(frame, "Could not open link: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton button3 = new JButton("three");  
        JButton button4 = new JButton(); // Remove default text or set it as fallback
        try {
            // Ensure you have an image named "center_icon.png" in the same directory
            // or provide the full path to your image file.
            // You can reuse "icon.png" if you want the same image.
            ImageIcon centerIcon = new ImageIcon("center_icon.png"); // Or "e:\\7thSemJava\\ChapterTwo\\LayoutManager\\center_icon.png"
            // Scale image if necessary (optional)
            Image centerImg = centerIcon.getImage();
            // Adjust scaling as needed for the center button, e.g., make it larger
            Image newCenterImg = centerImg.getScaledInstance(50, 50,  java.awt.Image.SCALE_SMOOTH); 
            centerIcon = new ImageIcon(newCenterImg);
            button4.setIcon(centerIcon);
            button4.setText(null); // Remove text if image is loaded
        } catch (Exception e) {
            System.out.println("Center image not found or error loading: " + e.getMessage());
            button4.setText("Center Img Err"); // Fallback text
        }
        JButton button5 = new JButton("five");
        
        
        frame.add(button1,BorderLayout.NORTH);
        frame.add(button2,BorderLayout.SOUTH);
        frame.add(button3,BorderLayout.EAST);
        frame.add(button4,BorderLayout.CENTER);
        frame.add(button5,BorderLayout.WEST);

        frame.setSize(300, 400);
        frame.setVisible(true);


    }

    public static void main(String[] args) {
      // It's good practice to run Swing GUI code on the Event Dispatch Thread
      SwingUtilities.invokeLater(new Runnable() {
          public void run() {
              new layout();
          }
      });
    }
    
}
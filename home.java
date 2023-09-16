import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

// ...



public class home {
    private static Image loadBackgroundImage() {
    try {
        return ImageIO.read(new File("C:\\Users\\DELL\\Documents\\GitHub\\lib-management-system\\background.jpg"));
    } catch (IOException e) {
        e.printStackTrace();
        return null;
    }
}

        public static void main(String[] args) {
            JFrame frame = new JFrame("Library Management System - Home Page");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
    
            // Create a panel to hold the content
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(3, 1));
    
            // Create labels and buttons
            JLabel titleLabel = new JLabel("Welcome to the Library Management System");
            titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
            titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
    
            JButton searchButton = new JButton("Search Books");
            JButton checkoutButton = new JButton("Checkout Books");
            JButton returnButton = new JButton("Return Books");
    
            // Add action listeners for the buttons
            searchButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle the search button click (e.g., open the search page)
                }
            });
    
            checkoutButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle the checkout button click (e.g., open the checkout page)
                }
            });
    
            returnButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle the return button click (e.g., open the return page)
                }
            });
    
            // Add components to the panel
            panel.add(titleLabel);
            panel.add(searchButton);
            panel.add(checkoutButton);
            panel.add(returnButton);
    
            // Add the panel to the frame
            frame.add(panel, BorderLayout.CENTER);
    
            // Display the frame
            frame.setVisible(true);
        }
    }
    
    
    


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class return_book_page {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System - Return Book");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel titleLabel = new JLabel("Book Title:");
        JTextField titleField = new JTextField();

        JLabel patronLabel = new JLabel("Patron ID:");
        JTextField patronField = new JTextField();

        JButton returnButton = new JButton("Return Book");

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookTitle = titleField.getText();
                String patronID = patronField.getText();

                // Implement the logic to return the book
                returnBook(bookTitle, patronID);

                // Optionally, show a confirmation message
                JOptionPane.showMessageDialog(frame, "Book returned successfully!");

                // Close the Return Book page (optional)
                frame.dispose();
            }
        });

        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(patronLabel);
        panel.add(patronField);
        panel.add(returnButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Implement the logic to return the book
    private static void returnBook(String bookTitle, String patronID) {
        // Implement the necessary logic to process the book return
        // Update the book's status, update the patron's borrowing history, etc.
        // Example: Update the "status" field of the book in the database to "Available"
    }
}


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

public class new_book_page {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System - New Book");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel titleLabel = new JLabel("Title:");
        JTextField titleField = new JTextField();

        JLabel authorLabel = new JLabel("Author:");
        JTextField authorField = new JTextField();

        JLabel isbnLabel = new JLabel("ISBN:");
        JTextField isbnField = new JTextField();

        JLabel publicationLabel = new JLabel("Publication Year:");
        JTextField publicationField = new JTextField();

        JButton saveButton = new JButton("Save");

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String title = titleField.getText();
                String author = authorField.getText();
                String isbn = isbnField.getText();
                String publicationYear = publicationField.getText();

                // Save the new book information to the database or data structure
                saveBookToDatabase(title, author, isbn, publicationYear);

                // Optionally, show a confirmation message
                JOptionPane.showMessageDialog(frame, "Book saved successfully!");

                // Close the New Book page (optional)
                frame.dispose();
            }
        });

        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(authorLabel);
        panel.add(authorField);
        panel.add(isbnLabel);
        panel.add(isbnField);
        panel.add(publicationLabel);
        panel.add(publicationField);
        panel.add(saveButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Implement the logic to save the book to the database
    private static void saveBookToDatabase(String title, String author, String isbn, String publicationYear) {
        // Implement database or data structure logic to save the book
        // You may use JDBC for database connectivity or another appropriate method
        // Example: Insert the book data into a "books" table
    }
}

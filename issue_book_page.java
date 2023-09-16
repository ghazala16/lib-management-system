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

public class issue_book_page {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library Management System - Issue Book");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel titleLabel = new JLabel("Book Title:");
        JTextField titleField = new JTextField();

        JLabel idLabel = new JLabel("Patron ID:");
        JTextField idField = new JTextField();

        JLabel issueDateLabel = new JLabel("Issue Date:");
        JTextField issueDateField = new JTextField();

        JButton issueButton = new JButton("Issue Book");

        issueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookTitle = titleField.getText();
                String patronID = idField.getText();
                String issueDate = issueDateField.getText();

                // Implement the logic to issue the book to the patron
                issueBook(bookTitle, patronID, issueDate);

                // Optionally, show a confirmation message
                JOptionPane.showMessageDialog(frame, "Book issued successfully!");

                // Close the Issue Book page (optional)
                frame.dispose();
            }
        });

        panel.add(titleLabel);
        panel.add(titleField);
        panel.add(idLabel);
        panel.add(idField);
        panel.add(issueDateLabel);
        panel.add(issueDateField);
        panel.add(issueButton);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Implement the logic to issue the book to the patron
    private static void issueBook(String bookTitle, String patronID, String issueDate) {
        // Implement the necessary logic to record the book issuance
        // You may update the book's status, record the patron's borrowing history, etc.
        // Example: Update the "status" field of the book in the database to "Issued"
    }
}


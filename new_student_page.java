import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class new_student_page {
        public static void main(String[] args) {
            JFrame frame = new JFrame("Library Management System - New Student");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setLayout(new BorderLayout());
    
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(4, 2));
    
            JLabel nameLabel = new JLabel("Student Name:");
            JTextField nameField = new JTextField();
    
            JLabel idLabel = new JLabel("Student ID:");
            JTextField idField = new JTextField();
    
            JButton saveButton = new JButton("Save");
    
            saveButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = nameField.getText();
                    String studentID = idField.getText();
    
                    // Save the new student information to the database or data structure
                    saveStudentToDatabase(name, studentID);
    
                    // Optionally, show a confirmation message
                    JOptionPane.showMessageDialog(frame, "Student saved successfully!");
    
                    // Close the New Student page (optional)
                    frame.dispose();
                }
            });
    
            panel.add(nameLabel);
            panel.add(nameField);
            panel.add(idLabel);
            panel.add(idField);
            panel.add(saveButton);
    
            frame.add(panel, BorderLayout.CENTER);
    
            frame.setVisible(true);
        }
    
        // Implement the logic to save the student to the database
        private static void saveStudentToDatabase(String name, String studentID) {
            // Implement database or data structure logic to save the student
            // You may use JDBC for database connectivity or another appropriate method
            // Example: Insert the student data into a "students" table
        }
    }
    


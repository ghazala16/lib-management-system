import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

    public class LoginGUI {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Library Management System Login");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());


        JPanel panel = new JPanel(new GridLayout(2, 2));
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();


        JButton loginButton = new JButton("Login");


        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);

        frame.add(panel, BorderLayout.CENTER);
        frame.add(loginButton, BorderLayout.SOUTH);


        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                // Add your authentication logic here
                if (authenticate(username, password)) {
                    // Successful login, navigate to the main application
                    // For now, simply display a message
                    JOptionPane.showMessageDialog(frame, "Login successful!");
                } else {
                    // Authentication failed, display an error message
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.");
                }
            }

            private boolean authenticate(String username, String password) {
                return username.equals("ghazala")&& password.equals("password");
            }
        });





        frame.setVisible(true);
    }

    // Implement your authentication logic here
    private static boolean authenticate(String username, String password) {
        // Replace this with your actual authentication logic
        // For example, you can check credentials against a database
        // For now, we'll assume a basic authentication
        return username.equals("admin") && password.equals("password");
    }
}




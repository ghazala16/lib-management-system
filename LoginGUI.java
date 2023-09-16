import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
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
        frame.setSize(400, 300);
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



        JLabel backgroundLabel=new JLabel();
        setBackgroundImage(backgroundLabel,"C:\\Users\\DELL\\Documents\\GitHub\\lib-management-system\\background.jpg");

        
    }






    private static void setBackgroundImage(JLabel label, String imagePath) {
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\GitHub\\lib-management-system\\background.jpg");
    Image image = imageIcon.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
    label.setIcon(new ImageIcon(image));
}
}




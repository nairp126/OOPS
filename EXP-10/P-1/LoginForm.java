

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame {
    // Swing components declaration
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        // Set up the frame
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        // Create components
        add(new JLabel("Username:"));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        add(loginButton);

        messageLabel = new JLabel("", SwingConstants.CENTER);
        add(messageLabel);

        // Add action listener for login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve text from username and password fields
                String username = usernameField.getText();
                // Note: getPassword() returns a char array for security
                String password = new String(passwordField.getPassword());

                // Validate credentials
                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login Successful!");
                } else {
                    messageLabel.setText("Invalid credentials.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Create and display the login form
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
 {
    
}

// The above code demonstrates a simple login form using Java Swing. It includes fields for username and password, a login button, and a message label to display the result of the login attempt. The action listener for the button checks if the entered credentials match predefined values and updates the message label accordingly.
// The code is structured to create a user-friendly interface and handle user input securely.
// The use of a char array for the password field enhances security by not exposing the password in plain text.
// The main method initializes the form and makes it visible.
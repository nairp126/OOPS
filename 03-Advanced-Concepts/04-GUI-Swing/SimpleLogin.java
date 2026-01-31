import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple Login Form.
 * Demonstrates JPasswordField for security.
 */
public class SimpleLogin extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField; // Special field for passwords (masked input)
    private JButton loginButton;
    private JLabel messageLabel;

    public SimpleLogin() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(5, 1));

        // Components
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

        // Logic
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();

                // SECURITY TIP:
                // getPassword() returns char[], NOT String. Strings are immutable and stick in
                // memory.
                // char[] can be overwritten/cleared immediately after use.
                // For this simple demo we convert to String, but in real apps, hash the chars
                // directly.
                String password = new String(passwordField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login Successful!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid credentials.");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SimpleLogin().setVisible(true);
        });
    }
}
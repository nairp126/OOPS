import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame {
    private JTextField nameField, emailField;
    private JPasswordField passwordField, confirmPasswordField;
    private JButton registerButton;
    private JLabel nameError, emailError, passwordError, confirmPasswordError, successLabel;

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6, 3, 5, 5));

        // Form labels and fields
        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);
        nameError = new JLabel();
        nameError.setForeground(Color.RED);
        add(nameError);

        add(new JLabel("Email:"));
        emailField = new JTextField();
        add(emailField);
        emailError = new JLabel();
        emailError.setForeground(Color.RED);
        add(emailError);

        add(new JLabel("Password:"));
        passwordField = new JPasswordField();
        add(passwordField);
        passwordError = new JLabel();
        passwordError.setForeground(Color.RED);
        add(passwordError);

        add(new JLabel("Confirm Password:"));
        confirmPasswordField = new JPasswordField();
        add(confirmPasswordField);
        confirmPasswordError = new JLabel();
        confirmPasswordError.setForeground(Color.RED);
        add(confirmPasswordError);

        // Register button with empty placeholder label for grid alignment
        registerButton = new JButton("Register");
        add(registerButton);
        add(new JLabel());
        successLabel = new JLabel("", SwingConstants.CENTER);
        successLabel.setForeground(new Color(0, 128, 0)); // green for success
        add(successLabel);

        // Action listener for the register button
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Reset error messages
                nameError.setText("");
                emailError.setText("");
                passwordError.setText("");
                confirmPasswordError.setText("");
                successLabel.setText("");

                String name = nameField.getText().trim();
                String email = emailField.getText().trim();
                String password = new String(passwordField.getPassword());
                String confirmPassword = new String(confirmPasswordField.getPassword());

                boolean valid = true;

                // Validate name
                if (name.isEmpty()) {
                    nameError.setText("Required");
                    valid = false;
                }
                // Validate email (very basic check)
                if (email.isEmpty() || !email.contains("@")) {
                    emailError.setText("Invalid Email");
                    valid = false;
                }
                // Validate password
                if (password.isEmpty()) {
                    passwordError.setText("Required");
                    valid = false;
                }
                // Validate confirm password
                if (!password.equals(confirmPassword)) {
                    confirmPasswordError.setText("Passwords do not match");
                    valid = false;
                }

                // Show success message if all validations pass
                if (valid) {
                    successLabel.setText("Registration Successful!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegistrationForm().setVisible(true);
        });
    }
}
// The above code implements a simple registration form using Java Swing. It includes fields for name, email, password, and confirm password, along with validation checks for each field. If all validations pass, a success message is displayed.
// The form uses a grid layout for better organization of components and includes error messages for invalid inputs.
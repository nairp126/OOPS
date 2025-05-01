
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();
    private double operand1 = 0;
    private String operator = "";

    public Calculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        // Create and add buttons to panel
        for (String label : buttonLabels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(btn);
            btn.addActionListener(new ButtonClickListener());
        }

        add(panel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if (cmd.matches("[0-9]")) {
                // Digit pressed; append it to the current input
                currentInput.append(cmd);
                display.setText(currentInput.toString());
            } else if (cmd.matches("[\\+\\-\\*/]")) {
                // Operator pressed; store operand and operator
                if (currentInput.length() > 0) {
                    operand1 = Double.parseDouble(currentInput.toString());
                    operator = cmd;
                    currentInput.setLength(0);
                    display.setText(operator);
                }
            } else if (cmd.equals("=")) {
                // Equals pressed; calculate result
                if (currentInput.length() > 0 && !operator.isEmpty()) {
                    double operand2 = Double.parseDouble(currentInput.toString());
                    double result = 0;
                    switch (operator) {
                        case "+": result = operand1 + operand2; break;
                        case "-": result = operand1 - operand2; break;
                        case "*": result = operand1 * operand2; break;
                        case "/": 
                            if (operand2 != 0) {
                                result = operand1 / operand2;
                            } else {
                                display.setText("Error: Divide by 0");
                                return;
                            }
                            break;
                    }
                    display.setText(String.valueOf(result));
                    currentInput.setLength(0);
                    operator = "";
                }
            } else if (cmd.equals("C")) {
                // Clear button pressed; reset everything
                currentInput.setLength(0);
                operand1 = 0;
                operator = "";
                display.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }
}

// The above code implements a simple calculator using Java Swing. It includes a display field and buttons for digits, operators, and actions like equals and clear. The calculator performs basic arithmetic operations and handles user input through button clicks.
// The code is structured to create a user-friendly interface and manage the calculator's state effectively.
// The action listeners for the buttons handle the logic for input, calculation, and display updates.
// The calculator supports addition, subtraction, multiplication, and division, with error handling for division by zero. The main method initializes the calculator and makes it visible to the user.
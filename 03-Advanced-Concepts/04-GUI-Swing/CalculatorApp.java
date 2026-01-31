import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A Swing Calculator Application.
 * demonstrates Layout Managers (BorderLayout, GridLayout) and Inner Classes for
 * Event Handling.
 */
public class CalculatorApp extends JFrame {
    private JTextField display;
    private StringBuilder currentInput = new StringBuilder();
    private double operand1 = 0;
    private String operator = "";

    public CalculatorApp() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout()); // Top region for display, Center for buttons

        // Display Field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 20));
        add(display, BorderLayout.NORTH);

        // Button Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5)); // 4x4 Grid with gaps

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "=", "+", "C"
        };

        // Create buttons loop
        for (String label : buttonLabels) {
            JButton btn = new JButton(label);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            panel.add(btn);

            // Register the listener
            // We use 'new ButtonClickListener()' for EVERY button.
            btn.addActionListener(new ButtonClickListener());
        }

        add(panel, BorderLayout.CENTER);
    }

    /**
     * Inner Class for Event Handling.
     * We put this INSIDE CalculatorApp so it can easily access private fields like
     * 'display' and 'operand1'.
     */
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = e.getActionCommand();

            if (cmd.matches("[0-9]")) {
                currentInput.append(cmd);
                display.setText(currentInput.toString());
            } else if (cmd.matches("[\\+\\-\\*/]")) {
                if (currentInput.length() > 0) {
                    operand1 = Double.parseDouble(currentInput.toString());
                    operator = cmd;
                    currentInput.setLength(0);
                    display.setText(operator);
                }
            } else if (cmd.equals("=")) {
                if (currentInput.length() > 0 && !operator.isEmpty()) {
                    double operand2 = Double.parseDouble(currentInput.toString());
                    double result = 0;
                    switch (operator) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        case "/":
                            if (operand2 != 0)
                                result = operand1 / operand2;
                            else {
                                display.setText("Error");
                                return;
                            }
                            break;
                    }
                    display.setText(String.valueOf(result));
                    currentInput.setLength(0);
                    operator = "";
                }
            } else if (cmd.equals("C")) {
                currentInput.setLength(0);
                operand1 = 0;
                operator = "";
                display.setText("");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorApp().setVisible(true);
        });
    }
}
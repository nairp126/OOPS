import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple Stopwatch application.
 * Concepts: Swing GUI, Event Handling (Listeners), and Timers.
 */
public class Stopwatch extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer; // javax.swing.Timer: fires specific action events at specified intervals.
    private int elapsedSeconds = 0;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // 1. Display Area
        timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        // 2. Control Buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // 3. The Timer Logic (The "Engine" of the stopwatch)
        // param 1: delay in milliseconds (1000ms = 1s)
        // param 2: ActionListener that fires every second
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                elapsedSeconds++; // Increment logic
                timeLabel.setText(String.valueOf(elapsedSeconds)); // Update UI
            }
        });

        // 4. Button Logic (Connecting UI to Code)

        // START: Tells the timer to begin firing events.
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        // STOP: Tells the timer to pause.
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        // RESET: Stops timer, clears counter, updates UI.
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
                elapsedSeconds = 0;
                timeLabel.setText("0");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Stopwatch().setVisible(true);
        });
    }
}
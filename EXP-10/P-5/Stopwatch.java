import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Stopwatch extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, stopButton, resetButton;
    private Timer timer;
    private int elapsedSeconds = 0;

    public Stopwatch() {
        setTitle("Stopwatch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Label to display elapsed time
        timeLabel = new JLabel("0", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        add(timeLabel, BorderLayout.CENTER);

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");
        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(resetButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Timer that fires every 1000 milliseconds (1 second)
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                elapsedSeconds++;
                timeLabel.setText(String.valueOf(elapsedSeconds));
            }
        });

        // Start button action: start the timer
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.start();
            }
        });

        // Stop button action: stop the timer
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop();
            }
        });

        // Reset button action: stop the timer and reset elapsed time
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
// This code creates a simple stopwatch application using Java Swing. It includes a label to display the elapsed time, buttons to start, stop, and reset the stopwatch, and uses a Timer to update the elapsed time every second.
// The application is designed to be user-friendly and visually appealing, with a clear layout and responsive buttons.
// The stopwatch functionality is implemented using a Timer that increments the elapsed time and updates the display label accordingly. The start, stop, and reset actions are handled through action listeners attached to the respective buttons.
// The main method initializes the stopwatch and makes it visible to the user.
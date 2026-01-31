import javax.swing.*; // Import Swing components for GUI
import java.awt.*; // Import AWT for layout managers and events
import java.awt.event.*;

/**
 * A simple To-Do List application using Java Swing.
 * This class extends JFrame, meaning the class itself IS a window.
 */
public class ToDoListSimple extends JFrame {

    // Model-View-Controller design pattern basics:
    // The Model: holds the data (list of strings).
    private DefaultListModel<String> taskModel;
    // The View: displays the data (visual list component).
    private JList<String> taskList;

    // Input components
    private JTextField taskField;
    private JButton addButton;
    private JButton removeButton;

    public ToDoListSimple() {
        // 1. Setup the Window (Frame)
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stop program when window closes
        setLocationRelativeTo(null); // Center on screen
        setLayout(new BorderLayout()); // Use BorderLayout: N, S, E, W, Center

        // 2. Setup Top Panel (Input)
        JPanel topPanel = new JPanel(new BorderLayout());
        taskField = new JTextField();
        addButton = new JButton("Add");

        // Add components to the top panel
        topPanel.add(taskField, BorderLayout.CENTER); // Field takes up available space
        topPanel.add(addButton, BorderLayout.EAST); // Button sticks to the right

        // Add top panel to the main window's North region
        add(topPanel, BorderLayout.NORTH);

        // 3. Setup Main List Area
        taskModel = new DefaultListModel<>(); // Initialize data storage
        taskList = new JList<>(taskModel); // Link view to data
        add(new JScrollPane(taskList), BorderLayout.CENTER); // Add scroll capability

        // 4. Setup Bottom Panel (Controls)
        JPanel bottomPanel = new JPanel();
        removeButton = new JButton("Remove Selected Task");
        bottomPanel.add(removeButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // 5. Add Event Listeners (Behavior)

        // Logic: When "Add" is clicked, take text from field and put it in the model.
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    taskModel.addElement(task); // Update Model (View updates automatically)
                    taskField.setText(""); // Clear input
                }
            }
        });

        // Logic: When "Remove" is clicked, find selected index and remove from model.
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskModel.remove(selectedIndex); // Update Model
                }
            }
        });
    }

    public static void main(String[] args) {
        // Good Practice: Run UI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new ToDoListSimple().setVisible(true);
        });
    }
}
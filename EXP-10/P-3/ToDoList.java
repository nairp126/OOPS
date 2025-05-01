import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToDoList extends JFrame {
    private DefaultListModel<String> taskModel;
    private JList<String> taskList;
    private JTextField taskField;
    private JButton addButton;
    private JButton removeButton;

    public ToDoList() {
        setTitle("To-Do List");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Top panel for task input and add button
        JPanel topPanel = new JPanel(new BorderLayout());
        taskField = new JTextField();
        addButton = new JButton("Add");
        topPanel.add(taskField, BorderLayout.CENTER);
        topPanel.add(addButton, BorderLayout.EAST);
        add(topPanel, BorderLayout.NORTH);

        // List and model for displaying tasks
        taskModel = new DefaultListModel<>();
        taskList = new JList<>(taskModel);
        add(new JScrollPane(taskList), BorderLayout.CENTER);

        // Bottom panel for remove button
        JPanel bottomPanel = new JPanel();
        removeButton = new JButton("Remove Selected Task");
        bottomPanel.add(removeButton);
        add(bottomPanel, BorderLayout.SOUTH);

        // Add button action: add the task from the text field to the list model
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String task = taskField.getText().trim();
                if (!task.isEmpty()) {
                    taskModel.addElement(task);
                    taskField.setText("");
                }
            }
        });

        // Remove button action: remove the selected task from the list model
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = taskList.getSelectedIndex();
                if (selectedIndex != -1) {
                    taskModel.remove(selectedIndex);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ToDoList().setVisible(true);
        });
    }
}
// The above code implements a simple To-Do List application using Java Swing.
// It allows users to add tasks to a list and remove selected tasks. The GUI consists of a text field for task input, an "Add" button, a list to display tasks, and a "Remove Selected Task" button. The application uses a DefaultListModel to manage the list of tasks.
// The action listeners for the buttons handle adding and removing tasks from the list model.
// The code is structured to create a user-friendly interface and handle user input effectively.
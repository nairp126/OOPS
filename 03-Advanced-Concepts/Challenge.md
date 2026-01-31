# 🔐 Challenge: The Secret Diary App

**Topic**: Advanced Concepts (Swing GUI, File I/O, Exception Handling)

## 📝 Problem Statement

You are building a digital diary application.
The app should allow the user to type their thoughts into a window and click a button to save them to a file on the computer.

Key Features:

1. **GUI**: A large text area to type in, and a "Save" button.
2. **File I/O**: When "Save" is clicked, write the text to `my_secret_diary.txt`.
3. **Feedback**: Show a message dialog saying "Entry Saved!" or "Error!" if something goes wrong.

---

## 💻 Starter Code

Copy this code into `SecretDiary.java`.

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class SecretDiary {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Secret Diary");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Step 1: Create the Text Area
        JTextArea textArea = new JTextArea();
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Step 2: Create the Save Button
        JButton saveBtn = new JButton("Save Entry");
        frame.add(saveBtn, BorderLayout.SOUTH);

        // Step 3: Add Logic
        saveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String content = textArea.getText();
                
                // TODO 1: logical check - Don't save empty files!
                if (content.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Diary entry cannot be empty!");
                    return;
                }

                // TODO 2: Write 'content' to "diary.txt"
                // HINT: Use try-with-resources and FileWriter
                try {
                    // File writing logic here...
                    // File file = new File("diary.txt");
                    // ...
                    
                    JOptionPane.showMessageDialog(frame, "Saved successfully!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage());
                }
            }
        });

        frame.setVisible(true);
    }
}
```

---

## ✅ Acceptance Criteria

1. **Persistence**: After clicking Save, I should be able to open `diary.txt` on my computer and see what I typed.
2. **Stability**: The app must not crash if I try to save.
3. **User Experience**: The user must be notified (via `JOptionPane`) when the save is complete.

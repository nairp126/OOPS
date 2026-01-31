# 🤖 Challenge: The Modern Chatbot

**Topic**: Modern Java (Records, Switch Expressions, Text Blocks)

## 📝 Problem Statement

You are building a Command Line Chatbot for a Customer Support system.
The system receives "Commands" from users.

Requirements:

1. **Data**: Use a `record` called `Command(String action, String data)` to store input.
2. **Logic**: Use the new **Switch Expression** to handle actions like "HELP", "STATUS", "AGENT".
3. **UI**: Use a **Text Block** (`"""`) to print the help menu.

---

## 💻 Starter Code

Copy this code into `ChatbotShim.java`.

```java
import java.util.Scanner;

// TODO 1: Create a record 'Command' with fields: String action, String data

public class ChatbotShim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO 2: Create a Text Block for the menu
        /*
        String menu = """
            ... Welcome to SupportBot ...
            Available commands: HELP, STATUS, AGENT
            """;
        */
        System.out.println("Type a command (e.g., 'HELP', 'STATUS 123'):");

        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("EXIT")) break;

            // Simple parsing logic (assume "ACTION DATA")
            String[] parts = line.split(" ", 2);
            String action = parts[0].toUpperCase();
            String data = parts.length > 1 ? parts[1] : "";

            // TODO 3: Create a Command record instance
            // var cmd = new Command(action, data);

            // TODO 4: Use a Switch Expression to determine the response
            /*
            String response = switch (cmd.action()) {
                case "HELP" -> ...
                case "STATUS" -> "Checking status for id: " + cmd.data();
                // ... handle AGENT and default
            };
            */

           // System.out.println(response);
        }
    }
}
```

---

## ✅ Acceptance Criteria

1. **Conciseness**: The `Command` class must be a `record`. No manual getters/setters!
2. **Expression**: The `switch` must assign a result to a variable (no `System.out.println` inside the cases).
3. **Formatting**: The Help menu must use a Text Block.

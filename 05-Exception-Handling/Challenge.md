# 🚫 Challenge: The Party Bouncer

**Topic**: Exception Handling (Try-Catch, Custom Exceptions, Throw)

## 📝 Problem Statement

You are coding the digital bouncer for an exclusive club.
The system asks for the user's **Age**.

Rules:

1. If the input is **not a number** (e.g., "Twenty"), catch the error and tell them to use digits.
2. If the age is **under 18**, throw a custom `UnderAgeException` and deny entry.
3. If valid (18+), welcome them to the party.

---

## 💻 Starter Code

Copy this code into `ClubEntry.java`.

```java
import java.util.Scanner;

// TODO 1: Create a custom exception called 'UnderAgeException'
// class UnderAgeException extends ...

public class ClubEntry {
    
    // TODO 2: Add 'throws UnderAgeException' to the method signature
    public static void checkAge(int age) {
        if (age < 18) {
            // TODO 3: Throw the exception with a message "You are too young!"
        } else {
            System.out.println("Welcome to the Club! 💃🕺");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your ID (Age): ");

        try {
            String input = scanner.nextLine();
            int age = Integer.parseInt(input); // This might fail!

            // Check eligibility
            checkAge(age);

        } catch (NumberFormatException e) {
            // TODO 4: Handle non-numeric input (e.g., "abc")
            System.out.println("Error: Please enter a valid number.");
        
        } catch (Exception e) {
            // TODO 5: Handle UnderAgeException here
            // Print: "Access Denied: " + e.getMessage()
        } finally {
            scanner.close();
        }
    }
}
```

---

## ✅ Acceptance Criteria

1. **Robustness**: Entering "Old" instead of numbers should not crash the app (Catch `NumberFormatException`).
2. **Custom Logic**: Entering "15" should trigger your specific `UnderAgeException`.
3. **Success Path**: Entering "21" should print the welcome message.

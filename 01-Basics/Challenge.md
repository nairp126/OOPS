# 🏆 Challenge: The Penny-Pincher ATM

**Topic**: Basics (Variables, Control Flow, Loops, Input)

## 📝 Problem Statement

You have been hired by "Penny-Pincher Bank" to build their very first ATM software.
The bank is simple: they only have **one user** (you) and they don't have a database yet.

Your task is to create a console-based program that runs infinitely until the user chooses to "Exit".
The user starts with a hardcoded balance of **$1000.00**.

The ATM must support:

1. **Check Balance**: Print the current money.
2. **Deposit**: Add money to the balance.
3. **Withdraw**: Remove money from the balance (if they have enough!).
4. **Exit**: Stop the program.

---

## 💻 Starter Code

Copy this code into a file named `SimpleATM.java` and fill in the blanks!

```java
import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 1000.00; // Starting Balance
        boolean isRunning = true; // flag to control the loop

        System.out.println("Welcome to Penny-Pincher ATM!");

        // TODO 1: Create a loop that runs while 'isRunning' is true
        while (/* ??? */) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Your Choice: ");

            int choice = scanner.nextInt();

            // TODO 2: Use a Switch Statement (or if-else) to handle the choice
            switch (choice) {
                case 1:
                    System.out.println("Current Balance: $" + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    // TODO 3: Add logic to update balance. 
                    // EXTRA: Prevent negative deposits!
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = scanner.nextDouble();
                    // TODO 4: Subtract from balance ONLY IF they have enough money.
                    // If not, print "Insufficient Funds".
                    break;
                case 4:
                    System.out.println("Thank you for banking with us!");
                    // TODO 5: Stop the loop
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        
        scanner.close();
    }
}
```

---

## ✅ Acceptance Criteria

1. **Looping**: The program must *not* crash/exit after one transaction. It should ask "Choose an option" again.
2. **Validation**: A user cannot deposit negative money (e.g., `-50`).
3. **Protection**: A user cannot withdraw more than they have. If Balance is `100` and they ask for `200`, print an error.
4. **Termination**: Selecting option `4` must gracefully end the program.

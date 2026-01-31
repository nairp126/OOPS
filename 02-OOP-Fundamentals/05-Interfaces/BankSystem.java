interface Bank {
    void deposit(double amount);

    void withdraw(double amount);
}

class Account implements Bank {
    double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // method to display the current balance.
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Account account = new Account(1000);
        account.displayBalance();
        account.deposit(500);
        account.withdraw(200);
        account.displayBalance();
    }
}

// // The above code demonstrates the use of interfaces and classes in Java.
// // It includes the definition of a Bank interface with methods for deposit
// and withdrawal, and an Account class that implements this interface.
// // The code is structured to create a user-friendly interface and handle user
// input securely.
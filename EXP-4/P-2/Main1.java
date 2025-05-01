
public class Main1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000.0);
        account.checkBalance();
        account.withdraw(500.0);
        account.checkBalance();

        // System.out.println("Balance: $" + account.balance); // can cause error if tried accesing it here
    }
}

class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

// // The above code demonstrates the use of access modifiers in Java.
// // The BankAccount class has private, protected, and default access modifiers for its members.   
// // The main method in the Main1 class creates an instance of BankAccount and performs deposit, withdrawal, and balance check operations.
// // The deposit method is public, allowing access from outside the class, while the withdraw method is protected, allowing access only to subclasses or classes in the same package.
// // The checkBalance method has default access, allowing access only within the same package.
// // This encapsulation of data and methods promotes better security and control over the class's internal state, preventing unauthorized access or modification of the balance.

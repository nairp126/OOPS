
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


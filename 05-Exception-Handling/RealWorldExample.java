// package exception_handling; // Removed to allow running directly from this folder

// Custom Checked Exception
// We extend 'Exception' to force the programmer to handle this case.
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * Real World Example: Bank Transaction.
 * 
 * Concept:
 * - Throwing Exceptions: Signaling that something went wrong using 'throw'.
 * - Custom Exceptions: Creating domain-specific errors (e.g., Not enough
 * money).
 */
public class RealWorldExample {

    // Member variable simulating database state
    private double balance = 100.00;

    /**
     * Withdraws money from the account.
     * 
     * @param amount The amount to withdraw.
     * @throws InsufficientFundsException If balance is too low.
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        System.out.println("Attempting to withdraw: $" + amount);

        if (amount > balance) {
            // Stop execution immediately and signal error
            throw new InsufficientFundsException("Withdrawal failed. Balance: $" + balance + ", Requested: $" + amount);
        }

        balance -= amount;
        System.out.println("Success! New Balance: $" + balance);
    }

    public static void main(String[] args) {
        RealWorldExample account = new RealWorldExample();

        // Scenario 1: Valid Transaction
        try {
            account.withdraw(50.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }

        System.out.println("---------------------------------");

        // Scenario 2: Invalid Transaction
        try {
            account.withdraw(200.00); // This will throw exception
        } catch (InsufficientFundsException e) {
            // Graceful handling: Tell the user why it failed
            System.out.println("Transaction Error: " + e.getMessage());
        }
    }
}

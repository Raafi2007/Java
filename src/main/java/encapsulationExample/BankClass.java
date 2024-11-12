package encapsulationExample;

public class BankClass {

    private double balance;

    // Constructor to initialize balance
    public BankClass(double initialBalance) {
        if (initialBalance > 0) {
            balance = initialBalance;
        } else {
            balance = 0;
            System.out.println("Initial balance must be positive. Setting balance to 0.");
        }
    }

    // Getter method for balance (allows reading the balance)
    public double getBalance() {
        return balance;
    }

    // Method to deposit money (balance should not be negative)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money (balance should not go negative)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account details (for demonstration)
    public void displayAccountDetails() {
        System.out.println("Account Balance: " + getBalance());
    }
}

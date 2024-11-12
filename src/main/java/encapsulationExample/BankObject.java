package encapsulationExample;

public class BankObject {

    public static void main(String[] args) {

        // Create a BankAccount object with an initial balance
        BankClass myAccount = new BankClass(1000.00);

        // Display account details
        myAccount.displayAccountDetails();

        // Deposit money
        myAccount.deposit(500.00);
        myAccount.displayAccountDetails();

        // Attempt to withdraw money
        myAccount.withdraw(300.00);
        myAccount.displayAccountDetails();

        // Attempt to withdraw more money than the balance
        myAccount.withdraw(1500.00);

        // Attempt t withdraw less amount
        myAccount.withdraw(111.00);

        // Final account details
        myAccount.displayAccountDetails();
    }
}
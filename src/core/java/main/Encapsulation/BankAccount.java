package core.java.main.Encapsulation;


/*
 *  The BankAccount class encapsulates the account number and balance data,
 *  and provides methods to deposit, withdraw, and retrieve the balance.
 *  The class hides the internal state (accountNumber and balance) from outside access, 
 *  promoting information hiding and data integrity.
 *  Clients interact with the BankAccount object through the public methods, 
 *  abstracting away the implementation details of the account operations.
 */
public class BankAccount {
	
	private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}

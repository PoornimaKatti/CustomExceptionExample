package com.java.Exception;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
//The exception is caught and handled, printing a message indicating the insufficient funds.
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Current balance: " + balance);
        }

        // If there are sufficient funds, proceed with the withdrawal
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

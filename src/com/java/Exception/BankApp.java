package com.java.Exception;

public class BankApp {
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount myAccount = new BankAccount(1000);

        try {
            // Try to withdraw $1500 (more than the balance)
            myAccount.withdraw(1500);
        } catch (InsufficientFundsException e) {
            // Catch the custom exception and handle it
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

package com.gevernova.objectinspector.bankAccount;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1001);
        BankAccount accountTwo = new BankAccount("Bob", 1002);

        // instanceof check before displaying details
        if (account instanceof BankAccount) {
            account.displayAccountDetails();
        }

        if (accountTwo instanceof BankAccount) {
            accountTwo.displayAccountDetails();
        }

        // Call static method
        BankAccount.getTotalAccounts();
    }
}

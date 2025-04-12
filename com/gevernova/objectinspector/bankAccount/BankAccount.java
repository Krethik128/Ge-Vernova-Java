package com.gevernova.objectinspector.bankAccount;

class BankAccount {
    public static String bankName;
    private static int totalAccounts;

    static {
        bankName = "ABC Bank";
        totalAccounts = 0;
    }

    public String accountHolderName;
    private final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++; // update account count when new object created

    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

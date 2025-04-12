package com.gevernova.constructors.accessmodifiers.bankAccountManagment;

class SavingsAccount extends BankAccount {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);   //  public
        System.out.println("Account Holder: " + accountHolder);   //  protected
        // System.out.println("Balance: " + balance);  Not accessible directly
        System.out.println("Balance: " + getBalance());           //  use getter
    }
}

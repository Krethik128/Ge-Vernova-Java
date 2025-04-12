package com.gevernova.oops.polymorphism.bankingSystem;

// Savings account with interest and loan support
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        double interest = getBalance() * 0.04; // 4% annual interest
        System.out.println("Interest on Savings Account: ₹" + interest);
    }

    @Override
    public void applyForLoan() {
        System.out.println("Applying for personal loan under Savings Account.");
    }

    @Override
    public void calculateLoanEligibility() {
        double eligibleAmount = getBalance() * 3; // 3x balance loan eligibility
        System.out.println("Loan Eligibility: ₹" + eligibleAmount);
    }
}

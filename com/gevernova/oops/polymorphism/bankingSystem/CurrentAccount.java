package com.gevernova.oops.polymorphism.bankingSystem;

// Current account with no interest, but loan support
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("No interest on Current Account.");
    }

    @Override
    public void applyForLoan() {
        System.out.println("Applying for business loan under Current Account.");
    }

    @Override
    public void calculateLoanEligibility() {
        double eligibleAmount = getBalance() * 5; // 5x balance loan eligibility
        System.out.println("Loan Eligibility: ₹" + eligibleAmount);
    }
}

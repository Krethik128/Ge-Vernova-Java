package com.gevernova.exceptionHandling.bankAccount;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message){
        super(message);
    }
}

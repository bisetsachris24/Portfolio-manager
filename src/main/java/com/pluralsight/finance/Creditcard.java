package com.pluralsight.finance;

public class Creditcard implements Valuable {

    private final String name;
    private final String accountNumber;
    private double balance;

    public Creditcard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Creditcard(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    /** Increase the amount owed. */
    public void charge(double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public void pay(double amount) {
        if (amount <= 0 || amount > balance) {
            return;
        }
        balance -= amount;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * A credit card balance is debt, so it reduces net worth.
     * Returned as a negative number.
     */
    @Override
    public double getValue() {
        return -balance;
    }

    @Override
    public String toString() {
        return String.format("CreditCard[name=%s, acct=%s, balance=%.2f, value=%.2f]",
                name, accountNumber, balance, getValue());
    }
}


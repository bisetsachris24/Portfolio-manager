package com.pluralsight.finance;

    public class BankAccount implements IValuable {

        private final int accountNumber;
        private final String owner;
        private double balance;

        public BankAccount(int accountNumber, String owner, double balance) {
            this.accountNumber = accountNumber;
            this.owner = owner;
            this.balance = balance;
        }


        public void deposit(double amount) {
            if (amount <= 0) {
                return;
            }
            balance += amount;
        }


        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                return;
            }
            balance -= amount;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getOwner() {
            return owner;
        }

        public double getBalance() {
            return balance;
        }

        /**
         * For a bank account, its value is simply the current balance.
         */
        @Override
        public double getValue() {
            return balance;
        }

        @Override
        public String toString() {
            return String.format("BankAccount[#%d, owner=%s, balance=%.2f]",
                    accountNumber, owner, balance);
        }
    }


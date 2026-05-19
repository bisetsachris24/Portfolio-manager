package com.pluralsight;

import com.pluralsight.finance.*;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        // Try to deposit money into both accounts.
        account1.deposit(100);


        ((BankAccount) account2).deposit(100);

        System.out.println(account1);

        Portfolio portfolio = new Portfolio("My Net Worth", "Pam");

        portfolio.add(account1);                              // BankAccount
        portfolio.add(new Gold(10));                          // 10 oz of gold
        portfolio.add(new Jewelry("Wedding Ring", 18));       // 18k ring
        portfolio.add(new House(2025, 2200, 4));              // 2,200 sqft house
        portfolio.add(new Creditcard("Pam", "9999", 3500));   // $3,500 debt

        System.out.println();
        System.out.println(portfolio);
        System.out.printf("Net value:       $%.2f%n", portfolio.getValue());
        System.out.println("Most valuable:   " + portfolio.getMostValuable());
        System.out.println("Least valuable:  " + portfolio.getLeastValuable());
    }
}


package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.IValuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        BankAccount account2 = new BankAccount(456, "Gary", 1500);

        // try to deposit money into both accounts
        account1.deposit(100);


        // To call deposit() you'd have to cast back to BankAccount:
        account2.deposit(100);

        System.out.println(account1);
        System.out.println(account2);
    }
}

package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        Valuable    account2 = new BankAccount(456, "Gary", 1500);

        // Try to deposit money into both accounts.
        account1.deposit(100);

        // The line below will NOT compile. account2's reference type is
        // Valuable, and the Valuable interface does not declare deposit().
        // The compiler only allows calls that the declared type promises,
        // regardless of what the underlying object actually is.
        //
        // account2.deposit(100);   // <-- uncomment to see the compile error

        // Workaround: cast back to BankAccount to access deposit().
        // This works because the underlying object really is a BankAccount.
        ((BankAccount) account2).deposit(100);

        System.out.println(account1);
    }
}

//QAP 1 - Software Design, Architecture, and Testing
//Written By: Kara Balsom
//Date Written: February 3, 2023

package com.keyin.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {

    //Test for the debit() method.
    @Test
    public void testDebit() {
        Account accountToDebit = new Account("1","accountToDebit", 4000);

        accountToDebit.debit(100);

        Assertions.assertTrue(accountToDebit.getBalance() == 3900);
        System.out.println("Account Balance: " + accountToDebit.getBalance());
    }

    //Test for the if/else statements in the debit() method that prevent withdrawing more than is in the account.
    @Test
    public void testDebitLimit() {
        Account accountToDebit = new Account("1","accountToDebit", 4000);

        accountToDebit.debit(4100);

        Assertions.assertTrue(accountToDebit.getBalance() == 4000);
        System.out.println("Account Balance: " + accountToDebit.getBalance());
    }

    //Test for the credit() method.
    @Test
    public void testCredit() {
        Account accountToCredit = new Account("1","accountToCredit", 4000);

        accountToCredit.credit(100);

        Assertions.assertTrue(accountToCredit.getBalance() == 4100);
        System.out.println("Account Balance: " + accountToCredit.getBalance());
    }

    //Test for the transferTo() method.
    @Test
    public void testTransferTo() {
        Account accountToDebit = new Account("1","accountToDebit", 5000);
        Account accountToCredit = new Account("2","accountToCredit", 4000);

        accountToDebit.transferTo(1000, accountToCredit);

        Assertions.assertTrue(accountToCredit.getBalance() == 5000);
        System.out.println("Account 1 Balance: " + accountToDebit.getBalance());
        System.out.println("Account 2 Balance: " + accountToCredit.getBalance());
    }

    //Test for the if/else statements in the debit() method that prevent transferring more than is in the accountToDebit.
    @Test
    public void testTransferToLimit() {
        Account accountToDebit = new Account("1","accountToDebit", 5000);
        Account accountToCredit = new Account("2","accountToCredit", 4000);

        accountToDebit.transferTo(5100, accountToCredit);

        Assertions.assertTrue(accountToCredit.getBalance() == 4000);
        System.out.println("Account 1 Balance: " + accountToDebit.getBalance());
        System.out.println("Account 2 Balance: " + accountToCredit.getBalance());
    }

    //Test for the toString() method.
    @Test
    public void testToString() {
        Account accountToString = new Account("1","accountToString", 5000);

        String obj1 = accountToString.toString();
        String obj2 = "[Account ID: 1, Account Name: accountToString, Account Balance: 5000]";

        Assertions.assertEquals(obj1, obj2);
    }
}

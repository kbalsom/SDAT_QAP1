package com.keyin.account;

//QAP 1 - Software Design, Architecture, and Testing
//Written By: Kara Balsom
//Date Written: February 1, 2023

//Creates the Account class and the three private instance variables:
public class Account {
    private String id;
    private String name;
    private int balance = 0;

    // Creates a constructor with two string parameters, i and n. It sets the id
    // and name of the Account object to the values of the parameters passed in:
    public Account(String i, String n) {
        this.id = i;
        this.name = n;
    }

    // Creates a constructor with two string parameters, i and n, and one integer
    // parameter, b. It sets the id, name, and balance of the account on which the
    // method is invoked
    // to the values of the parameters passed in:
    public Account(String i, String n, int b) {
        this.id = i;
        this.name = n;
        this.balance = b;
    }

    // Creates a get method, which gets the id of the account on which the method is
    // invoked and returns
    // the id:
    public String getId() {
        return this.id;
    }

    // Creates a get method, which gets the name of the account on which the method
    // is invoked and returns the name:
    public String getName() {
        return this.name;
    }

    // Creates a get method, which gets the balance of the account on which the
    // method is invoked and returns the balance:
    public int getBalance() {
        return this.balance;
    }

    // Creates a public method called credit(), which takes an integer (called
    // amount) as a parameter. It adds the amount to the balance of the account on
    // which the
    // method is invoked,
    // and returns the updated balance:
    public int credit(int amount) {
        this.balance += amount;
        return (this.balance);
    }

    // Creates a public method called debit(), which takes an integer (called
    // amount)
    // as a parameter. If the amount is less than or equal to the balance of the
    // account on which the method is invoked, the amount is subtracted from the
    // balance. Else, The
    // system will print out a statement. The method returns the balance:
    public int debit(int amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount Exceeds Balance.");
        }
        return (this.balance);
    }

    // Creates a public method called transferTo(), which takes an integer (amount),
    // and an Account object (another) as parameters. If the amount is less than or
    // equal to the balance of the
    // account on which the method is invoked, the amount is subtracted from
    // that account and added to the another account. Else, The
    // system will print out a statement. The method returns the balance of the
    // account on which the method is invoked:
    public int transferTo(int amount, Account another) {
        if (amount <= this.balance) {
            another.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount Exceeds Balance.");
        }
        return (this.balance);
    }

    // Creates a method called toString(), which returns the string below:
    public String toString() {
        return ("[Account ID: " + this.id + ", Account Name: " + this.name + ", Account Balance: " + this.balance
                + "]");
    }
}

package com.company;

/**
 * Created by Jessica Qin on 2/16/2017.
 */
public class BankAccount implements Comparable
{
    public BankAccount(String nm, double amt) {
        name = nm;
        balance = amt;
    }

    public int compareTo(Object obj)
    {
        BankAccount otherAccount = (BankAccount) obj;

        int retValue;
        if (balance<otherAccount.balance)
        {
            retValue = -1;
        }
        else if (balance > otherAccount.balance)
        {
            retValue = 1;
        }
        else
        {
            retValue = 0;
        }
        return retValue;
    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public String name;
    public double balance;
}

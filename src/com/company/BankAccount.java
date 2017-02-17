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
        char [] cName = name.toCharArray();
        int firstInitial = cName[0];
        int retValue;

        char[]coName = otherAccount.name.toCharArray();
        int firstInitialOther = coName[0];

        if (firstInitial<firstInitialOther)
        {
            retValue = -1;
        }
        else if (firstInitial > firstInitialOther)
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

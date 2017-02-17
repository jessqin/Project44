package com.company;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
	    NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);

        String name;
        int j;
        BankAccount ba [] = new BankAccount[5];

        for (j = 0; j<ba.length; j++);
        {
            Scanner kbReader = new Scanner(System.in);
            System.out.println("Please enter the name to whom the account belongs.");
            name = kbReader.nextLine();

            System.out.println("Please enter the amount of the deposit.");
            double amount = kbReader.nextDouble();
            System.out.println(" ");

            ba[j] = new BankAccount(name,amount);

        }

        Comparator comp = new BA_Comparator();
        Arrays.sort(ba,comp);

        for (int x = 0; x<ba.length; x++)
        {
            System.out.println(ba[x].name + ">>>" + ba[x].balance);
        }




    }
}

package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class TestMethodEquals {
    public static void main(String[] args) {
        ArrayList<BankAccount1> myArrList = new ArrayList<>();

        BankAccount1 b1 = new BankAccount1();
        b1.acctNumber = "0043";
        b1.acctType = 4;

        BankAccount1 b2 = new BankAccount1();
        b2.acctNumber = "0043";
        b2.acctType = 4;

        myArrList.add(b1);
        myArrList.add(b2);

        System.out.println(myArrList.contains(b2));
    }
}

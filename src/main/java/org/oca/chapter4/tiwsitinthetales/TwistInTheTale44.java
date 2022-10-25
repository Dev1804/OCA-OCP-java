package org.oca.chapter4.tiwsitinthetales;

import java.util.ArrayList;

public class TwistInTheTale44 {
    public static void main(String[] args) {
        String one = "One";
        String two = new String("Two");

        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add(one);
        myArrList.add(two);

        ArrayList<String> yourArrList = myArrList;
        one.replace("O", "B");

        for(String val: myArrList)
            System.out.println(val + ":");
        for(String val: yourArrList)
            System.out.println(val + ":");

        // Answer a
    }
}

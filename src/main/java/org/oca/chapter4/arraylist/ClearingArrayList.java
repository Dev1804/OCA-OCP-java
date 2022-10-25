package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class ClearingArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");
        myArrList.clear();

        for (String val : myArrList) {
            System.out.println(val);
        }
    }
}

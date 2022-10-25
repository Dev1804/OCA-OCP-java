package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class AddAllArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");

        ArrayList<String> yourArrList = new ArrayList<>();
        yourArrList.add("Three");
        yourArrList.add("Four");

        myArrayList.addAll(1, yourArrList);
        for (String val : myArrayList) {
            System.out.println(val);
        }
    }
}

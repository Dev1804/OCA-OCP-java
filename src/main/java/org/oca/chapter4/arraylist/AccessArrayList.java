package org.oca.chapter4.arraylist;


import java.util.ArrayList;

public class AccessArrayList {
    public static void main(String[] args) {
        // Access elements of an ArrayList using an enhanced for loop
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Four");
        myArrayList.add(2, "Three");

        for (String element : myArrayList) {
            System.out.println(element);
        }
    }
}

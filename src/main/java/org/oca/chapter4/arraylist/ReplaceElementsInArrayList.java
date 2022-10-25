package org.oca.chapter4.arraylist;

import java.util.ArrayList;

// You can modify an ArrayList by either replacing an existing element in the ArrayList or modifying all of its existing values
public class ReplaceElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Three");
        // use set(int index, T value) method to replace an element
        myArrayList.set(1, "One and Half"); // Replace ArrayList element at position 1 ("Two") with "One and Half"

        for (String elem : myArrayList) {
            System.out.println(elem);
        }

    }
}

package org.oca.chapter4.arraylist;

import java.util.ArrayList;

/**
 * get(int index) - returns the element at the specified position in the list
 * size() - returns the number of elements in this list
 * contains(Object o) - returns true if this list contains the specified field element
 * indexOf(Object o) - returns the index of the first occurrence of the specified element in this list, or -1 if this list doesn't contain it
 * lastIndexOf(Object o) - returns the index of the last occurrence of the specified element in this list, -1 if it doesn't contain it
 */
public class AccessingIndividualElements {
    public static void main(String[] args) {
        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("One");
        myArrList.add("Two");

        String valFromList = myArrList.get(1);
        System.out.println(valFromList);
        System.out.println(myArrList.size());
    }
}

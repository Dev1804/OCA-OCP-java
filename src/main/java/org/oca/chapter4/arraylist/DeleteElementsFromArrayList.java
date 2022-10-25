package org.oca.chapter4.arraylist;

// ArrayList defines 2 methods to remove its elements, as follows:
// 1. remove(int index) - this method removes the element at the specified position in this list
// 2. remove(Object o) - this method removes the first occurrence of the specified element from this list, if it's present

import java.util.ArrayList;

public class DeleteElementsFromArrayList {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("One");
        StringBuilder sb2 = new StringBuilder("Two");
        StringBuilder sb3 = new StringBuilder("Three");
        StringBuilder sb4 = new StringBuilder("Four");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb3);
        myArrList.add(sb4);
        myArrList.remove(1);
        for (StringBuilder element : myArrList)
            System.out.println(element);
        myArrList.remove(sb3);
        myArrList.remove(new StringBuilder("Four"));
        System.out.println();
        for (StringBuilder element : myArrList)
            System.out.println(element);
    }
}

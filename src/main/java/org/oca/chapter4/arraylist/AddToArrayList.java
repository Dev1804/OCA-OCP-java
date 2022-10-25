package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("one"); // add element at the end
        list.add("two");
        list.add("four");
        list.add(2, "three"); // add element at the specified position
    }
}

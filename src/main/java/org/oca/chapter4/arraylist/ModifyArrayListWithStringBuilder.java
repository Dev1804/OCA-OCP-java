package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class ModifyArrayListWithStringBuilder {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrayList = new ArrayList<>();
        myArrayList.add(new StringBuilder("One"));
        myArrayList.add(new StringBuilder("Two"));
        myArrayList.add(new StringBuilder("Three"));

        for(StringBuilder element: myArrayList) {
            element.append(element.length());
        }

        for (StringBuilder element : myArrayList) {
            System.out.println(element);
        }
    }
}

package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class MiscMethodsArrayList5 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> myArrList = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("Jan");
        StringBuilder sb2 = new StringBuilder("Feb");
        myArrList.add(sb1);
        myArrList.add(sb2);
        myArrList.add(sb2);
        ArrayList<StringBuilder> assignedArrList = myArrList;

        ArrayList<StringBuilder> clonedArrayList = (ArrayList<StringBuilder>) myArrList.clone();

        sb1.append("something");

        System.out.println(myArrList == assignedArrList);
        System.out.println(myArrList == clonedArrayList);

        StringBuilder myArrVal = myArrList.get(0);
        StringBuilder assignedArrVal = assignedArrList.get(0);
        StringBuilder clonedArrVal = clonedArrayList.get(0);

        System.out.println(myArrVal == assignedArrVal);
        System.out.println(myArrVal == clonedArrVal);
    }
}

package org.oca.chapter4.arraylist;

import java.util.ArrayList;

public class MiscMethodsArrayList4 {
    public static void main(String[] args) {
        ArrayList<MyPerson> myArrList = new ArrayList<>();

        MyPerson p1 = new MyPerson("Shreya");
        MyPerson p2 = new MyPerson("Paul");

        myArrList.add(p1);
        myArrList.add(p2);
        myArrList.add(p2);

        System.out.println(myArrList.contains(new MyPerson("Shreya")));
        System.out.println(myArrList.contains(p1));
        System.out.println(myArrList.indexOf(new MyPerson("Paul")));
        System.out.println(myArrList.indexOf(p2));
        System.out.println(myArrList.lastIndexOf(new MyPerson("Paul")));
        System.out.println(myArrList.lastIndexOf(p2));
    }
}

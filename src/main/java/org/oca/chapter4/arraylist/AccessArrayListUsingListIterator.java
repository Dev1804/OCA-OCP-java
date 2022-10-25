package org.oca.chapter4.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class AccessArrayListUsingListIterator {
    public static void main(String[] args) {
        // Access elements of an ArrayList using an enhanced for loop
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("One");
        myArrayList.add("Two");
        myArrayList.add("Four");
        myArrayList.add(2, "Three");

        ListIterator<String> iterator = myArrayList.listIterator(); // get the iterator

        while(iterator.hasNext()){ // Use hasNext() to check whether more elements exist
            String elem = iterator.next();
            if(elem.equals("Four")){
                iterator.remove();
            }
            System.out.println(elem); // call next() to get the next item from iterator
        }

        for(String elem : myArrayList){
            System.out.println(elem);
        }
    }
    // It’s not possible to remove elements from an ArrayList while
    //iterating it using a for loop.
}

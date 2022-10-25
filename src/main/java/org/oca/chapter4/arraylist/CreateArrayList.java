package org.oca.chapter4.arraylist;

import java.util.ArrayList;

/**
 * It offers the best combination of features offered by an array and the List data structure
 * Most commonly used operations are:
 *  - add items to a list
 *  - modify items in a list
 *  - items from a list
 *  - iterate over the items
 *  ArrayList can be compared with a resizable array
 *  Automatically increases and decreases in size
 *  Don't need to specify an initial size to create an ArrayList
 *
 *  Properties to remember:
 *  1. It implements the interface List
 *  2. It allows null values to be added to it
 *  3. It implements all list operations (add, modify, and delete values)
 *  4. It allows duplicate values to be added to it
 *  5. It maintains its insertion order
 *  6. You can use either Iterator or ListIterator to iterate over the items of an ArrayList
 *  7. It supports generic making it type safe(you have to declare the type of the element that should be added to an ArrayList with its declaration)
 *
 */
public class CreateArrayList {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
    }
}

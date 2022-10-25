package org.oca.chapter5.flowcontrol.loops;

public class NestedForLoops {
    public static void main(String[] args) {
        for (int hrs =1; hrs < 6; hrs++) {
            for(int min = 1; min <= 60; min++){
                System.out.println(hrs + ":" + min);
            }
        }
        // initialize a multidimensional array using nested for loops

        int multiArr[][]; // array declaration
        multiArr = new int[2][3]; // array allocation

        for(int i = 0; i < multiArr.length; i++) { // outer for loop
            for (int j = 0; j < multiArr[i].length; j++) { // inner for loop
                multiArr[i][j] = i + j;
            } // inner for loop ends
        } // outer for loop ends
    }
}

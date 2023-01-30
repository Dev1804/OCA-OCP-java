package org.oca.chapter2.operators;

public class TwistInTheTale22 {
    public static void main(String[] args) {
        boolean b1, b2, b3, b4, b5, b6; // line 1
        b1 = b2 = b3 = true;            // line 2
        //b4 = 0;                         // line 3
        //b5 = 'false';                   // line 4
        //b6 = yes;                       // line 5

/**
 * a. The code on line 1 will fail to compile
 * b. Can't initialize multiple variables like the code on line 2
 * c. The code on line 3 is correct
 * d. Can't assign 'false' to a boolean variable
 * e. The code on line 5 is correct
 */

// Incorrect answers: a, b, c, e

        // Compile with success
        int int1;
        long long2;
        long2 = int1 = 10;

        int i1;
        long l2;
//        i1 = l2 = 10;

    }
}

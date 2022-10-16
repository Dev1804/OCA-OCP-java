package org.oca.chapter3.overloadedmethod;

public class OverloadedMethodsInJava {

//    Can't define overloaded methods by just switching an array parameter into a vararg or vice versa
//    Behind the scenes, varargs are implemented as arrays

    double calcAverage(int[] marks) {
    return 0d;
    }

/*    double calcAverage(int... marks) { // compilation error, method already defined
        return 0d;
    }*/


}

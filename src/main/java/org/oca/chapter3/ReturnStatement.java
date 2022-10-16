package org.oca.chapter3;

public class ReturnStatement {
    double weight;
    double calcAverage(int marks1, int marks2) {
        double avg = 0;
        avg = (marks1 + marks2) / 2.0;
        return avg; // return statement
    }

    // Methods that don't return a value aren't required to define a return statement
    void setWeight(double val) {
        weight = val;
    }

    // return statement can be used in a method even if it doesn't return a value
    // usually used to define an early exit from a methiod

    void setWeight1(double val) { // method with return type void can use return statement
        if (val < -1) return; // this compiles ok.control exits the method if this condition is true
        weight = val;
    }
/*    void setWeight(double val) {
        return;
        weight = val; // unreachable statement
    }*/


}

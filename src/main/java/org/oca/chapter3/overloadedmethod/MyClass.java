package org.oca.chapter3.overloadedmethod;

public class MyClass {
    double calcAverage(double marks1, int marks2) {
        return (marks1+marks2) / 2.0;
    }

    double calcAverage(int marks1, double marks2) {
        return (marks1+marks2) / 2.0;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.calcAverage(2d, 3); // ambiguous method call
    }

}

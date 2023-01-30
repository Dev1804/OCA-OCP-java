package org.oca.chapter2.operators;

public class LogicalOperators {
    // AND , OR , NOT
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a > 20 && b > 10); // false
        System.out.println(a > 20 || b > 10); // true
        System.out.println(! (b > 10));       // false
        System.out.println(! (a > 20));       // true

        // && and || are also short-circuit operators
        int marks = 8;
        int total = 10;
        System.out.println(total < marks && ++ marks > 5);
        System.out.println(marks); // 8
        System.out.println(total == 10 || ++marks > 10);
        System.out.println(marks); // 8

    }
}

package org.oca.chapter3.accessobjectfields;

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.daysOffWork(1, 2, 3, 4));
        System.out.println(e.daysOffWork(1, 2, 3));
    }
}

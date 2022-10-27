package org.oca.chapter6.extendinginterfaces;

public class Employee implements MyInterface{
    String name;

    @Override
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}

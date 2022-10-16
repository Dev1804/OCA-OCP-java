package org.oca.chapter3.passingvaluestomethods;

public class Office {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.age);

        e.modifyVal(e.age);
        System.out.println(e.age);
    }
}

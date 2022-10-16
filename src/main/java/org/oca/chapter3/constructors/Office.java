package org.oca.chapter3.constructors;

public class Office {
    public static void main(String[] args) {
        Employee emp = new Employee(); //  Constructor is called on object creation
        System.out.println(emp.age);

        Employee emp1 = new Employee(30, "Pavni Gupta");

    }
}

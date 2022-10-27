package org.oca.chapter6.binding;

public class Office {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee pgr = new Programmer();

        System.out.println(emp.name);
        System.out.println(pgr.name);

        emp.printName();
        pgr.printName();
    }
}

class Employee {
    String name = "Employee";

    void printName (){
        System.out.println(name);
    }
}

class Programmer extends Employee {
    String name = "Programmer";

    void printName() {
        System.out.println(name);
    }
}

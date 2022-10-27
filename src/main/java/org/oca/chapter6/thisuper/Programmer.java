package org.oca.chapter6.thisuper;

public class Programmer extends Employee {
    String name;

    void setNames() {
        this.name = "Programmer";
        super.name = "Employee";
    }

    void printNames (){
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.setNames();
        programmer.printNames();
    }
}

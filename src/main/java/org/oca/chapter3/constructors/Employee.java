package org.oca.chapter3.constructors;

public class Employee {
//  Instance variables
    String name;
    int age;
//  Initializer blocks are used to initialize the variables of anonymous classes
//  Anonymous class is a type of inner class
    {
        System.out.println("Employee:initializer 1");
        for (int i = 0; i <5; i++) {
            System.out.println("loop - " + i);
        }
    }

    Employee() {
        age = 20;   // Initialize age
        System.out.println("Constructor");
    }

    Employee(int newAge) {
        // this must be the first statement in constructor
        this(newAge, null); // implicit reference that's accessible to all objects that refer to an object itself

//      you can't call a constructor from any other method in your class
    }

    Employee(int newAge, String newName) {
        name = newName;
        age = newAge;
        System.out.println("Constructor");
    }

    {
        System.out.println("Employee:initializer 2");
    }

}

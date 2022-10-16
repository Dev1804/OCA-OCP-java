package org.oca.chapter3.classvariables;

public class TestPhone {
    public static void main(String[] args) {
        Phone.softKeyboard = false; // Accesses the class variable by using the name of the class. It can be accessed even before any of the class's objects exist

        Phone p1 = new Phone();
        Phone p2 = new Phone();
        System.out.println(p1.softKeyboard); // prints false. A class variable can be read by using the objects of the class
        System.out.println(p2.softKeyboard); // prints false

        p1.softKeyboard = true; // A change in the value of this variable will be reflected when the variable is accessed via objects or class name
        System.out.println(p1.softKeyboard); // prints true
        System.out.println(p2.softKeyboard); // prints true
        System.out.println(Phone.softKeyboard); // prints true

        // All the options Phone.softKeyboard, p1.softKeyboard, p2.softKeyboard refer to the same single shared copy.
        // Java refers to the type of reference variables p1 and p2 and not to the objects referred to by them
        // Accessing a static variable using a null reference won't throw an exception:

        Phone p3 = null;
        System.out.println(p3.softKeyboard);
    }
}

package org.oca.chapter3.classvariables;

// a class variable is defined by using the keyword static
// it belongs to a class, not to individual objects of the class
// a class variables is shared across all objects (objects don't have a separate copy of the class variables)
// Not needed an instance of an object to access a class variable. Just use the namme of the class it belongs to

public class Phone {

    static boolean softKeyboard = true; // class variable
}

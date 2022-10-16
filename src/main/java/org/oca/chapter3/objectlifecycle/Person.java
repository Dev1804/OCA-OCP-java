package org.oca.chapter3.objectlifecycle;

// Explaining the life cycle of an ojbject
// creation
// dereference by reassignment
// garbage collection

// the task of reclaiming unused memory is taken care of by Java's garbage collector - which is a low priority thread
// It runs periodically and frees up space occupied by unused objects
// java.lang.Object is the base class of all Java classes
// All Java classes can override the method finalize, which is executed right before an object is garbage collected

// Finalize used to free up resources being used by an object, although doing so isn't recommended as it executions isn't guaranteed to happen
public class Person { // Class Person



}

class ObjectLifeCycle {
    Person person; // declaring a reference variable of type Person
    Person personRefVar = new Person(); // Declaring and initializing a variable of type Person

    // All objects come into being by using new operator. The String class is an exceptional case because String ref vars can also be initialized by using string literal values
    String obj1 = new String("eJava"); // new String is redundant
    String obj2 = "Guru";
}

class ObjectLifeCycle2 {
    Person person = new Person();
    ObjectLifeCycle2(){
        new Person(); // An unreferenced object
    }
}

package org.oca.chapter4.arrays;

// Arrays of type interface
public class Test {
    MyInterface[] interfaceArray = new MyInterface[]{
            new MyClass1(),
            null,
            new MyClass2()
    };
}


interface MyInterface{ }
class MyClass1 implements MyInterface{}
class MyClass2 implements MyInterface{}

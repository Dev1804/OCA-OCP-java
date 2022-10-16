package org.oca.chapter3.passingvaluestomethods;

// Passing primitives to methods
// Value of a primitive data type is copied and passed to a method
// Hence, the variable whose value was copied doesn't change

public class Employee {

    int age;

    void modifyVal(int age) {
        age = age +1;
        System.out.println(age);
    }
}

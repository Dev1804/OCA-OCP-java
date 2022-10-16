package org.oca.chapter3.overlappingvarscopes;

// Rules are needed to prevent conflicts between variables from different scopes
public class MyPhone {
    static boolean softKeyboard = true; // class variable
    String phoneNumber; // instance variable
//    boolean softKeyboard = true; // already defined in the scope. Class var and instance var can't be defined using the same name in the class

//     Similarly, local variables and method parameters can't be defined with the same name

    void myMethod(int weight) {
//        int weight = 10; // Variable 'weight' is already defined in the scope
    }

//    A class can define local variables with the same name as the instance or class variables also called shadowing
    void myMethodWithSameVarName(){
        boolean softKeyboard = true; // local variable can coexist with class variable softKeyboard
        String phoneNumber; // local variable phoneNumber can coexist with instance variable phoneNumber
    }


}

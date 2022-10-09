package org.oca.chapter2.operators;

/**
 * 4 categories of operator types:
 * 1. Assignment =, +=, -=, *=, /= -> assign value to a variable
 * 2. Arithmetic +, - , *, / , %, ++, -- -> Add, Subtract, multiply, divide and modulus primitives
 * 3. Relational <, <= , >, >=, == , != -> compare primitive
 * 4. Logical !, &&, || => Apply NOT, AND and OR logic to primitives
 */
public class WorkingWithOperators {

    public static void main(String[] args) {
        double myDouble2 = 10.2;
        int a = 10;
        int b = a;
        float float1 = 10.2F;
        float float2 = float1;

        System.out.println("myDouble2 = " + myDouble2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("float1 = " + float1);
        System.out.println("float2 = " + float2);

        b+=a;
        System.out.println("Addition += " + b);
        a = b = 10;
        b-=a;
        System.out.println("Subtraction -=" + b);
        a = b = 10;
        b*=a;
        System.out.println("Multiplication *= " + b);
        a = b =10;
        b/=a;
        System.out.println("Division /= " + b);


        System.out.println();
        System.out.println();

        // Squeeze the variables that can store a larger range of values into variables with a shorter range

        long num = 100976543356L;
        // int val = num; // compiler doesn't allow this required int but provided long

        int intVal = 1009;
        long longVal = intVal;

        // You can also assign multiple values on the same line using the assignment operator.

        int val1 =7, val2=10, val3=8;
        val1 = val2 = val3; // assignment starts from right to left; the value of c is assigned to b and the value of b is assigned to a
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
    }
}

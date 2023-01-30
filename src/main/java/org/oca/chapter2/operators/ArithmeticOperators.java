package org.oca.chapter2.operators;

/**
 * Addition
 * Subtraction
 * Division (quotient)
 * Multiplication
 * Modulus (reminder in division)
 * Unary increment operator; increments value by 1
 * Unary decrement operator; decrements value by 1
 *
 * Unary operators can be used with variables but not with literal values
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        // When addition operator applied to char values, their corresponding ASCII values are added and subtracted.
        char char1 = 'a';
        System.out.println(char1);
        System.out.println(char1 + char1);

        // The following code outputs 0
        char char2 = 'a';
        System.out.println(char2 - char2);

        // All arithmetic operator can be used with char primitive data type, including unary increment and decrement operators
        // byte, short and char values are widened to int when used as operands for arithmetic operations
        // If a long value is involved somewhere, then everything, including int values, is widened to long

        // This explains why you can not assign the sum of two byte values to a short type:

       // byte age1 = 10;
       // byte age2 = 20;
       // short sum = age1 + age2; // -> required type short, provided: int
                                 // incompatible types: possible lossy conversion from int to short
        final byte age1 = 10;
        final byte age2 = 20;
        short sum = age1 + age2;
        System.out.println(sum);

    }
}

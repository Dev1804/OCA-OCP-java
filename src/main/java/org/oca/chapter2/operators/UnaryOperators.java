package org.oca.chapter2.operators;

/**
 * ++ and -- unary operators work with a single operand
 * they are used to increment or decrement the value of a variable by 1
 * They can be used in prefix and postfix notation. In prefix notation, the operator appears before its operand
 */
public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        ++a; // prefix notation
        a++; // postfix notation

        int b = 20;
        int c = 10;
        int d = b - ++c; // prefix

        System.out.println(d);
        System.out.println(c);

        int x = 50;
        int y = 10;
        int z = x -y++; // postfix
        System.out.println(z); // 40
        System.out.println(y); //11

        a = a++ + a + a-- - a-- + ++a;
        System.out.println(a); // 38
    }
}

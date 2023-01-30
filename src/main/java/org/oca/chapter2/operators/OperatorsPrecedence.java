package org.oca.chapter2.operators;

/**
 * Postfix expression++ expression--
 * Unary ++expression, -- expression, +expression, -expression, !
 * Multiplication *(multipy), / (divide), %(reminder)
 * Addition +(add), - (subtract)
 * Relational <, >, <=, >=
 * Equality ==, !=
 * Logical AND &&
 * Logical OR ||
 * Assignment =, +=, -=, *=, /=, %=
 */
public class OperatorsPrecedence {
    public static void main(String[] args) {
        int int1 = 10, int2 = 20, int3 = 30;
        System.out.println((10 % 20)); // (0 reminder 10)
        System.out.println(int1 % int2 * int3 + int1 /int2); // 300
        System.out.println(int1 % int2 * (int3 + int1)/int2); // 20
        // we can use parentheses to override the default operator precedence
    }
}

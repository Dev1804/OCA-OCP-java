package org.oca.chapter2.operators;

/**
 * Evaluate the result of the expression from above
 */
public class TwistInTheTail23 {
    public static void main(String[] args) {
        int a = 10;
        a = ++a + a + --a - --a + a++;
        System.out.println(a); // 32
    }
}

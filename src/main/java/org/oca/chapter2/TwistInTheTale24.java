package org.oca.chapter2;

public class TwistInTheTale24 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 40;

        System.out.println(a++ > 10 || ++b < 30); // true
        System.out.println(a > 90 && ++b<30); //false
        System.out.println(!(c > 20) && a == 10);// false
        System.out.println(a >= 99 || a<=33 && b ==10); // false
        System.out.println(a >= 99 && a<=33 || b ==10); // false

        // Because

        /**
         *  For the expression (a++ > 10 || ++b < 30), because a++ > 10 evaluates to false,
         * both operands will evaluate.
         *  For the expression (a > 90 && ++b < 30), because a > 90 evaluates to false, the second operand won’t execute.
         *  For expression (!(c > 20) && a == 10), because !(c > 20) evaluates to false, the
         * second operand won’t execute.
         *  The expression (a >= 99 || a <= 33 && b == 10) has three operands together with
         * the OR (||) and AND (&&) short-circuit operators. Because the short-circuit operator
         * AND has higher operator precedence than the short-circuit operator OR, the expression is evaluated as follows:
         * (a >= 99 || (a <= 33 && b == 10))
         */

/*
        Assignment operator =, +=, -=, *=, /=
        Arithmetic operator +, - , /, * ,%, unary ++ --
        Relational operator < <= > >= == !=
        Logical operator && || !
*/
    }
}

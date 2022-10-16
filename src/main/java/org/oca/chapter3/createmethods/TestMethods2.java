package org.oca.chapter3.createmethods;

public class TestMethods2 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.getWeight(); // method getWeight returns a double value, but this value isn't assigned to a variable
        /**
         * You can optionally assign the value returned by a method to a variable. If you don’t assign the returned value from a method, it’s neither a compilation error nor a runtime exception.
         */
    }
}

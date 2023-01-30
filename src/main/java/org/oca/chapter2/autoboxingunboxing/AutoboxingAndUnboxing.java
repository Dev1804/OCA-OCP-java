package org.oca.chapter2.autoboxingunboxing;


/**
 * Autoboxing - is the automatic conversion of a primitive data type to an object of the corresponding wrapper class
 * Unboxing = is the reverse process (unbox the primitive data type)
 */
public class AutoboxingAndUnboxing {

    public static void main(String[] args) {
        Double d1 = new Double(12.67);
        System.out.println(d1.compareTo(21.68)); // prints -1, since 12.67 < 21.68

        // compareTo accepts a wrapper of type Double, but we just provided a double primitive data type
        // at runtime the primitive double is autoboxing using valueOf (primitive data type)

        // System.out.println(d1.compareTo(Double.valueOf(21.68D))

    }
}

package org.oca.chapter2.autoboxingunboxing;

import java.util.ArrayList;

// An example of unboxing with autoboxing
public class Unboxing {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(); // list of Double
        list.add(12.12); // autoboxing add double
        list.add(11.24);
        Double total = 0.0;

        for(Double d: list)
            total +=d; // Unbox to use operator += with total

        System.out.println(total);
    }
}

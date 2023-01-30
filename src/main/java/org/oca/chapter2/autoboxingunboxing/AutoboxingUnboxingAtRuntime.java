package org.oca.chapter2.autoboxingunboxing;

import java.util.ArrayList;
import java.util.Iterator;

public class AutoboxingUnboxingAtRuntime {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(new Double(12.12D));
        arrayList.add(new Double(11.24D));
        Double total = Double.valueOf(0.0D);

        for(Iterator iterator = arrayList.iterator(); iterator.hasNext();){
            Double d = (Double) iterator.next();
            total = total.doubleValue() + d.doubleValue();
        }

        long a8 = 123456789;
        System.out.println(total);
        // Wrapper classes are immutable. What happens when you add a value to the variable total, a Double object?
        // In this case the variable total refers toa new Double object
        // Unboxing a wrpper reference variable, which refers to null, will throw a NullPointerException
    }
}

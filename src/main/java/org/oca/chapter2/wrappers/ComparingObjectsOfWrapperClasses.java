package org.oca.chapter2.wrappers;

/*
Method equals() always compares the primitive value stored by a wrapper instance
== compares object references. It returns true if the variables being compared to refer to the same instance
 */
public class ComparingObjectsOfWrapperClasses {

    // Comparing references for objects initialized using valueOf(), constructor or autoboxing

    public static void main(String[] args) {
        Integer i1 = new Integer(10); // Constructor always create new instances
        Integer i2 = new Integer(10);

        Integer i3 = Integer.valueOf(10); // valueOf returns cached copy for int value
        Integer i4 = Integer.valueOf(10);

        Integer i5 = 10; // Autoboxing returns cached copy for applicable values
        Integer i6 = 10;

        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i4 == i5);
        System.out.println(i5 == i6);
        System.out.println();

        System.out.println(i1.equals(i2));
        System.out.println(i3.equals(i4));
        System.out.println(i4.equals(i5));
        System.out.println(i5.equals(i6));


        Integer i11 = new Integer(200);
        Integer i12 = new Integer(200);

        Integer i13 = Integer.valueOf(200);
        Integer i14 = Integer.valueOf(200);

        Integer i15 = 200;
        Integer i16 = 200;

        System.out.println(i11 == i12);
        System.out.println(i13 == i14);
        System.out.println(i14 == i15);
        System.out.println(i15 == i16);

        // You can't compare wrapper instances for equality using equals() or == , if they aren't of the same type
        // the code won't compile for instances that are compared using ==
        // When compare using equals(), the outpul will be false:

        Integer obj1 = 100;
        Short obj2= 100;

        System.out.println(obj1.equals(obj2)); // output false
//        System.out.println(obj1 == obj2); // doesn't compile

    }
}

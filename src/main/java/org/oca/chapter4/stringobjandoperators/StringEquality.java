package org.oca.chapter4.stringobjandoperators;

// Comparing reference variables to instance values
public class StringEquality {
    public static void main(String[] args) {
        String var1 = new String("Java");
        String var2 = new String("Java");

        System.out.println(var1.equals(var1));
        System.out.println(var1 == var2);

        String var3 = "code";
        String var4 = "code";

        System.out.println(var3.equals(var4));
        System.out.println(var3 == var4);

        System.out.println();
        System.out.println(var3.equals(var4));
        System.out.println(var3 == var4);
        System.out.println(var3 != var4);

        // equality of values returned by String methods

        String lang1 = "Java";
        String lang2 = "JaScala";

        String returnValue1 = lang1.substring(0,1);
        String returnValue2 = lang2.substring(0,1);

        System.out.println(returnValue1 == returnValue2);
        System.out.println(returnValue1.equals(returnValue2));

    }
}

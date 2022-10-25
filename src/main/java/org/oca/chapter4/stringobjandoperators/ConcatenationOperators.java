package org.oca.chapter4.stringobjandoperators;

public class ConcatenationOperators {
    public static void main(String[] args) {
        String aString = "OCJA" + "Cert" + "Exam";
        System.out.println(aString);

        int num = 10;
        int val = 12;
        String aStr = "OCJA";
        String anotherStr = num + val + aStr;
        System.out.println(anotherStr);

        anotherStr = "" + num+ val + aStr;
        System.out.println(anotherStr);

//      When you use += to concatenate String values, ensure that the variable you are using has been initialized (and doesn't contain null).

        String lang = "Java";
        lang += " is everywhere";

        String initializedToNull = null;
        initializedToNull += "Java";
        System.out.println(initializedToNull);
    }
}

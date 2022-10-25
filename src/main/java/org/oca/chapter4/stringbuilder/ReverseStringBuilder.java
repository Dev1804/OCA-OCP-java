package org.oca.chapter4.stringbuilder;

// TRIM()
// Unlike the class String, the class StringBuilder doesn't define the method trim.
// An attempt to use it with this class will prevent your code from compiling

// REVERSE()
// It reverses the sequence of characters of a StringBuilder
public class ReverseStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.reverse();
        System.out.println(sb1);

        // You can't use the method reverse to reverse a substring of String-Builder
    }
}

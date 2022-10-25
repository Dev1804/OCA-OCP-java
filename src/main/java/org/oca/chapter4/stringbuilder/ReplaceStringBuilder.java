package org.oca.chapter4.stringbuilder;

// REPLACE()
// It replaces a sequence of characters, identified by their positions, with another String
public class ReplaceStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.replace(2, 4, "ABCD");
        System.out.println(sb1); // prints 01ABCD456
    }
}

package org.oca.chapter4.stringbuilder;

// SUBSEQUENCE()
// apart from using the method substring, you can also use the method subSequence to retrieve a subsequence of a StringBuilder
// It returns objects of type CharSequence
public class SubSequenceStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456");
        System.out.println(sb1.subSequence(2, 4));
        System.out.println(sb1); // method subsequence doesn't modify the existing value of a StringBuilder object
    }
}

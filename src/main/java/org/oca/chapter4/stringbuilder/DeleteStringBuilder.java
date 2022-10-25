package org.oca.chapter4.stringbuilder;

// DELETE and DELETECharAt()
// Method delete removes the characters in a substring of the specified StringBuilder
// Method deleteCharAt removes the char at the specified position
public class DeleteStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("0123456"); // removes characters at positions starting from 2 to 4, excluding 4
        sb1.delete(2,4);
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("0123456");
        sb2.deleteCharAt(2); // deletes character at position 2
        System.out.println(sb2);
    }
}

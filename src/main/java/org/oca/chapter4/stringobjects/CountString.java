package org.oca.chapter4.stringobjects;

public class CountString {
    public static void main(String[] args) {
        String summer = new String("Summer"); // 1
        String summer2 = "Summer2"; // 2
        System.out.println("Summer"); // already added in the String constant pool
        System.out.println("autumn"); // 3
        System.out.println("autumn" == "summer"); // 4 - autumn already exists but summer is created. Pay attention to the case sensitive strings
        String autumn = new String("Summer"); // 5
    }
}

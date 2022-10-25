package org.oca.chapter4;
import java.time.LocalTime;
public class InitialClass {
    public static void main(String[] args) {
        String s1 = new String("Paul");
        String s2 = new String("Paul");

        String s3 = "Paul";
        String s4 = "Paul";

        System.out.println(s1 == s3);
        System.out.println(s1 ==s2);
        System.out.println(s3 == s4);

        String s5 = "Morning";
        System.out.println(s5 == "Morning");

        String girl = new String("Shreya");
        char[] name = new char[]{'P', 'a', 'u', 'l'};

        String s6 = new String(name);
        System.out.println(s6);
        StringBuilder sb = new StringBuilder("String Builder");
        String s7 = new String(sb);

        StringBuffer sbf = new StringBuffer("String Buffer");
        String s8 = new String(sbf);

        System.out.println(s7);
        System.out.println(s8);
    }
}

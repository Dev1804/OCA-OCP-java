package org.oca.chapter5.flowcontrol.swichstatement;

public class Q52 {
    public static void main(String[] args) {
        int i = 10;
        do
            while (i++ < 15)
                i = i+20;
        while (i < 2);
        System.out.println(i);
    }
}

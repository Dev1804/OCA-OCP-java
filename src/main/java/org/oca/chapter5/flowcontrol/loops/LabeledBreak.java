package org.oca.chapter5.flowcontrol.loops;

public class LabeledBreak {
    public static void main(String[] args) {
        String[] programmers = {"Outer", "Inner"};

        outer:
        for(String outer: programmers){
            for (String inner : programmers) {
                if(inner.equals("Inner"))
                    break outer;
                System.out.println(inner + ":");
            }
        }
    }
}

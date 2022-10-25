package org.oca.chapter5.flowcontrol.loops;

public class LabeledContinueStatement {
    public static void main(String[] args) {
        String[] programmers = {"Paul", "Shreya", "Selvan", "Harry"};
        outer:
        for (String name1 : programmers) {
            for (String name : programmers) {
                if(name.equals("Shreya"))
                    continue outer;
                System.out.println(name);
            }
        }
    }
}

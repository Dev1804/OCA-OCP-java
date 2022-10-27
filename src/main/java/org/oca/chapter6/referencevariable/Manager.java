package org.oca.chapter6.referencevariable;

public class Manager extends Employee implements Interviewer{

    int teamSize = 15;
    @Override
    public void conductInterview() {
        System.out.println("Manager - conducting interview");
    }
}

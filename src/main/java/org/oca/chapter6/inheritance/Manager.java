package org.oca.chapter6.inheritance;

import java.time.LocalDateTime;

public class Manager extends Employee implements Interviewer, Trainable {
    protected int teamSize;
    public void reportProjectStatus() {
    }

    @Override
    public void conductInterview() {
        System.out.println("Mgr - conductInterview");
    }

    @Override
    public void attendTraining() {
        System.out.println("Mgr - attendingTraining");
    }

    // Overriding method with return type String
    @Override
    public String submitInterviewStatus() {
        System.out.println("Accept");
        return null;
    }

    static String bookConferenceRoom(LocalDateTime dateTime, int dur) {
        System.out.println("Manager-bookConferenceRoom");
        return null;
    }
}

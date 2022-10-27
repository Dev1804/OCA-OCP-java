package org.oca.chapter6.inheritance;

import java.time.LocalDateTime;

public class Project {
    public static void main(String[] args) {
        Interviewer inv = new Manager();
        Interviewer.bookConferenceRoom(LocalDateTime.now(), 2);

        Employee emp = new Programmer();
        emp.defaultPlan();

        Programmer pgr = new Programmer();
        pgr.defaultPlan();

        Employee.defaultPlan();
        Programmer.defaultPlan();
    }
}

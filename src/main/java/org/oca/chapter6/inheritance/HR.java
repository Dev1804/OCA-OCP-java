package org.oca.chapter6.inheritance;

public class HR {
    void sendInvitation(Employee employee) {
        System.out.println("Send invitation to " + employee.name +
                " at " + employee.address);
    }
}

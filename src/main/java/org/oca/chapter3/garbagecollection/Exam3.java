package org.oca.chapter3.garbagecollection;

// Automatic memory management
// Using System.GC() or Runtime.getRuntime().GC()
// you can't start execution of Java's garbage collector, just to request the execution of it by calling the above
// The garbage collector can also reclaim memory from a group of referenced objects
// This group of variable is referred to as an island of isolation
public class Exam3 {
    private String name;
    private Exam3 other;

    public Exam3(String name) {
        this.name = name;
    }

    public void setExam(Exam3 exam) {
        other = exam;
    }
}

class IslandOfIsolation {
    public static void main(String[] args) {
        Exam3 php = new Exam3("PHP");       // initialize variable php
        Exam3 java = new Exam3("Java");     // initialize variable java

        php.setExam(java);                        // assign object referred by java to php.exam
        java.setExam(php);                        // assign object referred by php to java.exam

        php = null;                               // assign null to php
        java = null;                              // assign null to java

        if (1 + 1 + 1 + 1 + 1 == 5) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

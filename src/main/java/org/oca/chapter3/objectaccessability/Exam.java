package org.oca.chapter3.objectaccessability;

public class Exam {
    String name;

    public void setName(String newName) {
        name = newName;
    }
}

class ObjectLife1 {
    public static void main(String[] args) {
        Exam myExam = new Exam();                   // object creation
        myExam.setName("OCA Java Programmer 1");    // access method
        myExam = null;                              // set reference variable to null
        myExam = new Exam();                        // another object creation
        myExam.setName("PHP");                      // access method
    }
    // Because the first object can no longer be accessed using any variable, it’s considered garbage by Java and deemed eligible to
    // be sent to the garbage bin by Java’s garbage collector
}

package org.oca.chapter3.objectinaccessibility;


import org.oca.chapter3.objectaccessability.Exam;
// Variable goes out of scope
// When an object goes out of scope, it can no longer be referenced and is marked for garbace collection
public class TestObjectInaccessibility {
    public void myMethod() {
        int result = 88;
        if (result > 78) {
            Exam myExam1 = new Exam();
            myExam1.setName("Android"); // scope of local variable myExam1
        } else {                        // start of else block
            Exam myExam2 = new Exam();
            myExam2.setName("MySQL");
        }                               // end of else block
    }
}

// Dereferencing by reassignment
class Exam2 {
    String name;

    public Exam2(String name) {
        this.name = name;
    }
}

class ObjectLife {
    public static void main(String[] args) {
        Exam2 myExam = new Exam2("PHP");
        myExam = null;
        myExam = new Exam2("SQL");
        myExam = new Exam2("Java");

        Exam2 yourExam = new Exam2("PMP");
        yourExam = myExam;
    }
}

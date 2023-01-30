package org.oca.chapter3.localvariables;

/**
 * Local variables have the shortest scope (life span)
 */
public class Student {
    private double marks1, marks2, marks3;      // instance var
    private double maxMarks = 100;              // instance var

    public double getAverage(){
        double avg = 0; // local variable avg
        avg = ((marks1 + marks2 + marks3) / (marks3*3)) *100; // Nan 0 divided by something
        return avg;
    }

    public double getAverageIfCond(){
        if (maxMarks > 0) {
            double avg = 0; // avg variable is local to if block
            avg = (marks1 + marks2 + marks3) / (maxMarks * 3) * 100;
            return avg;
        } else {
/*            avg = 0;
            return avg;*/ // not accessible - variable avg can't be accessed because it's local to the if block. Variables local to the if block can't be accessed in the else block
        }

        return 0;
    }

    public void localVariableInLoop() {
        for (int ctr = 0; ctr < 5; ++ctr) {
            System.out.println(ctr); // variable ctr is defined within the for loop
        }
//        System.out.println(ctr); // variable ctr isn't accessible outside the for loop; this line won't compile
    }
    public void setAverage(double val){
//        avg = val     // this code won't compile because avg si inaccessible outside the method getAverage
    }

//    Can a local variable be accessed in a method, before its declaration?
    public void forwardReference() {
//        The answer is no. A forward reference to local variable isn't allowed
//        int a = b; // can not resolve symbol b -> illegal forward reference
        int b = 20;
    }

//    If you reverse the declaration of variables, the code will compile
    public void noForwardReference() {
        int b = 20;
        int a = b;
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println(student1.getAverage());

    }
}

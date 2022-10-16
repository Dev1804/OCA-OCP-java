package org.oca.chapter3.createmethods;

public class EJavaTestMethods2 {
    public static void main(String[] args) {
        Phone p = new Phone();
        double newWeight = p.getWeight(); // compile successfully
//        int newWeight2 = p.getWeight(); // required type int, provided double -> compilation error

        // You can instead make it happen by an explicit cast
        int newWeight2 = (int) p.getWeight();

        // But an explicit cast won't work with data types that aren't compatible:

//        boolean newWeight3 = (boolean) p.getWeight(); // inconvertible types
    }

    double calcAverage(int marks1, int marks2) {
        double avg = 0;
        avg = (marks1 + marks2) / 2.0;
        return avg;
    }

    // the following code shows a method that doesn't accept any method parameters:

    void printHello() {
        System.out.println("Hello");
    }

    // Invalid definition of a method that accepts no parameters:

/*    void printHello(void) { // error: identifier expected
        System.out.println("Hello");
    }*/
}

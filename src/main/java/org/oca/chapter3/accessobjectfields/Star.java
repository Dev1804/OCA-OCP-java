package org.oca.chapter3.accessobjectfields;

public class Star {
    double starAge; // instance variable starAge

    public void setAge(double newAge) {
        starAge = newAge; // setter method (mutator used to set the value of a variable)
    }

    public double getAge() { // getter method (accessor - retrieve the value of a method)
        return starAge;
    }
}

package org.oca.chapter3.encapsulation;


/**
 * Encapsulation and information hiding used interchangeably
 */
public class Phone {
//    Instance variables that store the state of an object of Phone
    String model;
    String company;
    private double weight;

    public void setWeight(double val) {
        if (val >= 0 && val <= 1000) {
            weight = val;
        }
    }

    public double getWeight() {
        return  weight;
    }

    void makeCall(String number) {

    }

    void receiveCall() {

    }
}

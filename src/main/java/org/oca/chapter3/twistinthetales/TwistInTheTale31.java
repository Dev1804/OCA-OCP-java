package org.oca.chapter3.twistinthetales;

// Twist in the tale 3.1
// class phone
public class TwistInTheTale31 {
    String phoneNumber = "123456789";

    void setNumber() {
        String phoneNumber;
        phoneNumber = "987654321";
    }
}

class TestPhone {
    public static void main(String[] args) {
        TwistInTheTale31 p1 = new TwistInTheTale31();
        p1.setNumber();
        System.out.println(p1.phoneNumber);
    }

    // answer a -> 123456789
}

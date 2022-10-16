package org.oca.chapter3.encapsulation;

public class Home {
    public static void main(String[] args) {
        Phone ph = new Phone();

        ph.setWeight(-12.23);
        System.out.println(ph.getWeight());

        ph.setWeight(77712.23);
        System.out.println(ph.getWeight());

        ph.setWeight(12.23);
        System.out.println(ph.getWeight());
    }
}

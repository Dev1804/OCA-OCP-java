package org.oca.chapter6.implementmultipleinterfaces;

import static org.oca.chapter6.implementmultipleinterfaces.Jumpable.MIN_DISTANCE;

public class Animal implements Jumpable, Moveable{
    public Animal() {
        System.out.println(MAX_DISTANCE);
    }

    @Override
    public String currentPosition() {
        return "Home";
    }

    @Override
    public void relax() {
        System.out.println("Watch movie");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.currentPosition());
    }

}

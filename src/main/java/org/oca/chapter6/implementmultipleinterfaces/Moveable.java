package org.oca.chapter6.implementmultipleinterfaces;

public interface Moveable {
    String MIN_DISTANCE = "SMALL";
    abstract String currentPosition();

    default void relax() {
        System.out.println("No moving");
    }
}

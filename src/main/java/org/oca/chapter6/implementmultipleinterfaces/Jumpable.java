package org.oca.chapter6.implementmultipleinterfaces;

public interface Jumpable {
    int MIN_DISTANCE = 10;
    int MAX_DISTANCE = 100;

    abstract String currentPosition();

    default void relax(){
        System.out.println("No jumping");
    }
}

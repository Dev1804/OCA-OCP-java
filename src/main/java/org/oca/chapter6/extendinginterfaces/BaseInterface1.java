package org.oca.chapter6.extendinginterfaces;

public interface BaseInterface1 {
    String getName();

    default void getMyName() {
        System.out.println("Base1");
    }
}

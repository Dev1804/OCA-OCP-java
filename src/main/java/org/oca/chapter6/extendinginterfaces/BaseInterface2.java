package org.oca.chapter6.extendinginterfaces;

public interface BaseInterface2 {
    String getName();

    default void getMyName() {
        System.out.println("Base2");
    }
}

package org.oca.chapter6.extendinginterfaces;

public interface MyInterface extends BaseInterface1, BaseInterface2{

    @Override
    default void getMyName() {
        BaseInterface1.super.getMyName();
    }
}

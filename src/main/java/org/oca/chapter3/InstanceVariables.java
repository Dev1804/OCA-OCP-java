package org.oca.chapter3;

// Instance is another name for an object
// An instance variable is available for the life of an object
// Accessible to all the instance (non-static) methods
public class InstanceVariables {
    private boolean tested; // instance variable tested

    public void setTested(boolean val) {
        tested = val; // Variable tested is accessible in the method setTested
    }
    public boolean isTested() {
        return tested; // variable tested is also accessible here
    }
}

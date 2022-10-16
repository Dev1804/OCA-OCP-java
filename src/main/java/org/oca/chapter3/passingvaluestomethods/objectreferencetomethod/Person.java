package org.oca.chapter3.passingvaluestomethods.objectreferencetomethod;

public class Person {
    private String name;

    public Person(String newName) {
        this.name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String val) {
        name = val;
    }

}

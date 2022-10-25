package org.oca.chapter4.arraylist;

public class MyPerson {
    String name;

    MyPerson(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof MyPerson) {
            MyPerson myPerson = (MyPerson) obj;
            boolean isEqual = myPerson.name.equals(this.name);
            return isEqual;
        }
        else
            return false;
    }
}

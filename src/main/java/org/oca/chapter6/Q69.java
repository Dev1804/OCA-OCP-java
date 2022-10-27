package org.oca.chapter6;

interface  Employee {}
interface Printable extends Employee {
    String print();
}

class Programmer {
    String print() { return ("programmer - Mala Gupta");}
}

class Author extends Programmer implements Printable, Employee{

    @Override
    public String print() {
        return null;
    }
}

public class Q69 {

}

package org.oca.chapter3.passingvaluestomethods.objectreferencetomethod;

public class ModifyObjectReferenceParameter {
    public static void resetValueOfMemberVariable(Person p1) {
        p1.setName("Rodrique");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        System.out.println(person1.getName());
        resetValueOfMemberVariable(person1);
        System.out.println(person1.getName()) ;
    }
}

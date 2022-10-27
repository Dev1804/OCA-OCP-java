package org.oca.chapter6.inheritance;

public class Programmer extends Employee implements  Trainable{

    private String[] programmingLanguages;
    public void writeCode(){}

    public void accessBaseClassMembers(){
        name = "Programmer";
    }

    @Override
    public void attendTraining() {
        System.out.println("Prog - attendingTraining");
    }
}

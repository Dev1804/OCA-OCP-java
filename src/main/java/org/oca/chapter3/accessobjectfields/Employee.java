package org.oca.chapter3.accessobjectfields;

public class Employee {
    String name;
    int age;

//  In case aren't provided values to an object fields, default values are assigned if you try to access or read their values before writing any values to them
    Employee() {
        age = 22;
    }

    public void setName(String val) {
        name = val;
    }

    public void printEmp() {
        System.out.println("name = " + name + " age = " + age);
    }

    public int daysOffWork(int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length ; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }
}

package org.oca.chapter3.methodparameters;

public class Employee {
    public int daysOffWork(int... days) { // may be passed an array or multiple comma separated values
        int daysOff = 0;

        for (int i = 0; i < days.length; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }

    // Can be defined only one variable argument in a parameter list, and it must be the last variable in the parameter list

/*    public int daysOffWork1(String... months, int... days){ // Vararg parameter must be the last in the list
        // code
        return 0;
    }*/

}

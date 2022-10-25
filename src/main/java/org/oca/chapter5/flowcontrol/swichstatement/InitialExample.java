package org.oca.chapter5.flowcontrol.swichstatement;

public class InitialExample {
    public static void main(String[] args) {
        int marks = 20;
        switch (marks) { // compare value of marks
            case 10: System.out.println(10);
                break; // marks the end of the case label
            case 20: System.out.println(20);
                break;
            case 30: System.out.println(30);
                break;
            default: // default case to execute if no matching cases found
                System.out.println("default");
                break;
        }

        String day = "MON";
        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU": System.out.println("Time to work");
                break;
            case "FRI": System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN": System.out.println("Weekend!");
                break;
            default: System.out.println("Invalid day?");
        }

    }
}

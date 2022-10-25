package org.oca.chapter5.twistsinthetale;

public class TwistInTheTale52 {
    public static void main(String[] args) {

        String day = new String("SUN");

        switch (day) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU": System.out.println("Time to work");
                break;
            case "FRI": System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN": System.out.println("Weekend!"); // outputs Weekend
                break;
            default: System.out.println("Invalid day?");
        }
    }
}

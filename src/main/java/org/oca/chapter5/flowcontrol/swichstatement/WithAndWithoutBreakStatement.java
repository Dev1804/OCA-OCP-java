package org.oca.chapter5.flowcontrol.swichstatement;

public class WithAndWithoutBreakStatement {
    public static void main(String[] args) {
        String result;
        int score = 50;
        switch (score) {
            default:
                result = "F";
            case 100:
                result = "A";
            case 50:
                result = "B";
            case 10:
                result = "C";
        }
        System.out.println(result);

        String result1;
        score = 50;
        switch (score) {
            case 100: result1 = "A";
                break;
            case 50 : result1 = "B";
                break;
            case 10 : result1 = "C";
                break;
            default : result1 = "F";
        }
        System.out.println(result1);
    }
}

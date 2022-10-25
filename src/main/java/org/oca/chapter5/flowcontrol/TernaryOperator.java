package org.oca.chapter5.flowcontrol;

public class TernaryOperator {
    public static void main(String[] args) {
        int bill = 2000;
        int discount = (bill > 2000) ? 15:10;
        int discount1 = bill > 200 ? 14:10;

        System.out.println(discount);
        System.out.println(discount1);

        int qty = 10;
        int days = 10;
        int discount3 = bill > 1000 ? qty > 11? 10 : days > 9 ? 20 : 30:5;
        System.out.println(discount3);
    }
}

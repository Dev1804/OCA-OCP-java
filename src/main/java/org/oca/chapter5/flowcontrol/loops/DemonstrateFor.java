package org.oca.chapter5.flowcontrol.loops;

public class DemonstrateFor {
    public static void main(String[] args) {
        int ctr = 12;
        for (int j = 10, k = 14; j <= k; ++j, k = k - 1, ctr--) {
            System.out.println(j + ":" + k + ":" + ctr);
        }

        int tableOf = 25;
        for (int ctr1 = 1, num = 100000; ctr1 <= 5; ++ctr1, print()) {
            System.out.println(tableOf * ctr1);
            System.out.println(num * ctr1);
        }

/*        for(;;){
            System.out.println(true);
        }*/
    }

    static void print(){
        System.out.println("Happy");
    }
}

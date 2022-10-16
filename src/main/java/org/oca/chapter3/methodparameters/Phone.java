package org.oca.chapter3.methodparameters;

public class Phone {
    private boolean tested;

    public void setTested(boolean val) {
        tested = val; // method parameter val is accessible only in the method setTested
    }

    public boolean isTestted () {
//        val = false; // variable val can't be accessed in method isTested. Doesn't compile.
        return tested;
    }

    boolean isPrime(int num) { // method param num
        if (num <= 1) return false;
        boolean result = true; // local variable result

        for (int ctr = num - 1; ctr > 1; ctr--) { // local variable ctr
            if (num % ctr == 0) result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.isPrime(6));
    }
}

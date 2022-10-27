package org.oca.chapter6.lambdaexpressions;

public class NoMethodParameters {
    void print1To10() {
        for (int i = 1; i <= 10; i++)
            System.out.println(i);
    }

    void print10To20() {
        for (int i = 1; i <= 20; i++)
            System.out.println(i);
    }

    void print1To99() {
        for (int i = 1; i <= 99; i++)
            System.out.println(i);
    }
}

class WithMethodParameters {
    void printNumber(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}


class Execute{
    public static void main(String[] args) {
        NoMethodParameters noMethodParameters = new NoMethodParameters();
        noMethodParameters.print10To20();
        noMethodParameters.print1To99();

        WithMethodParameters withMethodParameters = new WithMethodParameters();
        withMethodParameters.printNumber(10 ,20);
        withMethodParameters.printNumber(1 ,20);
        withMethodParameters.printNumber(100 ,200);
        withMethodParameters.printNumber(500 ,1000);

    }
}
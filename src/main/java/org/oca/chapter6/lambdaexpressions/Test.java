package org.oca.chapter6.lambdaexpressions;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Emp e1 = new Emp("Shreya", 5, 9999.00);
        Emp e2 = new Emp("Paul", 4, 1234.00);
        Emp e3 = new Emp("Harry", 5, 8769.00);
        Emp e4 = new Emp("Selvan", 1, 2769.0);

        ArrayList<Emp> empArrayList = new ArrayList<>();
        empArrayList.add(e1);
        empArrayList.add(e2);
        empArrayList.add(e3);
        empArrayList.add(e4);

        Validate validatePerfor = e -> e.getPerformanceRating() >=2;
        Validate validatePerformance1 = (Emp e) -> e.getPerformanceRating() <=3;
        Validate validatePerformance2 = (e) -> {return (e.getPerformanceRating() >= 2);};
//        filter(empArrayList, new ValidatePerformanceRating());

        Predicate<Emp> predicate = e -> e.getPerformanceRating() >= 5;
        filter(empArrayList, predicate);
    }

    private static void filter(ArrayList<Emp> list, Predicate<Emp> rule) {
        for (Emp e : list) {
            if(rule.test(e)){
                System.out.println(e);
            }
        }
    }
}

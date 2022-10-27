package org.oca.chapter6.lambdaexpressions;

public class ValidatePerformanceRating implements Validate{
    @Override
    public boolean check(Emp emp) {
        return (emp.getPerformanceRating() >= 5);
    }
}

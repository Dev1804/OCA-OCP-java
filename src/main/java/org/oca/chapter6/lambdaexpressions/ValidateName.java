package org.oca.chapter6.lambdaexpressions;

public class ValidateName implements Validate{
    @Override
    public boolean check(Emp emp) {
        return (emp.getName().startsWith("P"));
    }
}

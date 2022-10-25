package org.oca.chapter4.stringbuilder;

public class AppendStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append(new Person("Oracle"));
        System.out.println(sb1);
    }
}

class Person {
    String name;
    Person(String str) { name = str; }
}

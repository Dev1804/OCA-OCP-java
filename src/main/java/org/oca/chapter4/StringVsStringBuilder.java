package org.oca.chapter4;

public class StringVsStringBuilder {
    public static void main(String[] args) {
        String letters = "ABCDEFG";
        String stringSpaceDelimited = "     12345 ABCDEFG     ";
        //indexOf()
        System.out.println(letters.indexOf("B"));
        System.out.println(letters.indexOf('B'));
        System.out.println(letters.indexOf("DEF"));
        System.out.println(letters.indexOf('C', 1));
        System.out.println(letters.indexOf("FG", 4));

        // charAt()
        System.out.println(letters.charAt(0));

        // replace()
        System.out.println(letters.replace("CD", "12"));
        System.out.println(letters.replace('F', 'f'));


        // trim()
        System.out.print(":");
        System.out.print(stringSpaceDelimited.trim());
        System.out.print(":\n");

        //substring()
        System.out.println(letters.substring(2));
        System.out.println(letters.substring(3,5));
        System.out.println(letters.subSequence(3,5));

        // length()
        System.out.println(letters.length());

        // startsWith()
        System.out.println(letters.startsWith("A"));
        System.out.println(letters.startsWith("C", 2));

        //endsWith()
        System.out.println(letters.endsWith("G"));

        StringBuilder sb1 = new StringBuilder("0123456");

        // charAt()
        // indexOf()
        // substring()
        // length()
        System.out.println(sb1.length());
        System.out.println(sb1.indexOf("3"));
        System.out.println(sb1.indexOf("4", 2));
        System.out.println(sb1.substring(2));
        System.out.println(sb1.substring(2, 4));

        // append()
        sb1.append(100);
        sb1.append(new Person("John"));
        System.out.println(sb1);

        // insert()
        StringBuilder sb2 = new StringBuilder("abcdefg");
        sb2.insert(2, "r");
        System.out.println(sb2);
        char[] name = {'J', 'a', 'v', 'a'};
        System.out.println(sb2.insert(1,name,1,3));

        // delete() and deleteCharAt()
        StringBuilder sb3 = new StringBuilder("1234");
        sb3.delete(1,3);
        System.out.println(sb3);

        sb3.deleteCharAt(0);
        System.out.println(sb3);

        StringBuilder sb4 = new StringBuilder("1234");
        System.out.println(sb4.deleteCharAt(2));

        // reverse()
        System.out.println(sb4.reverse());

        // REPLACE()
        StringBuilder sb5 = new StringBuilder("0123456");
        sb5.replace(0, 3, "BLA");
        System.out.println(sb5);

        sb5.trimToSize();


    }
}

class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
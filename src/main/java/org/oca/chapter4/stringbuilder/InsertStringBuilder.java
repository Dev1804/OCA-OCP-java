package org.oca.chapter4.stringbuilder;

// INSERT()
// overloaded and accepts any data type
// main difference between append and insert methods is that the insert method enables you to insert the data at a particular position

public class InsertStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r'); // Inserts r at position 2
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb2.insert(1, name, 1, 3); // Inserts at sb2 position 1, values ava from String name
        System.out.println(sb2);
    }
}

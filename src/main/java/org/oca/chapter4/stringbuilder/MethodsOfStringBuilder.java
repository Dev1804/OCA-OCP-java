package org.oca.chapter4.stringbuilder;

/**
 * StringBuilder methods
 * 1. Query positions of chars: charAt, indexOf, substring
 * 2. Modify StringBuilder: append, insert, delete
 * 3. Others: length, trimToSize, setLength
 */
public class MethodsOfStringBuilder {
    public static void main(String[] args) {
        // Append()
        // Add the specified value at the end of the existing value of a StringBuilder
        // it can accept data of any type
        // Accepts all primitives, String, char array and Object
        StringBuilder sb1 = new StringBuilder();
        sb1.append(true);
        sb1.append(10);
        sb1.append('a');
        sb1.append(20.99);
        sb1.append("Hi");
        System.out.println(sb1);

        // you can append a complete char array, StringBuilder or String or its subset as follows:
        StringBuilder sb2 = new StringBuilder();
        char[] name = {'J', 'a', 'v', 'a', '8'};
        sb2.append(name,1, 3); // starting with position 1 append 3 characters, position 1 inclusive
        System.out.println(sb2); // prints  ava
    }
}

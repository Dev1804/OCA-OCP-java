package org.oca.chapter4.stringobjects;

/**
 * Query positions of chars ( charAt, indexOf, substring)
 * Seems to modify String (substring, trim, replace)
 * Others (length, startsWith, endsWith)
 */
public class StringMethods {

    public static void main(String[] args) {

        // Use charAt(int index) to retrieve a character at a specified index of a String
        String name = new String("Paul");
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(4)); // string out of range

        //indexOf
        // search a string for the occurrence of a char or a string, if found, the method returns the first position, otherwise -1
        String letters = "ABCAB";
        System.out.println(letters.indexOf('B'));
        System.out.println(letters.indexOf('S'));
        System.out.println(letters.indexOf("CA"));

        // you can specify also the starting position
        System.out.println(letters.indexOf('B', 2));

        // substring
        // comes in 2 flavors. One that returns a substring of a String from the position you specify to the end of the String
        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);

        // you can specify also the end position

        String result = exam.substring(2, 4);
        System.out.println(result);

        // trim
        // Returns a new String by removing all the leading and trailing white space in a String.
        // White spaces are blanks (new lines, spaces, or tabs)
        String varWithSpaces = "AB CB    ";
        System.out.print(":");
        System.out.print(varWithSpaces);
        System.out.print(":\n");

        // another example that trims the leading and trailing white space
        System.out.print(":");
        System.out.print(varWithSpaces.trim()); // it doesn't remove the space within a String
        System.out.print(":\n");

        // Replace
        // Returns a new String by replacing all the occurrences of a char with another char
        // Instead of specifying a char to be replaced by another char, you can also specify a sequence of characters

        System.out.println(letters.replace('B', 'b'));
        System.out.println(letters.replace("CA", "12"));

/*        System.out.println(letters.replace('B', "b"));  // replace(char, char) or replace (CharSequence, CharSequence)
        System.out.println(letters.replace("b", 'B'));*/

        System.out.println(letters); // prints ABCAB because previous replace() method calls don't affect the char[] array withing letters

        // length
        // retrieves the length of a String
        System.out.println("Shreya".length()); // the length of a String is one number greater than the position that stores its last character
        // the length of String "Shreya" is 6, but its last character, a, is stored at position 5 because the positions start at 0, not 1

        // startsWith() and endsWith()
        // startsWith() determines whether a String starts with a specified prefix, specified as a String
        // you can also specify whether you wish to search from the start of a string or from a particular position
        // this method returns true if a match is found and false otherwise:

        System.out.println(letters.startsWith("AB"));
        System.out.println(letters.startsWith("a"));
        System.out.println(letters.startsWith("A", 3));

        // endsWith
        System.out.println(letters.endsWith("CAB"));
        System.out.println(letters.endsWith("B"));
        System.out.println(letters.endsWith("b"));

        // method chaining
        // it's common practice to use multiple String methods in a single line of code

        String result1 = "Sunday    ".replace(' ', 'Z').trim().concat("M n");
        System.out.println(result1);

        // when chained, the methods are evaluated from left to right

        // note that there's a difference between calling a chain of methods on a String object versus doing the same and then reassigning the return value to the same variable
        String day = "SunDday";
        day.replace('D', 'Z').substring(3);
        System.out.println(day);
        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);

    }
}

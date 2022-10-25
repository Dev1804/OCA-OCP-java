package org.oca.chapter4.stringbuilder;

// StringBuilder class is immutable
// it uses a non-final char array to store its value
// AbstractStringBuilder - the superclass of the class StringBuilder
// take a look to value and count  used to store the value of StringBuilder and its length
public class CreateStringBuilderObjects {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder(); // no argument constructor
        StringBuilder sb2 = new StringBuilder(sb1); // Accepts CharSequence interface (StringBuilder object)
        StringBuilder sb3 = new StringBuilder(50); // Accepts int (specifying initial capacity of StringBuilder)
        StringBuilder sb4 = new StringBuilder("Shreya Gupta"); // Accepts String

    }
}

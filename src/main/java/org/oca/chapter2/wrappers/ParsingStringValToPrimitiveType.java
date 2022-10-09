package org.oca.chapter2.wrappers;


/**
 * List of parseDataTye methods in wrapper classes
 * Boolean - public static boolean parseBoolean (String s)
 * Character - no corresponding parsing method
 * Byte - public static byte parseByte (String s)
 * Short - public static short parseShort (String s)
 * Integer - public static int parseInt (String s)
 * Long - public static long parseLong (String s)
 * Float - public static float parseFloat (String s)
 * Double - public static double parseDouble (String s)
 *
 * All these parsing methods throw NumberFormatExceptions for invalid values
 */
public class ParsingStringValToPrimitiveType {
    public static void main(String[] args) {
        // Examples of throwing NumberFormatException error
        // long long1 = Long.parseLong("12.34"); // Throws NumberFormatException: 12.34 isn't a valid long
        // byte byte1 = Byte.parseByte("1234"); // Throws NumberFormatException: 1234 is out of range for byte
        boolean bool1 = Boolean.parseBoolean("true"); // Returns boolean true
        boolean bool2 = Boolean.parseBoolean("TrUe"); // No exceptions; the String argument is not case-sensitive

        System.out.println(bool1);
        System.out.println(bool2);

        // Boolean.parseBoolean() returns false whenerver the string it parses is not equal to "true" (case-insensitive comparison)
    }
}

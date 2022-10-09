package org.oca.chapter2;

public class IntegerNumbers {

    byte byteNumber = -128; // 8 bits
    byte maxByteNumber = 127;

    short shortNumber = -32768; // /16 bits
    short maxShortNumber = 32767;

    int intNumber = 2147100100; // 32 bits
    long longBNumber = 9060100010001000100l; //64 bits

    // literal values can be represented in binary/octal/hexadecimal by providing 0 for octa, 0b or 0B for binary and 0x or 0X for hexadecima

    int baseDecimal = 267;
    int octVal = 0143;
    int hexVal = 0X10B;
    int binaryVal = 0b1000001011;

    // Java 7 introduced underscores as part of literal values. Grouping individual digits or letters of literal values makes them more readable.
    // The underscores have no effect on the values
    long baseDecimalDelim = 100_267_760;
    long octValDelim = 04_13;
    long hexValDelim = 0x10_BA_75;
    long binValDelim = 0b1_0000_10_11;

    /**
     * Rules to remember for underscores
     * Place an underscore right after the prefix 0 which is used to define an octal literal value
     * Can't start or end a literal value with an underscore
     * Can't place an underscore right after the prefixes 0b, 0B, 0x and 0X which are used to define binary and hexadecimal literal values
     * Can't place an underscore prior to an L suffix ( the L suffix is used to mark a literal value as Long)
     * Can't use an underscore in positions where a string of digits is expected
     */

    // Invalid examples
//    int intLiteral = _100;
//    int intLiteral2 = 100_999_;
//    long longLiteral = 100_L;

    // The following line of colde will compile successfully but will fail at runtime:
    int i = Integer.parseInt("45_98"); // Invalid use of underscore where a string of digits is expected

}

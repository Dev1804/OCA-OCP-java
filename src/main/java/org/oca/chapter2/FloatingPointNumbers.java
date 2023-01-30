package org.oca.chapter2;

/**
 * Float and Double data types
 * You need floating-point numbers where you expect decimal numbers
 * Float requires less space than double, but it can store a smaller range of values
 * Float is less precise than double
 * Float can't represent accurately some numbers even if they are in range. Same limitation applies to double, even if it's a data type that offer more precision.
 * Float - size -> 32 bits
 * Double - size -> 64 bits
 */
public class FloatingPointNumbers {

    // Notice the suffixes F and F while initializing the variables average and orbit
    float average = 20.129F;
    float orbit = 1765.65f;
    double inclination = 120.1762;

    // The default type of decimal literal is double, but suffixing a decimal literal value with F or f, you tell the compiler that
    // the literal value should be treated like a float and not a double

    // Assign a literal decimal value in scientific notation as follows:

    double inclination2 = 1.20176e2; // 120.1762 is same as 1.201762e2 ( the latter is expressed in scientific notation)

    // We can also use the suffix D or d to specify that it's a double value.
    // Because the default tpye of a decimal number is double, the use of the suffix D or d is redundant

    double inclination3 = 120.1762D; // 120.1762D same as 120.1762

    // We can use the underscores for floating point literal values and the rules are the same:
    /* Can't place an underscore prior to a D, d F, or f suffix ( these suffixes are used to mark a floating-point literal as double or float)
       Can't place an underscore adjacent to a decimal point
    * */

    // e.g.
/*    float floatLiteral = 100._48F; // illegal underscore
    double doubleLiteral = 100_.87; // illegal underscore

    float floatLiteral2 = 100.48_F; // illegal underscore
    double doubleLiteral2 = 100.87_d; // illegal underscore*/


}

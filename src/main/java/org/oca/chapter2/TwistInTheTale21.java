package org.oca.chapter2;

/**
 * Twist in the Table 2.1
 * It uses multiple combinations of underscores in numeric literal values
 */
public class TwistInTheTale21 {

    public static void main(String[] args) {
        int baseDecimal = 267;
        int octVal = 0413;
        int hexVal = 0x10B;
        int binVal = 0b100001011;

        System.out.println(octVal);
        System.out.println(hexVal);
        System.out.println(binVal);

        // Output: 534
        System.out.println(baseDecimal + octVal); // will print out a number in its decimal base. It does so regardless of the base number system that you use to initialize a number
        // Output: 534
        System.out.println(hexVal + binVal);

        // We can use a method from the class Integer to print out a value in the binary number system as follows:
        System.out.println(Integer.toBinaryString(0b100001011));
    }

    // Determine which of these does the job correctly

    long var1 = 0_100_267_760;
   /* long var2 = 0_x_4_13; // underscore not allowed here
    long var3 = 0b_x10_BA_75; // underscore right after 0b is not allowed and x,B,A are not allowed in 2 base system
    long var4 = 0b_10000_10_11; // underscore right after 0b is not allowed
    long var5 = 0xa10_AG_75; // G - is not part of hexadecimal number system*/
    long var6 = 0x1_0000_10;
    long var7 = 100__12_12;
}

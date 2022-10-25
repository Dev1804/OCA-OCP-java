package org.oca.chapter5.flowcontrol.swichstatement;

public class SwitchStatementRules {
    /*
    switch supports the following argument types:
    char, byte, short, int, String, Character, Byte, Short, Integer and enum
    if supports only boolean or Boolean

    Switch statement allows expression as arguments as long as it returns a values of type accepted by switch structure
    switch doesn't allow double, float and long arguments
    Also, for nonprimitive types, that is, String and wrapper types, the switch argument must not be null, which would produce a NullPointerException
     */

    public static void main(String[] args) {
        final int a = 50;
        final int b = 20;
        final int c = 30;
        switch (a) {
            case b+c: System.out.println(b+c); break;
        }

    }



}

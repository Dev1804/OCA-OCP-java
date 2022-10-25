package org.oca.chapter4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class SampleExamQuestions {
    /*
    Q4-1. e
    Q4-2. e
    Q4-3. a, d
    Q4-4. (a, b (x)) d e
    Q4-5. a, b, c, e
    Q4-6. (b, e, i, k) a,d,e,h,j
    Q4-7. c
    Q4-8. b
    Q4-9. e
    Q4-10. a
    Q4-11. (b) c
    Q4-12. e
     */

    public static void main(String args[]) { // line 3
        ArrayList<String> ejg = new ArrayList<>(); // line 4

        System.out.println(ejg);
        ejg.add("One"); // line 5
        ejg.add("Two"); // line 6
        System.out.println(ejg.contains(new String("One"))); // line 7
        System.out.println(ejg.indexOf("Two")); // line 8
        ejg.clear(); // line 9
        System.out.println(ejg); // line 10
        System.out.println(ejg.get(1)); // line 11
    }
}

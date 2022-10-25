package org.oca.chapter5.flowcontrol;

public class SampleExamQuestions {
    /*
    Q5-1. b
    Q5-2. (c) d
    Q5-3. (e) c
    Q5-4. b
    Q5-5. (a, d) a , c ,d
    Q5-6. d
    Q5-7. d
    Q5-8. a
    Q5-9. c
    Q5-10. f
     */

    public static void main(String args[]) {
        int num = 3;
        final int num2 = 20;
        switch (num) {
            case 10/3: System.out.println(4);
            break;
            default: System.out.println("default");
        }
    }
}

package org.oca.chapter4.calendardata;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

// define in the package java.time.format
// predefined constants like ISO_LOCAL_DATE
// patterns like yyyy-MM-dd
public class DateTimeFormatterMethods {
    public static void main(String[] args) {
        // Instantiate or access DateTimeFormatter
        // Multiple ways to instantiate DateTimeFormatter object
        // 1. By calling a static ofXX method, passing it a FormatStyle value
        // 2. By accessing public static fields of DateTimeFormatter
        // 3. By using the static method ofPattern and passing it a string value

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.SHORT);

        //the following example formats a LocalDate object using the style FormatStyle

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        LocalDate date = LocalDate.of(2057, 8, 11);
        System.out.println(formatter.format(date)); // August 11, 2057

        LocalTime time = LocalTime.now();
        System.out.println(formatter.format(date)); // throws runtime exception

        // using Y or YYYY to format a date object returns the same results

        LocalDate date1 = LocalDate.of(2057, 8, 11);
        LocalTime time1 = LocalTime.of(14, 30, 15);

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");

        System.out.println(d1.format(date1));
        System.out.println(d2.format(date1));
        System.out.println(d3.format(date1));
        System.out.println(d4.format(date1));
        System.out.println();
        System.out.println(t1.format(time1));
        System.out.println(t2.format(time1));


        int[] intArray = new int[2];
        char c = 'c';
        intArray[1] = c;
        System.out.println(intArray[1]);
    }

}

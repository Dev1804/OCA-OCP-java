package org.oca.chapter4.calendardata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeMethods {
    public static void main(String[] args) {
        // Creating LocalTime
        // Constructor is private
        // of() accepts hours, minutes, seconds and nanoseconds
        // of() uses a 24-hour clock to specify the hour value
        // DateTimeException if you pass out-of-range values for hours, minutes or seconds
        LocalTime timeHrsMin = LocalTime.of(12, 21);
        LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
        LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578);

        System.out.println(timeHrsMin);
        System.out.println(timeHrsMinSec);
        System.out.println(timeHrsMinSecNano);

//        LocalTime timeHrsMin1 = LocalTime.of(120, 12); // runtime DateTimeException
//        LocalTime timeHrsMin2 = LocalTime.of(9986545781, 12); // integer number too large

        // to get the current time from the system clock, use the static method now();
        LocalTime time = LocalTime.now();
        System.out.println(time);

        // parse() method
        // You can parse a string to instantiate LocalTime by using its static method parse()
        // can either pass a string in the format 15:08:23 (hours:minutes:seconds) or parse any text using DateTimeFormatter

        LocalTime timeParser = LocalTime.parse("15:08:23");
        System.out.println(timeParser);

        // LocalTime constants to work with predefined times:
        // LocalTime.MIN - Minimum supported time, that is 00:00
        // LocalTime.MAX - Maximum supported time, that is, 23:59:59:999999999
        // LocalTime.MIDNIGHT - Time when the day starts, that is, 00:00
        // LocalTime.NOON - noontime, that is, 12:00

        System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT));

        // Querying LocalTime
        // getXX() to query LocalTime on its hour, minutes, seconds and nanoseconds. All these methods return an int value:

        LocalTime time2 = LocalTime.of(16, 20, 12, 98547);
        System.out.println(time2);
        System.out.println(time2.getHour());
        System.out.println(time2.getMinute());
        System.out.println(time2.getSecond());
        System.out.println(time2.getNano());

        // You can use isAfter() or isBefore() to check whether a time is after or before the specified time

        LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
        LocalTime paulFinishTime = LocalTime.parse("17:09:12");

        if(shreyaFinishTime.isBefore(paulFinishTime))
            System.out.println("Shreya wins");
        else
            System.out.println("Paul wins");

        // Manipulating LocalTime
        // minusHours(), minusMinutes(), minusSeconds(), minusNanos()

        LocalTime movieStartTime = LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println("Start by " + shreyaStartTime + " from office");

        //plusHours(), plusMinutes(), plusSeconds(), and plusNanos -> methods accept long values and add the specified hours, minutes, seconds, or nanoseconds to time
        // returning its copy as LocalTime

        // following example uses plusSeconds() and isAfter() methods to add seconds to a time and compares it with another time

        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8, 10, 55);
        LocalTime raceEndTime = LocalTime.of(8, 11, 11);
        if(raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime)) {
            System.out.println("New world record");
        } else {
            System.out.println("Try harder");
        }

        // LocalTime is immutable, calling any method on its instance won't modify its value
        // withHour(), withMinute(), withSecond(), and withNano methods accept an int value and return a copy of LocalTime with the specified value altered
        // in the following example, a new LocalTime instance with the minute value 00 is created:

        LocalTime startTime = LocalTime.of(5, 7, 9);
        if(startTime.getMinute() < 30)
            startTime = startTime.withMinute(0);
        System.out.println(startTime);

        // combining with another type
        // LocalTime class defines the atDate() method to combine a LocalDate with itself to create LocalDateTime

        LocalTime time3 = LocalTime.of(14, 10, 10);
        LocalDate date3 = LocalDate.of(2016, 02, 28);
        LocalDateTime localDateTime = time3.atDate(date3);
        System.out.println(localDateTime);



    }
}

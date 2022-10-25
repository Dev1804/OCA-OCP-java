package org.oca.chapter4.calendardata;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateMethods {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, 10, 23);
        LocalDate localDate1 = LocalDate.of(2022, Month.OCTOBER, 23);

        System.out.println(localDate1);
        System.out.println(localDate);

//        To get the system clock date use the method now()
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

//        Parse a string to instantiate a LocalDate
        LocalDate parse = LocalDate.parse("2022-10-23");
        System.out.println(parse);

//        if you pass invalid values to parse() or 0f(), you will get DateTimeParseException
//        The format of the string passed to parse() must be exactly of the format 9999-99-99
//        The month and date values passed to parse() must be of two digits, a single digit is considered an invalid value

//        Querying LocalDate

        // Use instance methods like getXX() to query LocalDate on its year, month and date values
        // Date can be queried as day-of-month, day-of-week and day-of-year
        // The month value can be retrieved as the enum constant Month or as an int value

        LocalDate date = LocalDate.parse("2020-08-30");
        System.out.println("Day of month " + date.getDayOfMonth());
        System.out.println("Day of week " + date.getDayOfWeek());
        System.out.println("Day of year " + date.getDayOfYear());
        System.out.println("Month " + date.getMonth());
        System.out.println("Month value " + date.getMonthValue());
        System.out.println("Year " + date.getYear());

        // you can use the instance methods isAfter() or isBefore() to determine whether a date is chronologically before or after another date:
        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");

        System.out.println(shreyaBday.isAfter(paulBday)); // true
        System.out.println(shreyaBday.isBefore(paulBday)); // false
        System.out.println(shreyaBday.isBefore(shreyaBday)); // false

        // Manipulating LocalDate
        // LocalDate class defines methods with the names minuxXX(), plusXX(), and withXX()
        // LocalDate is an immutable class (has the constructor on private) - all the methods create and return a copy
        // minuxXX() methods return a copy of the date with the specified days, months, or years subtracted from:

        LocalDate bday = LocalDate.of(2052, 03,10);
        System.out.println(bday.minusDays(10));
        System.out.println(bday.minusMonths(2));
        System.out.println(bday.minusWeeks(30));
        System.out.println(bday.minusYears(1));

        System.out.println();
        LocalDate launchCompany = LocalDate.of(2016, 02, 29);
        System.out.println(launchCompany.plusDays(1));
        System.out.println(launchCompany.plusMonths(1));
        System.out.println(launchCompany.plusWeeks(7));
        System.out.println(launchCompany.plusYears(1));

        // withXX() methods return a copy of the date instance replacing the specified dat, month or year in it

        System.out.println();
        LocalDate firstSex = LocalDate.of(2036, 02, 28);
        System.out.println(firstSex.withDayOfMonth(1));
        System.out.println(firstSex.withDayOfYear(1));
        System.out.println(firstSex.withMonth(7));
        System.out.println(firstSex.withYear(1));

        // Converting to another type
        //LocalDate class defines methods to convert it to LocalDateTime and long (representing the epoch date)
        // LocalDate defined overloaded atTime() instance methods. These methods combine LocalDate with time to create and return LocalDateTime, which stores both the date and the time
        // Any invalid hours, minutes or seconds value to the method atTime, it will throw a DateTimeException at runtime
        System.out.println();
        LocalDate interviewDate = LocalDate.of(2016, 02, 28);
        System.out.println(interviewDate.atTime(16,30));
        System.out.println(interviewDate.atTime(16,30, 20));
        System.out.println(interviewDate.atTime(16,30, 20, 300));
        System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));

        // We can use the method epochDay() to convert LocalDate to the epoch date -- the count of days from January 1, 1970
        LocalDate launchBook = LocalDate.of(2016, 2, 8);
        LocalDate aDate = LocalDate.of(1970, 1, 8);
        System.out.println(launchBook.toEpochDay());
        System.out.println(aDate.toEpochDay());

        // in standard date and time, the epoch refers to January 1, 1970, 00:00:00 GMT
    }
}

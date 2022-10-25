package org.oca.chapter4.calendardata;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMethods {
    public static void main(String[] args) {
        // Perform calculations with date and time using Period class
        // To work with date-based amount use Period
        // To work with time-based amount  in seconds and nanoseconds, you can use the Duration class

        // Instantiating period
        // With a private constructor , the period class defines factory methods to create its instances.
        // of(), ifYears(), ofMonths(), ofWeeks() and ofDays() -> to create periods of years, months, weeks or days

        Period period = Period.of(1, 2, 7); // 1 year, 2 months and 7 days
        Period period1 = Period.ofYears(2); // 2 years
        Period period2 = Period.ofMonths(5); // 5 months
        Period period3 = Period.ofWeeks(10); // 10 weeks
        Period period4 = Period.ofDays(15); // 15 days

        System.out.println(period);
        System.out.println(period1);

        // A period of 35 days is not stored as 1 month and 5 days .Its individual elements, that is, days. months and years are stored the way it is initialized
        // You can also define negative periods by passing negative integer values to all the preceding methods

        Period period5 = Period.ofDays(-15); // Period of -15 days
        // you can define positive or negative periods of time

        // parse() method-> parses string values of the format (PnYnMnD) or (PnW) where n represents a number and the letters (P, Y, M, D, and W) represent parse, year, month, day and week
        // the letters can exist in upper or lower case
        // can define negative periods using parse -(PnYnMnD) = (P-nY-nM-nD), but (Pn-YnMnD) = (Pn-YnMnD)

        Period p5Yrs1 = Period.parse("P5y");
        Period p5Yrs2 = Period.parse("p5y");
        Period p5Yrs3 = Period.parse("P5Y");
        Period p5Yrs4 = Period.parse("+P5Y");
        Period p5Yrs5 = Period.parse("P+5Y");
        Period p5Yrs6 = Period.parse("-P-5Y");

        System.out.println(p5Yrs1 + ":" + p5Yrs2);

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("-P5W");

        System.out.println(p5Yrs7);
        System.out.println(p5Yrs8);
        System.out.println(p5Yrs9);
        System.out.println(p5Yrs10);

        // You can also use the static method between(LocalDate dateInclusive, LocalDate dateExclusive) to instantiate Period

        LocalDate carnivalStart = LocalDate.of(2015, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051, 1, 2);

        Period periodBetween = Period.between(carnivalStart, carnivalEnd);
        System.out.println(periodBetween);

        // Manipulating LocalDate and LocalDateTime using Period
        // Following example adds a period of a day to a LocalDate instance:
        LocalDate date = LocalDate.of(2051, 01, 31);
        System.out.println(date.plus(Period.ofDays(1)));
        /*What happens when you add a period of a month to January 31 of any year? Do you
        get the last day of February or the first day of March? The following example adds a
        period of a month to a LocalDateTime instance:*/
        LocalDateTime dateTime = LocalDateTime.parse("2051-01-31T14:18:36");
        System.out.println(dateTime.plus(Period.ofMonths(1)));

        // minus() used with the classes LocalDate LocalDateTime to subtract a period of years, months, weeks, or days
        LocalDateTime dateTime1 = LocalDateTime.parse("2020-01-31T14:18:36");
        System.out.println(dateTime1.minus(Period.ofYears(2)));

        LocalDate date1 = LocalDate.of(2052, 01, 31);
        System.out.println(date1.minus(Period.ofWeeks(4)));

        // Querying period instances
        Period period10 = Period.of(2, 4, 40);
        System.out.println();
        System.out.println(period10.getYears());
        System.out.println(period10.getMonths());
        System.out.println(period10.getDays());

        // A period instance is zero if all three units are zero
        // The isNegative method returns true it at least one of its three components is strictly negative
        Period days5 = Period.of(0, 0, 5);
        System.out.println(days5.isZero());

        Period daysMinus5 = Period.of(0, 0, -5);
        System.out.println(daysMinus5.isNegative());

        // manipulating period
        // minus(TemporalAmount), minusDays(long), minusWeeks(long), minusMonths(long), minusYears(long), and multipliedBy(int)
        LocalDate bday = LocalDate.of(2020, 10, 29);
        LocalDate today = LocalDate.now();
        Period period10Days = Period.of(0, 0, 10);

        if(bday.minus(period10Days).isBefore(today))
            System.out.println(bday.minus(period10Days) + "Time to send out reminders to friends");

        System.out.println();
        /*
        What happens when you subtract a Period representing one month (P1M) from a
        Period representing 10 days (P10D)? Would you get a Period representing 20 days or
        a Period representing -1 month and 10 days?
         */

        Period period10Days1 = Period.of(0, 0, 10);
        Period period1Month = Period.of(0, 1, 0);

        System.out.println();
        System.out.println(period10Days1.minus(period1Month));
        System.out.println(period10Days1.minusDays(5));
        System.out.println(period10Days1.minusMonths(5));
        System.out.println(period10Days1.minusYears(5));

        // multipliedBy(int) multiplies each element in the period by the integer value
        Period year1Month9Day20 = Period.of(1, 9, 20);
        System.out.println(year1Month9Day20.multipliedBy(2));
        System.out.println(year1Month9Day20.multipliedBy(-2));

        /*The plus(TemporalAmount), plusDays(long), plusWeeks(long), plusMonths(long),
        and plusYears(long) methods add to Period instances and return the modified
        value as a Period. Like the minusXXX() methods, all the plusXXX() methods add individual elements*/

        Period period5Month = Period.of(0, 5, 0);
        Period period10Month = Period.of(0, 10, 0);
        Period period10Days2 = Period.of(0, 0, 10);

        System.out.println();
        System.out.println(period5Month.plus(period10Month));
        System.out.println(period10Days2.plusDays(35));
        System.out.println(period10Days2.plusMonths(5));
        System.out.println(period10Days2.plusYears(5));

        // converting to another type
        // toTotalMonths() returns the total number of months in the period by multiplying the number of years by 12 and adding the number of months
        System.out.println(Period.of(10,5,40).toTotalMonths());
    }
}

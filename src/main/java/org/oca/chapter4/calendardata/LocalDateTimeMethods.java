package org.oca.chapter4.calendardata;

import java.time.LocalDateTime;

public class LocalDateTimeMethods {
    public static void main(String[] args) {
        // this class uses the methods of both LocalDate and LocalTime
        // Parsing String to LocalDateTime
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        // Get current date and time
        LocalDateTime dateTimeNow = LocalDateTime.now();
        // Retrieve month as integer value
        if(prizeCeremony.getMonthValue() == 6)
            System.out.println("Can't invite president");
        else
            System.out.println("President invited");

        LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");

        // Check whether a LocalDateTime instance is before another LocalDateTime instance
        if(prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println("Chief Guest will leave before ceremony completes");

        // Instantiate LocalDateTime using separate int values
        // Check whether a LocalDateTime instance is before another LocalDateTime instance
        LocalDateTime eventMgrArrival = LocalDateTime.of(2050, 6, 5, 14, 30, 0);
        if(eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
            System.out.println("Manager is supposed to arrive 3 hrs earlier");

    }
}

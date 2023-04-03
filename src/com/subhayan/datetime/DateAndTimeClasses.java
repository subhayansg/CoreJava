/*
Date -> Old API under java.util, currently deprecated, using milliSec from 01-Jan-1970(EPOCH date) till current time
        These are mutable
Joda Date and Time -> New API from java.time , classes available are, from 01-Jan-1970(EPOCH date)
    -> LocalDate
    -> LocalTime
    -> LocalDateTime
    These classes represents time in terms of (seconds and nanoseconds)
    These classes are immutable
 DateTimeFormatter -> java.time.format  ,
    y - Year
    M - Month
    d - Day

    h - Hour (0-12)
    H - Hour (0-23)
    m - Minute
    s - seconds
    S - milliseconds
    z - Timezone
    Z - Offset
 */
package com.subhayan.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class DateAndTimeClasses {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());  // ms from 01-Jan-1970 till current time
        Date d = new Date();  // deprecated
        System.out.println("Date: " + d);  // Current time with date, Day

        LocalDate dt = LocalDate.now();  // gives current date in yyyy-MM-dd format
        System.out.println("LocalDate: " + dt);
        // Create a specific date
        LocalDate specificDate = LocalDate.of(2023, Month.AUGUST, 15);
        System.out.println(specificDate); // 2023-08-15
        // Immutable
        specificDate.plusYears(1);
        System.out.println(specificDate);  // 2023-08-15

        // ZonedDateTime
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);  // 2023-04-03T19:57:33.744607900+05:30[Asia/Calcutta]
        System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
                                    // 2023-04-03T07:34:50.084994900-07:00[America/Los_Angeles]
        OffsetDateTime odt = OffsetDateTime.now();
        System.out.println(odt);  // 2023-04-03T19:57:33.744607900+05:30

        // DateTimeFormatter
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldt.format(dtf));  // 03/04/2023
        DateTimeFormatter dtfz = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss z");
        System.out.println(zdt.format(dtfz));   // Must use zoned time here

        // ChronoField
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(zdt.get(ChronoField.OFFSET_SECONDS));

        int year = ldt.getYear();
        System.out.println(year);
    }
}

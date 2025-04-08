package com.gevernova.builtinfunctions.levelone;

import java.time.*;

public class TimeZones {
    public static void main(String[] args) {
        System.out.println("GMT: " + ZonedDateTime.now(ZoneId.of("GMT")));
        System.out.println("IST: " + ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
        System.out.println("PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}

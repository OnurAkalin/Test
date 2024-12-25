package org.example;

import org.apache.commons.lang3.time.DateUtils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsTest {
    public static void main(String[] args) {
        System.out.println(DateUtils.addMonths(getCurrentDate(), 1));
        System.out.println(DateUtils.truncate(getCurrentDate(), Calendar.DAY_OF_MONTH));
    }

    public static Date getCurrentDate() {
        return Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
    }
}

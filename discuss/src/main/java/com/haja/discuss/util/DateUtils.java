package com.haja.discuss.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    final static String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";

    public static Timestamp now() {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        Calendar cal = Calendar.getInstance();
        String today = formatter.format(cal.getTime());
        Timestamp ts = Timestamp.valueOf(today);
        return ts.valueOf(today);
    }

    public static Timestamp minus(int time) {
        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);
        Date myDate = Date.from(Instant.now().minus(time, ChronoUnit.MINUTES));
        String formattedDate = formatter.format(myDate);
        Timestamp ts = Timestamp.valueOf(formattedDate);

        return ts.valueOf(formattedDate);
    }
}
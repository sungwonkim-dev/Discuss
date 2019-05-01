package com.haja.discuss.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils {
    public static Timestamp now() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        String today = formatter.format(cal.getTime());
        Timestamp ts = Timestamp.valueOf(today);
        return ts.valueOf(today);
    }
}

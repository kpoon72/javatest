package day6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class CalendarPractice {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyy");
        String date = sdf.format(new Date());
        Logger.getGlobal().info(date);

        Calendar calendar = Calendar.getInstance();
        Date date2 = calendar.getTime();
        Logger.getGlobal().info(String.valueOf(date2));

//        add 1
        calendar.add(Calendar.MONTH, 1);
        String date3 = sdf.format(calendar.getTime());
        Logger.getGlobal().info((date3));

//        minus 5 from day
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        String date4 = sdf.format(calendar.getTime());
        Logger.getGlobal().info((date4));

        int date5 = calendar.get(Calendar.HOUR);
        Logger.getGlobal().info(String.valueOf(date5));



    }
}

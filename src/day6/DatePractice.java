package day6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

public class DatePractice {
    public static void main(String[] args){
        Date date = new Date();
        Logger.getGlobal().info(String.valueOf(date));

        LocalDate localDate = LocalDate.now();
        Logger.getGlobal().info(String.valueOf(localDate));

        LocalTime localtime = LocalTime.now();
        Logger.getGlobal().info(String.valueOf(localtime));

        LocalDateTime localDateTime = LocalDateTime.now();
        Logger.getGlobal().info(String.valueOf(localDateTime));

        DateTimeFormatter datTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        String formatter = datTimeFormatter.format(localDateTime);

        Calendar calendar = Calendar.getInstance();
        Logger.getGlobal().info(String.valueOf(calendar));


    }
}

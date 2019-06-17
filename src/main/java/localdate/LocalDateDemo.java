package localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: Rocky
 * @Date: 2019-06-08
 * @Description:
 */
public class LocalDateDemo {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant.toString());
        Date date = Date.from(instant);
        System.out.println(date);
        System.out.println(date.toInstant());

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(localDateTime);
        int year = localDateTime.getYear();
        System.out.println(year);
        int month = localDateTime.getMonthValue();
        System.out.println(month);
        int hour = localDateTime.getHour();
        System.out.println(hour);
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        dateTimeFormatter.format(localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

    }

}


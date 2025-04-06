import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import static java.time.ZoneOffset.UTC;

public class DateAndInstantApp {
    public static void main(String[] args) {
        //Connect legacy API Date with Instant
        Instant instant = LocalDateTime.of(2030,10,1,10,0,0,0).toInstant(UTC);
        System.out.println(instant);

        Date date = Date.from(instant);
        System.out.println(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(calendar.getTime());

        Instant instant1 = date.toInstant();
        System.out.println(instant1);
    }
}

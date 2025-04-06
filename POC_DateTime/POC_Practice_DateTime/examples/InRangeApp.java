import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;

import static java.time.ZoneOffset.UTC;

public class InRangeApp {
    public static void main(String[] args) {
        var start = LocalDate.of(2020,1,1).atStartOfDay().atOffset(UTC);
        var end = LocalDate.of(2030,12,31).atTime(LocalTime.MAX).atOffset(UTC);
        var now = OffsetDateTime.now();

        System.out.println(start);
        System.out.println(end);

        System.out.println(isRange(now, start, end));
    }

    private static boolean isRange(OffsetDateTime now, OffsetDateTime start, OffsetDateTime end){
       return now.isEqual(start) || now.isEqual(end) || now.isAfter(start) && now.isBefore(end);
    }
}

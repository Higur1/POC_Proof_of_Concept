import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class TimeZone {
    public static void main(String[] args) {
        //without timezone
        LocalDateTime dateTime = LocalDateTime.of(2000,1,1,15,0);
        System.out.println(dateTime);

        OffsetDateTime timeZone = OffsetDateTime.of(dateTime, ZoneOffset.UTC);//base timeZone
        OffsetDateTime timeZone2 = timeZone.withOffsetSameInstant(ZoneOffset.of("-03:00"));

        System.out.println(timeZone);
        System.out.println(timeZone2);
        System.out.println(timeZone.isEqual(timeZone2)); //returns true
    }
}

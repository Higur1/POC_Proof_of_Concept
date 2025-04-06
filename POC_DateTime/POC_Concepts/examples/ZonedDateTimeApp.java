import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeApp {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2000,10,14,0,0);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());

        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Lisbon"));
        //System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
    }
}

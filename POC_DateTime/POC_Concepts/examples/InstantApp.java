import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class InstantApp {
    public static void main(String[] args) {
        //Instant i1 = Instant.EPOCH; //1970-01-01T00:00:00Z default
        OffsetDateTime offsetDateTime = OffsetDateTime.of(2058,12,31,0,0,0,0, ZoneOffset.of("+00:00"));

        //transform dateTime in instant
        Instant i1 = offsetDateTime.toInstant();

        System.out.println(offsetDateTime);

        System.out.println(i1.toEpochMilli());
        System.out.println(i1.getEpochSecond());

        //transform instant in dateTime
        OffsetDateTime offsetDateTime1 = OffsetDateTime.ofInstant(i1, ZoneOffset.UTC);
        System.out.println(offsetDateTime1);
    }
}

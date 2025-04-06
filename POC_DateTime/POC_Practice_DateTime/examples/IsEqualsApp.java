import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class IsEqualsApp {
    public static void main(String[] args) {
        OffsetDateTime offsetDateTime = OffsetDateTime.of(2000,1,1,12,0,0,0, ZoneOffset.of("-00:00"));
        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(2000,1,1,11,0,0,0, ZoneOffset.of("-01:00"));

        //compare elements and offSets - returns false
        System.out.println(offsetDateTime.equals(offsetDateTime1));

        //compare DateTime - returns true - compare Instant in time
        System.out.println(offsetDateTime.isEqual(offsetDateTime1));
    }
}

package ExpirationTimeCalculator;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExpirationTimeCalculator {
    public static void main(String[] args) {
        System.out.println(expirationDate(5));
    }

    private static long expirationDate(int hours){
        return Instant.now().plus(hours, ChronoUnit.HOURS).getEpochSecond();
    }
}

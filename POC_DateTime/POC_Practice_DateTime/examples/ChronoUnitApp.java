import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitApp {
    public static void main(String[] args) {
        var start = LocalDate.of(2000,1,1);
        var ended = LocalDate.of(2000, 12, 31);

        System.out.println(ChronoUnit.DAYS.between(start, ended));
        System.out.println(ChronoUnit.MONTHS.between(start, ended));

        var newTime = ChronoUnit.HOURS.addTo(LocalTime.of(12,0,0), 3);
        System.out.println(newTime);
    }
}

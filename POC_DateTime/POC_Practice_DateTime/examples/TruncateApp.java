import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class TruncateApp {
    public static void main(String[] args) {
        var time = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
        time = time.truncatedTo(ChronoUnit.SECONDS);
        System.out.println(time);
    }
}

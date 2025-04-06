import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2000, 1, 1);
        LocalTime time = LocalTime.of(16, 20);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2000,1,1,16,45);
        LocalDateTime dateTime3 = date.atTime(time);
        LocalDateTime dateTime4 = time.atDate(date);

        String formatDateTime = dateTime4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dateTime);
        System.out.println(dateTime2);
        System.out.println(dateTime3);
        System.out.println(dateTime4);
        System.out.println(formatDateTime);
    }
}

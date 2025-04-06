import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OperationsWithLocalDateObject {
    public static void main(String[] args) {
        //all created object are immutable
        LocalDate date = LocalDate.of(1990,01,01);

        LocalDate date2 = date.withYear(2000);
        //date.withMonth
        LocalDate date3 = date2.plusYears(2);

        LocalDate date4 = date3.minusDays(5);
        LocalDate date5 = date3.minus(5, ChronoUnit.DAYS); //another way

        //format the date in the specified pattern
        String formatDate = date4.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(date4);
        System.out.println(formatDate);
    }
}

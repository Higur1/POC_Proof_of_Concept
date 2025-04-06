import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class YearMonthApp {
    public static void main(String[] args) {
        YearMonth yearMonth = YearMonth.of(2000, 12);
        System.out.println(yearMonth);

        YearMonth yearMonth1 = yearMonth.withYear(2019);


        String format = yearMonth.format(DateTimeFormatter.ofPattern("MM/yyyy"));
        System.out.println(format);
    }
}

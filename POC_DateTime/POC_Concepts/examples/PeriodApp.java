import java.time.LocalDate;
import java.time.Period;

public class PeriodApp {
    public static void main(String[] args) {
        Period p1 = Period.ofYears(1);
        Period p2 = Period.between(LocalDate.of(2000,3,1), LocalDate.of (2020,3,1));

        System.out.println(p1);
        System.out.println(p1.toTotalMonths());
        System.out.println(p2);
    }
}

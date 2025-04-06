package AgeCalculator;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        var birthDate = LocalDate.of(1999,7,15);
        var today = LocalDate.now();

        var period = Period.between(birthDate, today);

        System.out.println(period);
        System.out.format("Years: %d\nMonths: %d\nDays:%d", period.getYears(), period.getMonths(), period.getDays());
    }
}

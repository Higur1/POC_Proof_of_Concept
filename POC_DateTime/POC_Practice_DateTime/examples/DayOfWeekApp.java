import java.time.DayOfWeek;

public class DayOfWeekApp {
    public static void main(String[] args) {
        DayOfWeek dayOfWeek = DayOfWeek.SATURDAY;
        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek.getValue()); //returns 6

        DayOfWeek dayOfWeek1 = DayOfWeek.of(5);// FRIDAY
        System.out.println(dayOfWeek1);

        DayOfWeek dayOfWeek2 = dayOfWeek1.plus(2); // SUNDAY
        System.out.println(dayOfWeek2);
    }
}

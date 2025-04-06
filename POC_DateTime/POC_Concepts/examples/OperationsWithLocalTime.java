import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class OperationsWithLocalTime {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(15,30);
        LocalTime time2 = time1.plusHours(12);
        LocalTime time3 = time1.minusMinutes(30);

        String formatedTime = time3.format(DateTimeFormatter.ofPattern("HH mm"));


        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(formatedTime);
    }
}

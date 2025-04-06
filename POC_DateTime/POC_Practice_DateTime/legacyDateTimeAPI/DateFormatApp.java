import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatApp {
    public static void main(String[] args) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, Calendar.APRIL, 10,0,0,0);


        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String format = sdf.format(calendar.getTime());
        System.out.println(format);

        Date parseDate = sdf.parse("15/04/2000 00:00:00");
        System.out.println(parseDate);
    }
}

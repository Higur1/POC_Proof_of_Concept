import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2000, 5, 10, 4, 30,10);
        System.out.println(localDateTime);

        String formatted =
                localDateTime.format(
                        DateTimeFormatter
                                .ofLocalizedDateTime(FormatStyle.MEDIUM)
                                .withLocale(Locale.of("pt","BR"))
                );
        System.out.println(formatted);
    }
}

package FormatMarketItemsWithLocale;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class ItemTable {
    public record Item(String nameKey, double price, LocalDate purchaseDate) {
    }

    public static void main(String[] args) {
        var items = List.of(
                new Item("i102", 3.2, LocalDate.of(2022, 2, 1)),
                new Item("i134", 6.4, LocalDate.of(2022, 2, 10))
        );
        //var locale = Locale.of("pt", "BR");
        var locale = Locale.US;
        System.out.println(buildTable(items, locale));
    }

    public static String buildTable(List<Item> items, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("FormatMarketItemsWithLocale.items", locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale);

        return items
                .stream()
                .map(i -> {
                    String name = bundle.getString(i.nameKey);
                    String price = numberFormat.format(i.price);
                    String date = dateTimeFormatter.format(i.purchaseDate);

                    return String.format("%s\t\t%s\t\t%s", name, price, date);
                })
                .collect(Collectors.joining("\n"));

    }
}

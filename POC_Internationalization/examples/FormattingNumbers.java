import java.text.NumberFormat;
import java.util.Locale;

public class FormattingNumbers {
    public static void main(String[] args) {
        double n = 99999.99;

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.of("pt", "BR"));
        NumberFormat nf1 = NumberFormat.getNumberInstance(Locale.of("en", "US"));


        NumberFormat nc = NumberFormat.getCurrencyInstance(Locale.of("pt", "BR"));
        NumberFormat nc1 = NumberFormat.getCurrencyInstance(Locale.of("en", "US"));

        System.out.println(n);
        System.out.println(nf.format(n));
        System.out.println(nf1.format(n));

        System.out.println(nc.format(n));
        System.out.println(nc1.format(n));


    }
}

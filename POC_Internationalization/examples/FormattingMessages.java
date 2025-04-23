import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FormattingMessages {
    public static void main(String[] args) {
        /*
        *  pt_BR ==> Fui ao shopping e comprei 2 camisas. Custou R$ 200,00 reais
        *  en_GB ==> I went to the mall and bought 2 shirts. They cost € 200.00
        * */

        Locale loc = Locale.of("pt", "BR");
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", loc);
        String sentence = bundle.getString("sentence");

        MessageFormat mf = new MessageFormat(sentence, loc);
        String formatted = mf.format(new Object[]{2, 200.00});

        System.out.println(formatted);
    }
}

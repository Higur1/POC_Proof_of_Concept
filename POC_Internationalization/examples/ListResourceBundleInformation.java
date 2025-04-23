import java.util.Locale;
import java.util.ResourceBundle;

public class ListResourceBundleInformation {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        //Search for Messages_fr_CA - Archive or Class
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("fr", "CA"));
        System.out.println(bundle.getString("greetings"));
    }
}

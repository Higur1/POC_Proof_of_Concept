import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleInformation {
    public static void main(String[] args) {
        //search for Message_pt_BR archive
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("pt", "BR"));
        String someText = bundle.getString("msg");
        System.out.println(someText);
    }
}

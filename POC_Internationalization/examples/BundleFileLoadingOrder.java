import java.util.Locale;
import java.util.ResourceBundle;



/*The order is:
*   Search for the bundle provided fr_FR
*   Search for the bundle that is the default machine language - in this case pt_BR
*   Search for the bundle of the default file - Message.properties
*   If everyone fails - MissingResourceException - RuntimeException
*
*  1)Message_fr_FR
*  2)Message_fr
*  3)Message_br_BR
*  4)Message_br
*  5)Message
*  6)MissingResourceException
* */

public class BundleFileLoadingOrder {
    public static void main(String[] args) {
        //if the file is not in the root it is necessary to reference the package (ResourceBundle.getBundle("Internationalization.Message"))
        //if the language bundle file does not exist, the return will be with the application's default language and not the default file
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", Locale.of("fr", "FR")); // in this case the return will be in the pt_BR

        System.out.println(bundle.getString("greetings"));
    }
}

import java.util.Arrays;
import java.util.Locale;

public class LocaleObject {
    public static void main(String[] args) {
        Locale defaultLocale = Locale.getDefault();
        System.out.println(defaultLocale);

        //all countries registered
        System.out.println(Arrays.toString(Locale.getISOCountries()));
        //all languages registered
        System.out.println(Arrays.toString(Locale.getISOLanguages()));

        Locale locale1 = Locale.of("fr"); //only language
        Locale locale2 = Locale.of("fr","FR"/*, ""*/); //language and country - is possible variant
        Locale locale3 = Locale.forLanguageTag("fr-FR"); //another way


    }
}

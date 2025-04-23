import java.util.Locale;

public class SettingDefaultLocale {
    public static void main(String[] args) {
        System.out.println("Default locale: "+ Locale.getDefault());

        //Edit configurations ->
        // Build and run -> Modify options ->
        // enable "Add VM options ->
        // add params -Duser.language=en -Duser.country=US"
    }
}

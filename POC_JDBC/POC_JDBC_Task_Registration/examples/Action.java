import java.util.Arrays;

public enum Action {
    LIST, INSERT, DELETE, UPDATE, QUIT;

    public static Action fromString(String actionStr){
        return Arrays
                .stream(
                        Action.values())
                .filter(
                        a -> a.name()
                                .equalsIgnoreCase(actionStr))
                .findFirst()
                .orElseThrow();
    }
}

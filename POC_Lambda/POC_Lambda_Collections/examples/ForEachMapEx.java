import java.util.Map;

public class ForEachMapEx {
    public static void main(String[] args) {
        var people = Map.of(
                1, "João",
                2, "Maria",
                3, "Paulo",
                4, "Joana"
        );

        //HashMap
        people.keySet().forEach(k -> System.out.println(k));
        people.values().forEach(System.out::println);
        people.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

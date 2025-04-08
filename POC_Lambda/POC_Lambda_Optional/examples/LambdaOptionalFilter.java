import java.util.Map;

public class LambdaOptionalFilter {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        people.getNameById(5)
                .filter(n -> n.startsWith("R"))
                .ifPresentOrElse(
                        //n-> System.out.println(n),
                        System.out::println,
                        () -> System.out.println("Name does not start with R") // the same if the optional is empty
                );
    }
}

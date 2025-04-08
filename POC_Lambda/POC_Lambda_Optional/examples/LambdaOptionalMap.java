import java.util.Map;

public class LambdaOptionalMap {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));


        int count = people.getNameById(5)
                //.map(name -> name.length())
                .map(String::length)
                .orElse(0);

        System.out.println(count);
    }
}

import java.util.Map;

//Optional with lambda
public class LambdaOptionalIfPresentOrElse {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));
        people.getNameById(5)
                //if
                .ifPresentOrElse(n -> System.out.println(n.toUpperCase()),
                        //else
                        ()-> System.out.println("Id not found"));
    }
}

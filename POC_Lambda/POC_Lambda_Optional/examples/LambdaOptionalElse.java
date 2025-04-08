import java.util.Map;

public class LambdaOptionalElse {
    public static void main(String[] args) {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        //String name = people.getNameById(5).get(); // error NoSuchElementException
        String name = people.getNameById(5).orElse("Not found");
        System.out.println(name);
        //Another way - use Supplier interface functional
        String name2 = people.getNameById(5).orElseGet(() -> "Not found");
        System.out.println(name2
        );
        //Another way throw exception
        //String name3 = people.getNameById(5).orElseThrow(() -> new RuntimeException("Id not found"));
        //another way
        String name3 = people.getNameById(5).orElseThrow(RuntimeException::new);

        System.out.println(name3);
    }
}

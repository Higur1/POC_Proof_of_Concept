import java.util.Map;

public class LambdaOptional {
    public static void main(String[] args) {
        //part1();
        part2();
    }

    //Basic use Optional return
    private static void part1() {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        var name = people.getNameById(3);

        //use Optional return is possible use isPresent
        if (name.isPresent()) {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        }
    }

    //Optional with lambda
    private static void part2() {
        People people = new People(Map.of(
                1, "Paulo",
                2, "Afonso",
                3, "Ricardo",
                4, "Rodrigo"
        ));

        //var name = people.getNameById(3);

        /*//use Optional return is possible use isPresent
        if (name.isPresent()) {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        }*/

        //reduced
        /*name.ifPresent(n -> {
            String upperName = name.get().toUpperCase();
            System.out.println(upperName);
        });*/

        //more reduced
        /*name.ifPresent(n ->
            System.out.println(n.toUpperCase())
        );*/

        //more reduced Optional and lambda
        people
                .getNameById(3)
                .ifPresent(n -> System.out.println(n.toUpperCase()));

    }
}

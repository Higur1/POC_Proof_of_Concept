import java.util.function.Function;

//Useful for transformation standardization
public class FunctionInterfaceEx {
    public static void main(String[] args) {
        Person p1 = new Person("Jon", "Silver");

        //System.out.println(map(p1, p -> p.getFirstName()));
        //another way
        System.out.println(map(p1, Person::firstName));
        System.out.println(map(p1, p -> p.firstName + " " + p.lastName));

    }
    private static String map(Person person, Function<Person, String> function){
        return function.apply(person);
    }

    record Person(String firstName, String lastName) {}
}

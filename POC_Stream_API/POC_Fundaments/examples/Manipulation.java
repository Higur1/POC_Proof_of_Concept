import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Manipulation {
    public static void main(String[] args) {
        var people = List.of(
                new Person("pedro", 15),
                new Person("Manoel", 36),
                new Person("Lucas", 13),
                new Person("Sabrina", 27),
                new Person("Rodrigo", 45)
        );
        firstManipulation(people);
        secondManipulationSorted(people);
        thirdManipulation(people);
        fourthManipulation(people);
    }

    //.stream().map().sorted().forEach()
    private static void firstManipulation(List<Person> people) {
          /* people.stream()//entrance
                .map(person -> person.name) //intermediate operation
                .map(name -> name.toUpperCase()) //Intermediate operation
                .forEach(name -> System.out.println(name)); //final*/

        //another way with reference method - Intermediate operation receives Stream and return Stream

        people.stream()//entrance
                .map(person -> person.name) //intermediate operation
                .map(String::toUpperCase) //Intermediate operation
                .sorted() //Intermediate operation
                .forEach(System.out::println); //final
    }

    //Mapping filter and sort data - age over 18 descending order
    private static void secondManipulationSorted(List<Person> people) {
        people.stream()
                .map(person -> person.age)
                .filter(age -> age >= 18)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    //Search for older age, youngest age and average
    private static void thirdManipulation(List<Person> people) {
        int max = people.stream()
                .mapToInt(Person::age)
                .max()//Final
                .orElse(0);

        int min = people.stream()
                .mapToInt(Person::age)
                .min()
                .orElse(0);

        double avg = people.stream()
                .mapToInt(Person::age)
                .average()
                .orElse(0);

        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }

    private static void fourthManipulation(List<Person> people) {
        List<String> names = people.stream()
                .map(Person::name)
                //.collect(Collectors.toList())
                //another way
                .map(String::toUpperCase)
                .filter(name -> !name.startsWith("R"))
                .toList();

        System.out.println(names);
    }

    record Person(String name, int age) {
    }
}

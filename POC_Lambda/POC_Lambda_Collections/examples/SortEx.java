import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SortEx {
    public static void main(String[] args) {
        part1();
        parte2();
    }

    //Interface functional Comparator - compareTo, naturalOrder, reverseOrder, nullFirst
    private static void part1() {
        var letters = new ArrayList<>(Arrays.asList('C', 'B', 'C', 'A', 'E', 'G'));
        System.out.println(letters);

        //Comparator
        //letters.sort((l1, l2) -> l1.compareTo(l2));
        //letters.sort((l1, l2) -> -l1.compareTo(l2)); reversal

        //another way - Interface functional Comparator
        letters.sort(Character::compareTo);
        System.out.println(letters);

        letters.sort(Comparator.naturalOrder());
        System.out.println(letters);

        letters.sort(Comparator.reverseOrder());
        System.out.println(letters);

        //if have a null
        letters.sort(Comparator.nullsFirst((o1, o2) -> o1.compareTo(o2)));
        System.out.println(letters);
    }


    private static void parte2() {
        var people = Arrays.asList(
                new Person("Pedro", 25),
                new Person("Paulo", 45),
                new Person("Joana", 34),
                new Person("Maria", 33),
                new Person("Paulo", 32)
        );
        //first way
        people.sort((p1, p2) -> p1.name().compareTo(p2.name()));
        //another way
        //people.sort(Comparator.comparing(Person::name)); //.reversed() descending
        //another way - first comparing name and after age
        people.sort(Comparator.comparing(Person::name).thenComparing(Person::age));


        people.forEach(p -> System.out.println(p.name + " " + p.age));
    }

    record Person(String name, int age) {
    }
}

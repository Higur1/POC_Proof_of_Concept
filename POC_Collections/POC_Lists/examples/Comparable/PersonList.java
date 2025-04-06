package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonList {
    public static void main(String[] args) {
        var people = new ArrayList<>(List.of(
                new Person("Maria", 45),
                new Person("Paulo", 36),
                new Person("Pedro", 32)
        ));

        //adding the Comparable implementation to the Person class, it is possible to use sort
        Collections.sort(people);
        /*
            order alphabetical
            Collections.sort(people, new PeopleComparator()); Generic
            people.sort(new PeopleComparator()); another way
            people.sort((o1, o2) -> o1.getName().compareTo(o2.getName())); lambda
            people.sort(Comparator.comparing(Person::getName));
        */

        for(var p: people){
            System.out.format("==> %s\n",p);
        }
    }
}

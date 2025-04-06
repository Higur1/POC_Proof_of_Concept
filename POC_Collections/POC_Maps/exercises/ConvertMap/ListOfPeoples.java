package ConvertMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfPeoples {
    public static void main(String[] args) {
        var people = List.of(
                new Person(1, "Jose"),
                new Person(2, "Maria"),
                new Person(3, "Gabriel"),
                new Person(4, "Paulo")
        );

        Map<Long, String> map = new HashMap<>();

        for (Person person: people){
            map.put(person.id(), person.name());
        }
        System.out.println(map);
    }
}

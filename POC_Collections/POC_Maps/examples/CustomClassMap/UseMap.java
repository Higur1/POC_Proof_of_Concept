package CustomClassMap;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    public static void main(String[] args) {
        Map<Name, Integer> map = new HashMap<>(); //if use TreeMap is necessary implements Comparable in Name class or ClassCastException
        map.put(new Name("João", "Oliveira"), 35);
        map.put(new Name("Maria", "Lula"), 22);
        map.put(new Name("Silvio", "Santos"), 43);
        map.put(new Name("Silvio", "Santos"), 43);

        System.out.println(map);
    }
}

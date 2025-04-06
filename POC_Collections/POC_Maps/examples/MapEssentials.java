import java.util.HashMap;
import java.util.Map;

public class MapEssentials {
    public static void main(String[] args) {
        Map<Integer, Character> map = new HashMap<>();

        map.put(1, 'A');
        map.put(2, 'B');
        map.put(3, 'C');
        map.put(4, 'D');
        map.put(4, 'F'); //replacing the value - the method reports a return if it is an overwrite

        System.out.println(map);
        Character char3 = map.get(3);

        System.out.println(char3);

        Character char5 = map.get(5);
        System.out.println(char5); // returns null

        System.out.println(map.getOrDefault(5, 'x'));  // create a default value for when not found

        //map.size();
        //map.putAll(); //add another map
    }
}

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEssentials {
    public static void main(String[] args) {

        //unordered storage, no have index access
        Set<String> set = new HashSet<>();

        //insertion order
        //Set<String> set2 = new LinkedHashSet<>();

        set.add("A");
        set.add("E");
        set.add("I");
        set.add("O");
        set.add("U");
        set.add("U"); // not possible duplicate element

        for(String s: set){
            System.out.println(s);
        }

        //set.size();
        //set.clear();
        //set.contains(); best perform comparative a list
        //set.removeAll();
    }
}

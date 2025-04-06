import java.util.ArrayList;
import java.util.List;

public class ImmutableList {
    public static void main(String[] args) {
        //Immutable List
        var list = List.of("A", "B", "C", "D");

        //permitted
        var list2 = new ArrayList<>(List.of("A", "B", "C", "D"));


        //list.add("E"); //UnsupportedOperationException
        //list.remove("E"); //UnsupportedOperationException

        list2.add("E"); //Is possible

        System.out.println(list2);
    }
}

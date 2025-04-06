import java.util.ArrayList;
import java.util.List;

public class RelationsBetweenLists {
    public static void main(String[] args) {
        var list1 = new ArrayList<>(List.of("A","B","C"));
        var list2 = new ArrayList<>(List.of("C","D","E","F"));

        //all need mutable list
        list1.addAll(list2); //add collection
        list1.retainAll(list2); //search for equal elements
        list1.removeAll(list2); //search for equal elements and remove;

        System.out.println(list1);
    }
}

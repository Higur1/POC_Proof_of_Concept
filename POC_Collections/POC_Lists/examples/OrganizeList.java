import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganizeList {
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6,5,7,1,3,2,4));

        //need mutable list
        Collections.sort(list); //if implements comparable is possible use sort of Collections
        System.out.println(Integer.compare(1,2)); // example, returns (-1,0,1)
        String letter = "a";
        String letter2 = "b";
        System.out.println(letter.compareTo(letter2));// alphabetical order, returns (-1,0,1)
        System.out.println(list);
    }
}

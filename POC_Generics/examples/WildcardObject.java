import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WildcardObject {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");

        List<? extends Object> l2 = new ArrayList<String>();
        /*l2.add("a");
        l2.add("b");*/

        List<?> l3 = new ArrayList<String>(); //references "? extends Object" - synonymous


    }
}

package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrganizeListComparator {
    public static void main(String[] args) {
        var list = new ArrayList<>(List.of(6,5,7,1,3,2,4));
        //using a descendant comparator class to inform the ordering of the numbers.
        Collections.sort(list, new DescendingComparator());
        //Another form
        //list.sort(new DescendingComparator());
        System.out.println(list);

        //invert
        Collections.sort(list, new DescendingComparator().reversed());
        System.out.println(list);

        //Lambda form
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

        //list.sort(Comparator.naturalOrder()); crescent order
        //list.sort(Comparator.reverseOrder()); descending order
    }
}

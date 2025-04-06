package Comparator;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);// return the opposite value, if 1 return 0; used to decreasing number
    }
}

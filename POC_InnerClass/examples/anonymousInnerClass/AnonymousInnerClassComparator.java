package anonymousInnerClass;

import java.util.Arrays;
import java.util.Comparator;

public class AnonymousInnerClassComparator {
    public static void main(String[] args) {
        var numbers = Arrays.asList(3,2,1,5,4);

        //Anonymous Class
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        numbers.sort(comparator);
        System.out.println(numbers);
    }

    //Anonymous class
    /*private static class NumberComparator implements Comparator<Integer>{
        @Override
        public int compare(Integer o1, Integer o2){
            return o1.compareTo(o2);
        }
    }*/
}

import java.util.Arrays;
import java.util.List;

public class Conversion {
    public static void main(String[] args) {
        //int[] array = {1,2,3,4,5}; not possible
        Integer[] array = {1,2,3,4,5}; //possble

        List<Integer> list = Arrays.asList(array); //transform array in list
        System.out.println(list);
        Integer[] array2 = list.toArray(new Integer[4]);// transform list in array
        System.out.println(Arrays.toString(array2));
    }
}

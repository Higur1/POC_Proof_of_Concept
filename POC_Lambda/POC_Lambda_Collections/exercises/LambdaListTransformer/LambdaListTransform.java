package LambdaListTransformer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaListTransform {
    public static void main(String[] args) {
        var numbers = new ArrayList<>(Arrays.asList(3, 6, 2, 4, 9, 7, 1, 5, 8, 0));

        numbers.replaceAll(n -> n + 2);
        numbers.removeIf(n -> n % 2 == 0);
        numbers.sort(Comparator.reverseOrder());

        numbers.forEach(System.out::println);
    }
}

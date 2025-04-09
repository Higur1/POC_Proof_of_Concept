import java.util.Arrays;
import java.util.List;

public class BoxedStream {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4, 5);
        var array = numbers
                .stream()
                .mapToInt(i -> i)
                .toArray();

        var s = Arrays
                .stream(array)
                .boxed() //transform any types in stream
                .toList();

        System.out.println(s);
    }
}

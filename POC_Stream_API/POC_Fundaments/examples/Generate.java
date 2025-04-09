import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Generate {
    public static void main(String[] args) {
        generateIntAndDouble();
        generateRandomNumbers();
    }

    private static void generateIntAndDouble() {
        List<Integer> numbers = Stream
                .generate(() -> 5)
                .limit(10) //without the limit the generate is infinite
                .toList();

        System.out.println(numbers);

        double[] array = DoubleStream.generate(() -> 3.5).limit(3).toArray();
        System.out.println(Arrays.toString(array));
    }

    private static void generateRandomNumbers() {
        Random random = new Random();
        //ints - doubles = IntStream
        int[] array = random
                .ints(10, 0, 10)//start
                .toArray();
        System.out.println(Arrays.toString(array));

        double[] array2 = random
                .doubles(10, 0, 10)//start
                .toArray();
        System.out.println(Arrays.toString(array2));
    }
}

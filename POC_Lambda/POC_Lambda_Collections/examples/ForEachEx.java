import java.util.List;

public class ForEachEx {
    public static void main(String[] args) {
        var numbers = List.of(1,2,3,4,5,6);

        /*for (var n: numbers){
            System.out.println(n);
        }*/

        //Interface functional Consumer
        numbers.forEach(n -> System.out.println(n));

        //other way
        numbers.forEach(System.out::println);
    }
}

import java.util.Arrays;

public class ReplaceAllEx {
    public static void main(String[] args) {
        var numbers = Arrays.asList(0,1,2,3,4,5,6);

        //Function UnaryOperator - receive a type and return same type
        numbers.replaceAll(n -> n*2); // return doubled value
        System.out.println(numbers);
    }
}

import java.util.Arrays;

public class ArrayException {
    public static void main(String[] args) {
        String[] array= new String[2];
        array[0] = "A";
        array[1] = "B";
        array[-1] = "D";//Exception
        array[2] = "C"; //Exception

        System.out.println(Arrays.toString(array)); //ArrayIndexOutOfBoundsException
    }
}

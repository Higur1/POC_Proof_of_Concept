import java.util.Arrays;

public class StartArrays {
    public static void main(String[] args) {
        var array = new int[5]; // starts all of elements with 0
        var array2 = new double[5];
        var array3 = new boolean[3]; // starts all of elements with false

        var array4 = new String[5]; // starts all of elements with null
        var array5 = new int[] {2,4,6,8,10}; // creates a array already adding elements
        int[] array6 = {2,4,6,8,10}; // another form to create array

        System.out.println(Arrays.toString(array4));
    }
}

import java.util.Arrays;

public class ArraysUtils {
    public static void main(String[] args) {
        String[] letters = new String[5];

        //Add elements in array positions
        Arrays.fill(letters, "A");

        letters[0] = "C";
        letters[1] = "F";
        letters[2] = "A";
        letters[3] = "H";
        letters[4] = "E";

        //Sort array in alphabetical order
        Arrays.sort(letters);

        //Way to search a element in order array, return the position
        System.out.println(Arrays.binarySearch(letters, "C"));

        //Way to increase array size, copy
        String[] letters2 = Arrays.copyOf(letters, 10);

        //Way to see elements of array
        System.out.println(Arrays.toString(letters));
    }
}

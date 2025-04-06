package SquareTheElements;

import java.util.Arrays;

//Create a method that receives an array of integers as a parameter and squares each of the existing elements,
//replacing them within the original array.
public class ExerciseOne {
    public static void main(String[] args) {

        int[] numbers = {2,5,6,7};
        toSquare(numbers);
        System.out.println(Arrays.toString(numbers));

    }
    private static void toSquare(int... numbers){
        // not possible use enhanced for
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = (int) Math.pow(numbers[i], 2);
        }
    }
}

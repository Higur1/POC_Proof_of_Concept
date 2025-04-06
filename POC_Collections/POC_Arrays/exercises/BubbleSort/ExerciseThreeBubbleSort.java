package BubbleSort;

import java.util.Arrays;

//Implement the BubbleSort algorithm, which sorts elements in an array.
//In general terms, Bubble Sort compares each elements with its right neighbor, swapping the elements if the neighbor is smaller.
public class ExerciseThreeBubbleSort {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 7, 8, 3, 1, 3, 6, 7, 3, 1, 8 , 10, 15, 16 ,2, 4, 1};
        bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] bubbleSort(int... numbers){
        int aux;
        for(int j = 0; j < numbers.length-1; j++){
            for(int i = j+1; i < numbers.length; i++){
                if(numbers[j] > numbers[i]){
                    aux = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = aux;
                }
            }
        }

        return numbers;
    }
}

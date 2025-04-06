package RandomAndOrderedNumbers;

import java.util.*;

public class RandomAndOrderedNumbers {
    private static Random random = new Random();

    public static void main(String[] args) {
        System.out.print(generate(15));
    }

    //resolved
    private static List<Integer> generate(int number){
        var numbers = new ArrayList<Integer>(number);

        for(int i = 0; i < number ; i++){
            numbers.add(random.nextInt(0,101));
        }
        numbers.sort(Comparator.naturalOrder());
        return Collections.unmodifiableList(numbers); //return unmodifiable list
    }

    //first try
    /*private static List<Integer> generateRandomNumbers(int quantity){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < quantity; i++){
            int number = (int) (Math.random()*100);
            list.add(number);
        }
        for(int n: list){
            System.out.print(n+" ");
        }
        System.out.println();
        list.sort(Comparator.naturalOrder());
        return list;
    }*/
}

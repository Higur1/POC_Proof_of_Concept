package FilteringAListWithALambdaCondition;

import java.util.ArrayList;
import java.util.List;

public class FilterLambda {
    public static void main(String[] args) {
        var list = List.of(1,2,3,4,5,6,7,8);
        System.out.println(filter(list, i -> i % 2 == 0));
        System.out.println(filter(list, i -> i % 2 != 0));
        System.out.println(filter(list, i -> i >= 5 ));
    }
    private static List<Integer> filter(List<Integer> list, Condition condition){
        List<Integer> newList = new ArrayList<>();
        for(int i: list){
            if (condition.test(i)){
                newList.add(i);
            }
        }
        return newList;
    }

    @FunctionalInterface
    interface Condition{
        boolean test(int i);
    }
}

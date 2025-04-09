import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectGroupingBy {
    public static void main(String[] args) {
        groupingByInit(); //grouping items
        groupingByCount(); //count items with same letter
        groupingBySumDouble(); //sum all items startWith same letter
        groupingMaxPrice();//group and return the highest price item
    }

    private static void groupingByInit() {
        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(i -> i.name().charAt(0))) // group by first letter
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static void groupingByCount() {
        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(
                        i -> i.name().charAt(0), // group by first letter
                        Collectors.counting()
                ))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static void groupingBySumDouble() {
        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(
                        i -> i.name().charAt(0), // group by first letter
                        Collectors.summingDouble(Item::price)
                ))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }

    private static void groupingMaxPrice() {
        Item
                .list()
                .stream()
                .collect(Collectors.groupingBy(
                        i -> i.name().charAt(0), // group by first letter
                        Collectors.maxBy(Comparator.comparing(Item::price)) //return optional
                ))

                .forEach((k, v) -> System.out.println(k + " => " + v));
    }

}

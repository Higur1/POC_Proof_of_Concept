import java.util.stream.Collectors;

public class CollectPartition {
    public static void main(String[] args) {
        Item
                .list()
                .stream()
                .collect(Collectors.partitioningBy(i -> i.price() >= 5))
                .forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

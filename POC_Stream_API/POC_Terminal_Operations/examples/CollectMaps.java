import java.util.stream.Collectors;

public class CollectMaps {
    public static void main(String[] args) {
        var items = Item
                .list()
                .stream()
                //.collect(Collectors.toMap(i -> i.name(), i ->i.price()));
                .collect(Collectors.toMap(Item::name, Item::price));

        System.out.println(items);
    }
}

import java.util.List;

public record Item(String name, double price) {
    public static List<Item> list() {
        return List.of(
                new Item("Onion", 3.9),
                new Item("Coffee", 10.0),
                new Item("Flour", 6.4),
                new Item("Rice", 7.8),
                new Item("Milk", 4.7),
                new Item("Orange", 3.5)
        );
    }
}


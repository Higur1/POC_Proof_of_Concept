public class FindFirst {
    public static void main(String[] args) {
        Item item = Item
                .list()
                .stream()
                .filter(i -> i.price() >= 11) //select value to filter
                .findFirst() //Terminal Operation
                .orElse(null);

        System.out.println(item);
    }
}

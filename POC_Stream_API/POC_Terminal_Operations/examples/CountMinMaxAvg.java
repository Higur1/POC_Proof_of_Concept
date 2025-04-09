public class CountMinMaxAvg {
    public static void main(String[] args) {
        long count = Item
                .list()
                /*.stream()
                .count();*/
                .size(); //is possible

        double max = Item
                .list()
                .stream()
                .mapToDouble(Item::price) //i -> i.price()
                .max().orElseThrow();

        double min = Item
                .list()
                .stream()
                .mapToDouble(Item::price) //i -> i.price()
                .min().orElseThrow();

        double avg = Item
                .list()
                .stream()
                .mapToDouble(Item::price) //i -> i.price()
                .average().orElseThrow();

        System.out.println("Count: " + count);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + avg);
    }
}

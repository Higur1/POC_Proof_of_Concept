public class Reduce {
    public static void main(String[] args) {
        reduceDouble();
        reduceNames();
    }

    private static void reduceNames() {
        var items = Item
                .list()
                .stream()
                .map(Item::name)
                //.reduce("", (accum, s) -> accum+" "+s);
                //another way
                .reduce("", String::concat);

        System.out.println(items);
    }

    private static void reduceDouble() {
        double sum = Item
                .list()
                .stream()
                .map(Item::price)
                .reduce(
                        0.0, //determine type
                        //(accum, v) -> accum + v //determine the operation of reduce
                        //another way
                        //(accum, v) -> Double.sum(accum, v)
                        //lambda reference
                        Double::sum
                );

        System.out.println(sum);
    }
}

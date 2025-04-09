public class ForEachOperation {
    public static void main(String[] args) {
        Item
                .list()
                /*.stream()
                .forEach(System.out::println);*/
                .forEach(System.out::println); // is possible use without stream()
    }
}

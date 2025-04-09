public class Match {
    public static void main(String[] args) {
        boolean r = Item
                .list()
                .stream()
                //.allMatch() all respect the condition
                //.anyMatch() one or more respect the condition
                //.noneMatch() none respect the condition
                .map(Item::name)
                .anyMatch(n -> n.startsWith("C"));

        System.out.println(r);
    }
}

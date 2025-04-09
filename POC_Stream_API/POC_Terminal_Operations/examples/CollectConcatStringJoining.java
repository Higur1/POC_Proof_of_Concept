import java.util.stream.Collectors;

public class CollectConcatStringJoining {
    public static void main(String[] args) {
        var names = Item
                .list()
                .stream()
                .map(Item::name)
                //.collect(Collectors.joining()); // just concat all string names
                .collect(Collectors.joining(" | ", "==> ", " <=="));// delimiter - prefix - suffix

        System.out.println(names);
    }
}

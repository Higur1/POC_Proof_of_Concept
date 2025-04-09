import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        var items = Item
                .list()
                .stream()
                //.collect(Collectors.toList());
                .toList();

        //immutable list
        var items2 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableList());


        //Remove duplicate items
        var items3 = Item
                .list()
                .stream()
                .collect(Collectors.toSet()); //HashSet

        //Immutable
        var items4 = Item
                .list()
                .stream()
                .collect(Collectors.toUnmodifiableSet());
    }

}

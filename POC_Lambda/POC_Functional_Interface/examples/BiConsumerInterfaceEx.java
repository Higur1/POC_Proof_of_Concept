import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceEx {
    public static void main(String[] args) {
        var list = List.of("A", "B", "C", "D");
        iterate(list, (i, e) -> {
            System.out.println(i + " -> " + e);
        });
    }

    private static void iterate(List<String> list, BiConsumer<Integer, String> biConsumer){
        for (int i=0 ; i < list.size(); i++){
            biConsumer.accept(i, list.get(i));
        }
    }
}

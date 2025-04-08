import java.util.function.Consumer;

public class ConsumerInterfaceEx {
    public static void main(String[] args) {
        repeat(4, System.out::println);
    }

    private static void repeat(int n, Consumer<Integer> consumer){
        for(int i = 0; i < n; i++){
            consumer.accept(i);
        }
    }
}

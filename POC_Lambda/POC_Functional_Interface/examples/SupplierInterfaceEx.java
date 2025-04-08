import java.util.Random;
import java.util.function.Supplier;

//provider information - generate information
public class SupplierInterfaceEx {
    public static void main(String[] args) {
        int n1 = generate(() -> 1);
        System.out.println(n1);

        int n2 = generate(() -> (int) (Math.random()*1000));
        System.out.println(n2);

        int n3 = generate(() -> {
            Random random = new Random();
            return random.nextInt(10, 20);
        });
        System.out.println(n3);
    }
    private static int generate(Supplier<Integer> supplier){
        return supplier.get();
    }
}

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsThread {
    public static void main(String[] args) {
        ExecutorService e = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newFixedThreadPool(5);
        ExecutorService es1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()); //use all core available
        ExecutorService es2 = Executors.newCachedThreadPool(); //grows and shrinks as the need for task completion increases

        e.submit(() -> {
            System.out.println("Hi");
        });
        e.shutdown();
    }
}

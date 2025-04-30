import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private static final AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        try (ExecutorService e = Executors.newFixedThreadPool(15)) {

            List<Future<?>> futures = new ArrayList<>();
            for (int i = 0; i < 15; i++) {
                futures.add(
                        e.submit(
                                () -> {
                                    for (int j = 0; j < 100; j++) {
                                       counter.incrementAndGet();
                                        sleep();
                                    }
                                }
                        )
                );
            }
            for (var future : futures) {
                wait(future);
            }
            System.out.println("Counter = " + counter);
        }
    }

    private static void sleep() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void wait(Future<?> future) {
        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

package CounterConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.stream.Stream;

public class CounterThread {
    public static void main(String[] args) throws Exception {
        try (ExecutorService e = Executors.newFixedThreadPool(10)) {
            CounterTask counter = new CounterTask();

            var tasks = Stream
                    .generate(() -> new FutureTask<>(counter))
                    .limit(100)
                    .toList();

            tasks.forEach(e::submit);
            for (int i = 0; i < tasks.size(); i++) {
                var task = tasks.get(i);
                int count = task.get();
                System.out.format("[%d] %d\n", (i+1), count);
            }
        }
    }
}

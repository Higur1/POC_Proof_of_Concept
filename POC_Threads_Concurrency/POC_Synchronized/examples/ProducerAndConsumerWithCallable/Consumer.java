package ProducerAndConsumerWithCallable;

import java.util.concurrent.Callable;

public class Consumer implements Callable<Void> {
    private final String name;
    private final ItemsQueue queue;

    public Consumer(String name, ItemsQueue queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public Void call() throws Exception {
        while (true){
            queue.consume(name);
            Thread.sleep(300);
        }
    }
}

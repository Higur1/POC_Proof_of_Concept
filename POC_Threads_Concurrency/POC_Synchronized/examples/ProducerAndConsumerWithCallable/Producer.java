package ProducerAndConsumerWithCallable;

import java.util.concurrent.Callable;

public class Producer implements Callable<Void> {
    private final String name;
    private final ItemsQueue queue;

    public Producer(String name,ItemsQueue queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public Void call() throws Exception {
        int counter = 0;
        while (true) {
            queue.produce(name, counter++);
            Thread.sleep(300);

        }
    }
}

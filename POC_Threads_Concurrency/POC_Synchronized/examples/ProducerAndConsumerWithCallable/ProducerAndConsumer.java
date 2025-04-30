package ProducerAndConsumerWithCallable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerAndConsumer {
    public static void main(String[] args) {
        ItemsQueue queue = new ItemsQueue(10);
        int numProducers = 3;
        int numConsumers = 3;

        ExecutorService e = Executors.newFixedThreadPool(numConsumers+numProducers);

        for (int i = 0; i <= numProducers ; i++) {
            e.submit(new Producer("P"+1, queue));
        }
        for (int i = 0; i < numConsumers; i++) {
            e.submit(new Consumer("C"+1, queue));
        }
    }
}

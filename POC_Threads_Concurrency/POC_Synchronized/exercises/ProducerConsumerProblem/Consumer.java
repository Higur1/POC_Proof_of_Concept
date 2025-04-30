package ProducerConsumerProblem;

import java.util.Queue;

public class Consumer extends Thread {
    private final String name;
    private final Queue<Integer> queue;

    public Consumer(String name, Queue<Integer> queue) {
        this.name = name;
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            consume();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void consume() {
        synchronized (queue) {
            while (queue.isEmpty()) {
                System.out.format("%s Stopped\n", name);
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            int value = queue.poll();
            System.out.format("%s Consumed: %d\n", name, value);
            queue.notifyAll();

        }
    }
}

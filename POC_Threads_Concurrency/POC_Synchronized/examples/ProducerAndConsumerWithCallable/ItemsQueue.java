package ProducerAndConsumerWithCallable;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ItemsQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int queueSize;
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public ItemsQueue(int queueSize) {
        this.queueSize = queueSize;
    }

    public void produce(String name, int value) throws InterruptedException {
        lock.lock();
        try {
            while (queue.size() == queueSize) {
                System.out.format("%s stopped\n", name);
                condition.await();
            }
            queue.offer(value);
            System.out.format("%s produced: %d\n", name, value);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void consume(String name) throws InterruptedException {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                System.out.format("%s stopped\n", name);
                condition.await();
            }
            int value = queue.poll();
            System.out.format("%s consumed: %d\n", name, value);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}

package CounterConcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterTask implements Callable<Integer> {
    private int count;
    private final Lock lock = new ReentrantLock();

    @Override
    public Integer call() throws Exception {
        Thread.sleep(10);
        lock.lock();
        try {
            return ++count;
        } finally {
            lock.unlock();
        }
    }
}

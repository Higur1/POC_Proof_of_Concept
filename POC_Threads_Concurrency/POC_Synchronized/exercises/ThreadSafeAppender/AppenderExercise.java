package ThreadSafeAppender;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AppenderExercise {
    public static void main(String[] args) {
        Appender appender = new Appender();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        try (ExecutorService e = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 10; i++) {
                char c = (char) (i + 65);
                e.submit(() -> {
                    appender.append(c);
                    countDownLatch.countDown();
                });
            }
            countDownLatch.await();
            System.out.println("String = " + appender);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static class Appender {
        private final StringBuilder sb = new StringBuilder();
        private final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();

        public void append(char c) {
            reentrantReadWriteLock.writeLock().lock();
            try {
                sb.append(c);
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        }

        @Override
        public String toString() {
            reentrantReadWriteLock.readLock().lock();
            try {
                return sb.toString();
            } finally {
                reentrantReadWriteLock.readLock().unlock();
            }
        }
    }
}

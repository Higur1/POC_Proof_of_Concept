import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class SemaphoreExample {
    public static void main(String[] args) throws Exception {

        Semaphore semaphore = new Semaphore(1);
        CountDownLatch countDownLatch = new CountDownLatch(10);

        var threads = Stream
                .generate(() -> new Thread(new CounterThread(semaphore, countDownLatch)))
                .limit(10)
                .toList();
        threads.forEach(Thread::start);
        countDownLatch.await();
        System.out.format("Count: %d", CounterThread.count);
    }

    public static class CounterThread implements Runnable {
        public static int count;
        private final Semaphore semaphore;
        private final CountDownLatch countDownLatch;

        public CounterThread(Semaphore semaphore, CountDownLatch countDownLatch) {
            this.semaphore = semaphore;
            this.countDownLatch = countDownLatch;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    semaphore.acquire();
                    count++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }finally {
                    semaphore.release();
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            countDownLatch.countDown();
        }
    }

}

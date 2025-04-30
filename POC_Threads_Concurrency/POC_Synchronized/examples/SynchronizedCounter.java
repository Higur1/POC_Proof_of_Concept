import java.util.Objects;
import java.util.stream.Stream;

public class SynchronizedCounter {

    public static void main(String[] args) {
        var threads = Stream
                .generate(CounterThread::new)
                .limit(3)
                .toList();
        threads.forEach(Thread::start);
        threads.forEach(SynchronizedCounter::join);
        System.out.println(CounterThread.getCounter());
    }

    private static class CounterThread extends Thread {
        private static final Object MONITOR = new Object(); //need static
        private static int counter = 0;

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                synchronized (MONITOR) {
                    counter++;
                }

                SynchronizedCounter.sleep(10);
            }
        }
        //another way to declare a critical zone - in this way the entire block of the method is determined as critical
        //public synchronized void run(){}

        public static int getCounter() {
            return counter;
        }
    }

    private static void join(Thread t) {
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

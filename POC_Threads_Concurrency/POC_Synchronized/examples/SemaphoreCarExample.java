import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class SemaphoreCarExample {
    public static void main(String[] args) {

        //no mutex semaphore
        Semaphore semaphore = new Semaphore(3);
        IntStream.range(0, 10)
                .mapToObj(i -> new Car(i+1, semaphore))
                .forEach(Thread::start);
    }

    private static class Car extends Thread {
        private final int id;
        private final Semaphore semaphore;

        public Car(int id, Semaphore semaphore) {
            this.id = id;
            this.semaphore = semaphore;
        }

        @Override
        public void run() {
            try {
                System.out.format("[%d] Arrived the frontier\n", id);
                semaphore.acquire();
                System.out.printf("[%d] Scan started\n", id);
                Thread.sleep((int) (Math.random() * 8000));
                System.out.printf("[%d] Scan finished\n", id);
                semaphore.release();
                System.out.printf("[%d] Have a nice trip\n", id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
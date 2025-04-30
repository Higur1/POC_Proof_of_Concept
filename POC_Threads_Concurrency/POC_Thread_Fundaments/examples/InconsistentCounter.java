import java.util.stream.Stream;

public class InconsistentCounter {
    public static void main(String[] args) {
        SharedCounter c = new SharedCounter();
         var threads = Stream.generate(() -> new Thread(c)).limit(5).toList();

        threads.forEach(Thread::start);

        threads.forEach(t -> {
            try {
                t.join();
            }catch (InterruptedException e){
                throw  new RuntimeException(e);
            }
        });

        System.out.println("Total: " + c.getCounter());
    }
    static class SharedCounter implements Runnable{
        private int counter;
        @Override
        public void run() {

            for (int i = 0 ; i< 100; i++){
                counter++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        public int getCounter() {
            return counter;
        }
    }
}

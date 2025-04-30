public class JoinThread {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter s = new SharedCounter();

        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        t1.join(); // block thread and await
        t2.join();

        System.out.println("End");
    }
    static class SharedCounter implements Runnable{
        private int i;
        @Override
        public void run() {
            while (i < 10){
                System.out.format("[%s] %d\n", Thread.currentThread().getName(), i);
                i++;
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

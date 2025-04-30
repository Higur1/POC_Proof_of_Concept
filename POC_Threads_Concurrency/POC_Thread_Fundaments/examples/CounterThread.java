public class CounterThread {
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }
    static class Counter implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                System.out.format("[%s] %d\n", Thread.currentThread().getName(), i);
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

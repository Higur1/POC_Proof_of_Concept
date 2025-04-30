public class VolatileThread {
    private static volatile int number;// volatile - Whenever a thread reads or writes to this variable, it directly accesses main memory (main memory), ensuring that all threads see the updated value.
    private static volatile boolean ready;

    public static void main(String[] args) {
        new Executor().start();
        number = 10;
        ready = true;
    }

    private static class Executor extends Thread {
        @Override
        public void run() {
            while (!ready) {
            }
            System.out.println(number);
        }
    }

}

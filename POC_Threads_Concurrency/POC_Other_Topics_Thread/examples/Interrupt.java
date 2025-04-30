public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {

            try {
                while (true) {
                    System.out.println("Ping!");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted....");

            }
        });
        t.start();
        Thread.sleep(5000);
        t.interrupt();
    }
}

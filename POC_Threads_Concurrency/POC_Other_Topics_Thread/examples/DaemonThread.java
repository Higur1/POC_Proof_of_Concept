public class DaemonThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true){
                System.out.println("Ping!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t.setDaemon(true); //set daemon thread
        t.start();
        System.out.println("Executing....");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done!");
    }
}

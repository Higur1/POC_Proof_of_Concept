import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutors {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService e = Executors.newScheduledThreadPool(1);
        ScheduledExecutorService s = Executors.newScheduledThreadPool(1);

   /*     e.schedule(() -> System.out.println("Good morning!"), 3, TimeUnit.SECONDS); //set 3 seconds to run task
        s.scheduleWithFixedDelay(() -> System.out.println("Good morning!"), 3,1, TimeUnit.SECONDS); //set 3 seconds to run task and then run the task every 1 second

        e.shutdown(); //does not block, it just informs that the executor can no longer receive tasks
        //e.schedule(() -> System.out.println("Good morning!"), 3, TimeUnit.SECONDS); //RejectExecutionException

        List<Runnable> pendingTasks = e.shutdownNow(); //closes all tasks including those that are running and return a list of pending tasks
        e.awaitTermination(5, TimeUnit.SECONDS); //block thread and await pool finished tasks*/


        e.submit(() -> {
            System.out.println("Tasks.....");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
            System.out.println("Tasks ended");
        });

        e.shutdown();
        try {
            if (!e.awaitTermination(1, TimeUnit.SECONDS)) { //verify if all tasks finished in 1 second
                e.shutdown(); // if tasks not finished in 1 second, shutdown tasks
            }
        } catch (InterruptedException exception) {
            e.shutdownNow(); //if exception, shutdown all tasks
        }

        //another way with same execution using try with resources
        try (ScheduledExecutorService se = Executors.newScheduledThreadPool(1)) {
            se.submit(() -> {
                System.out.println("Tasks.....");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    throw new RuntimeException(ex);
                }
                System.out.println("Tasks ended");
            });
        }
    }
}

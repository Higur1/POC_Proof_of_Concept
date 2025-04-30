import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class FutureTaskInformation {
    public static void main(String[] args) throws Exception {
        try(ExecutorService e = Executors.newSingleThreadExecutor()){
            FutureTask task = new FutureTask(new StringJoinerCallable(List.of("A","B","C")));
            e.submit(task);
            System.out.println(task.get());
        }
    }
}

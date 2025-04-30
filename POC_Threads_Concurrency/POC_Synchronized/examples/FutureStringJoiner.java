import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureStringJoiner {
    public static void main(String[] args) throws Exception{

        //with Runnable
        try (ExecutorService e = Executors.newSingleThreadExecutor()) {
            StringJoinerRunnable runnable = new StringJoinerRunnable(List.of("A", "B", "C"));
            Future<?> future = e.submit(runnable);
            future.get(); //blocks the thread and waits for completion
            System.out.println(runnable.getResult());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        //with Callable
        try (ExecutorService es = Executors.newSingleThreadExecutor()) {
            StringJoinerCallable callable = new StringJoinerCallable(List.of("C", "D", "E"));
            Future<String> future = es.submit(callable);
            String result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        //another way
        try(ExecutorService es1 = Executors.newSingleThreadExecutor()){
            Future<String> future = es1.submit(new StringJoinerCallable(List.of("F","G","H")));
            System.out.println(future.get());
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        //handling error thrown by callable
        try(ExecutorService es2 = Executors.newCachedThreadPool()){
            Future<String> future = es2.submit(new StringJoinerCallable(null));
            try{
                System.out.println(future.get());
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                System.out.println("ERROR: "+cause.getMessage());
                cause.printStackTrace();
            }
        }
    }
}

package ExecutingRunnableTask;

public class RunnableTasks {
    public static void main(String[] args) {

       /* //Anonymous class
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi");
            }
        };
        doIt(runnable);*/

        //Another way
        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hi");
            }
        });
        doIt(new Runnable() {
            @Override
            public void run() {
                System.out.println(Math.random());
            }
        });
    }

    public static void doIt(Runnable runnable){
        System.out.println("Running...");
        runnable.run();
    }
}

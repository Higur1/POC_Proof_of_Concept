//Good interface to use with threads
public class RunnableInterfaceEx {
    public static void main(String[] args) {
        execute(() -> System.out.println("Hi"));
        execute(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }
    private static void execute(Runnable runnable){
        runnable.run();
    }

}

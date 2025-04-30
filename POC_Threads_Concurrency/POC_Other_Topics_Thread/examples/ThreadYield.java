public class ThreadYield {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

                Thread.yield(); //gives the turn in the scheduler to another thread // no warranty
            }
        }).start();
    }
}

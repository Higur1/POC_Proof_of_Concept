public class NamedThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> System.out.println("Hello!"));
        Thread t2 = new Thread(() -> System.out.println("Hello!"));

        Thread.currentThread().setName("Thread Main"); //set name to main Thread
        t2.setName("Thread 2");

        System.out.println(Thread.currentThread().getName());
        System.out.println(t.getName());
        System.out.println(t2.getName());
    }
}

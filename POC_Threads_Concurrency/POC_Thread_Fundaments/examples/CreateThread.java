public class CreateThread {
    public static void main(String[] args) {
        //Basic mode
        /*MyThread t = new MyThread();
        t.start();// start a new thread*/

        //without inherit - implement Runnable
        Thread t = new Thread(new MyThread());
        t.start();

        //another way with Runnable implements - using lambda - no need create a class
        Thread t1 = new Thread(() -> {
            System.out.println("Thread here 1");
        });
        t1.start();

        //another way - short
        new Thread(() -> System.out.println("Thread 3 here")).start();



        System.out.println("main()");
    }
    //basic mode
   /* static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("Thread here");
        }
    }*/
    static class MyThread implements Runnable{
        @Override
        public void run() {
            System.out.println("Thread here 2");
        }
    }
}

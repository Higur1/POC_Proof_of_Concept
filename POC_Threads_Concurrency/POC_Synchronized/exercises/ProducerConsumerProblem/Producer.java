package ProducerConsumerProblem;

import java.util.Queue;

public class Producer extends Thread {
    private final String name;
    private final Queue<Integer> queue;
    private final int queueSize;


    public Producer(String name, Queue<Integer> queue, int queueSize) {
        this.name = name;
        this.queue = queue;
        this.queueSize = queueSize;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            produce(counter++);
            try {
                Thread.sleep(300) ;
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }

    private void produce(int value) {
        synchronized (queue) {
            while (queue.size() == queueSize) {
                System.out.format("%s Stopped\n", name);
                try {
                    queue.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(value);
            System.out.format("%s Produced: %d\n", name, value);
            queue.notifyAll();
        }
    }
}

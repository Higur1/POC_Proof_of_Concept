package ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class ProduceAndConsumer {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Producer p1 = new Producer("P1", queue, 10);
        Consumer c1 = new Consumer("C1", queue);
        Producer p2 = new Producer("P2", queue, 10);
        Consumer c2 = new Consumer("C2", queue);
        Consumer c3 = new Consumer("C3", queue);


        p1.start();
        c1.start();
        p2.start();
        c2.start();
        c3.start();
    }
}

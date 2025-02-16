import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Queue<String> queue = new LinkedList<String>();

        // queue.offer("hello");
        // queue.offer("two");
        // queue.offer("world");
        // System.out.println(queue);
        // queue.poll(); // renove fist element form the queue.
        // System.out.println(queue);

        // priority queue
        // Queue<Integer> queue = new PriorityQueue<>(); // print in assending order
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // print in descending order down to up
        // we also do it with string data tyes A,B,C,D,E,F,G,H.
        queue.offer(5);
        queue.offer(3);
        queue.offer(8);
        queue.offer(4);
        queue.offer(6);
        queue.offer(1);
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());

        }

    };

}

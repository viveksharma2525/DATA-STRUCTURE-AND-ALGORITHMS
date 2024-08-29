// import java.util.LinkedList;
// import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * QueueRunner
 */
public class QueueRunner {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.peek());
        queue.poll();
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

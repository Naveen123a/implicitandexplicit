import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Insert elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println("Queue elements: " + queue);

        // Remove elements from the queue
        int removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        int frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        System.out.println("Queue elements after removal: " + queue);
    }
}

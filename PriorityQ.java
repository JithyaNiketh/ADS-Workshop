import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();   min heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // max heap  
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        System.out.println(pq);
        System.out.println("Top Element: "+pq.element());
        System.out.println("Removed Element: " + pq.poll());
        System.out.println(pq);
    }
}

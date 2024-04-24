import java.util.Arrays;
import java.util.PriorityQueue;

public class Q {
    public static int ConnectRopesWithMinimumCost(int[] arr) {
        Arrays.sort(arr);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int length : arr) {
            pq.offer(length);
        }
        int cost = 0;
        
        while (pq.size() > 1) {

            int rope1 = pq.poll();
            int rope2 = pq.poll();
            
            int sum = rope1 + rope2;
            cost += sum;
            
            pq.offer(sum);
        }
        
        return cost;
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 6};
        int result = ConnectRopesWithMinimumCost(arr);
        System.out.println("Minimum cost to connect ropes: " + result);
    }
}

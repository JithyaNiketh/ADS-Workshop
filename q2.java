// import java.util.Collections;
// import java.util.PriorityQueue;
// import java.util.Scanner;

// public class q2 {
//     public static void main(String[] args) {
//         Scanner a = new Scanner(System.in);
//         System.out.print("Enter range: ");
//         int range = a.nextInt();
//         PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
//         for (int i=1; i<range+1; i++){
//             pq.add(i);
//             if (i<2){
//                 System.out.println(-1);
//             }
//             else{
//                 int a1 = pq.poll();
//                 int a2 = pq.poll();
//                 int a3 = pq.poll();
//                 int result = (a1*a2*a3);
//                 System.out.println(result);
//                 pq.offer(a1);
//                 pq.offer(a2);
//                 pq.offer(a3);
//             }
//         }
//         // System.out.println(pq);
//         // if (pq.size()<3){
//         //     System.out.println(-1);
//         // }
//         // else{
//         //     int x = pq.poll();
//         //     int y = pq.poll();
//         //     int z = pq.poll();
//         //     System.out.println(x*y*z);
//         // }
//     }
// }

import java.util.HashMap;
import java.util.Map;

public class N {
    public static void main(String[] args) {
        int[] a = {-1, 2, -1, 3, 2};
        int[] r = NN(a);
        if (r.length>0) {
            System.out.println(r[0]);
        }
        if (r.length==0){
            System.out.println("There is no non repeating element in the array.");
        }
    }

    public static int[] NN(int[] a) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : a) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        for (int n : a) {
            if (hm.get(n) == 1) {
                return new int[]{n};
            }
        }

        return new int[0];
    }
}

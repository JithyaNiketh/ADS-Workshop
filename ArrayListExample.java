import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        System.out.println("element at index 0: " + l1.get(0));
        for (String element: l1){
            System.out.println(element);
        }
    }
}

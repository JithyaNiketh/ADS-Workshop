import java.util.ArrayList;

public class ListOperations {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add(0,"A");
        System.out.println(l1);
        l1.add(0, "B");
        System.out.println(l1);
        System.out.println(l1.get(1));
        // l1.set(2, "C");  Index not defined
        l1.add(2,"C");
        System.out.println(l1);
        // l1.add(4,"D");    Index not defined
        System.out.println(l1.remove(1));
        System.out.println(l1);
        l1.add(1,"D");
        System.out.println(l1);
        l1.add(1,"E");
        System.out.println(l1);
        // System.out.println(l1.get(4));  Index not defined
        l1.add(4,"F");
        System.out.println(l1);
        l1.set(2, "E");
        System.out.println(l1);
        System.out.println(l1.get(2));
    }
}

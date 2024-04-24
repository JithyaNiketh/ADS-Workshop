public class Sample{
    public static void main(String[] args) {
        int a=69;
        @SuppressWarnings("deprecation")
        Integer i = new Integer(a);
        Integer j = a;
        int c=i.intValue();
        int d=j;
        System.out.println(a+" "+i+" "+j+" "+c+" " +d);
    }
}

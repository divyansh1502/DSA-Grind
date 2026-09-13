
public class Demo1 {
    public static void main(String[] args) {
        // Upcasting
        String s = "Hello";
        Object obj = s;
        System.out.println(obj);

        // Downcasting
        Object obj2 = "Divyansh";
        String s2 = (String)obj2;
        System.out.println(s2);

        // ClassCastException
        Object obj3 = 10;
        String a = (String)obj3;

    }
}

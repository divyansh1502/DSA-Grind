public class Demo5 {
    public static void main(String[] args) {
        String s = "Hello";
        Integer i = 101;
        System.out.println(getResult(s));
        System.out.println(getResult(i));

        print("Divyansh", 22); // type inference
    }
    public static <T> T getResult(T x) { // <T> Type parameter
        return x;
    }
    public static <T, U> void print(T name, U age) {
        System.out.println(name + ": " + age);
    }
}
public class OddEven {
    public static void main(String[] args) {
        // int a = 11;
        // if((a & 1) == 0) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("odd");
        // }

        int n = 64;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
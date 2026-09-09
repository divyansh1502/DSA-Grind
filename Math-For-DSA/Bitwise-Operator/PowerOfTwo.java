public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 32;
        if(n > 0 & (n & (n - 1)) == 0) {
            System.out.println("Power of two");
        } else {
            System.out.println("Not power of two");
        }
    }
}

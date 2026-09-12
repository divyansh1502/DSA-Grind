
public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(12456));
    }
    static int sum(int n) {
        if(n == 0) {
            return 0;
        }
        int ld = n % 10;
        return ld + sum(n/10);
    }
}

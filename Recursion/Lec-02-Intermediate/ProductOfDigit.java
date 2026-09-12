
public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(product(12349));
    }
    static int product(int n) {
        if(n == 0) {
            return 1;
        }
        int lastDigit = n % 10;
        return lastDigit * product(n - 1);
    }
}

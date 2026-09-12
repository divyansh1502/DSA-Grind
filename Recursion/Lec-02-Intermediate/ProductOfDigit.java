
public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println(product(1239));
    }
    static int product(int n) {
        if(n <= 0) {
            return 1;
        }
        //  if(n % 10 == n) {
        //     return n;
        // }
        return (n % 10) * product(n / 10);
    }
}

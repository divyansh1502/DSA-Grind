
public class IsPrime {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " is prime: " + isprime(i));
        }
    }
    static boolean isprime(int n) {
        if(n <= 1) {
            return false;
        }
        int c = 2;
        while(c * c <= n) {
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}

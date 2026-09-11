public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(36, 24));
        System.out.println(gcd(36, 24));
    }
    static int GCD(int a, int b) {
        while(a != b) {
            if(a > b) {
                a = a- b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    // Euclidean Algorithm for finding GCD/HCF
    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
}
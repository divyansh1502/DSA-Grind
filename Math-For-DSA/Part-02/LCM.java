public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(12,15));
        System.out.println(lcmUsingGCD(12,51));
    }
    static int lcm(int a, int b) {
        int max = Math.max(a, b);
        
        while(true) {
            if(max % a == 0 && max % b == 0) {
                return max;
            }
            max++;
        } 
    }
    static int lcmUsingGCD(int a, int b) {
         
        return (a * b) / gcd(a, b);
        
    }
    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
}

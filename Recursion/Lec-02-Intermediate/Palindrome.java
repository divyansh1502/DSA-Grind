
public class Palindrome {
    public static void main(String[] args) {
        int n = 12321;
        reverse(n);
        if(sum == n) {
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
    static int sum = 0;
    static void reverse(int n) {
        if(n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
        
    }
}

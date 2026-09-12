
public class NumberOfSteps {
    public static void main(String[] args) {
        System.out.println(numberofSteps(16));
    }
    static int numberofSteps(int n) {
        return helper(n, 0);
    }
    static int helper(int n, int c) {
        if(n == 0) {
            return c;
        }
        if(n % 2 == 0) {
            return helper(n / 2, ++c);
        } else {
            return helper(n - 1, ++c);
        }
    }

}

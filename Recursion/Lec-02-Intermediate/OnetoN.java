
public class OnetoN {
    public static void main(String[] args) {
        // print(10);
        printBoth(5);
    }
    static void print(int n) {
        if(n == 0) {
            return;
        }
        print(n - 1);
        System.out.println(n);
    }
    static void printBoth(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        if(n != 1) {
            System.out.println(n);
        }
        
    }
}

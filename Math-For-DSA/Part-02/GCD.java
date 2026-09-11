public class GCD {
    public static void main(String[] args) {
        System.out.println(GCD(36, 23));
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
}
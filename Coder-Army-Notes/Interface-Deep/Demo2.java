public class Demo2 {
    public static void main(String[] args) {
        MathConsonants m1 = new Random();
        m1.fun();
        System.out.println(MathConsonants.VALUE);
    }
}

//Variables inside interface
interface MathConsonants {
    double PI_VALUE = 3.14; // internally==> public static final double PI_VALUE = 3.14;
    int VALUE = 14; // public static final int VALUE = 14;

    void fun(); // public void fun();
}
class Random implements MathConsonants {
    public void fun() {
        System.out.println(PI_VALUE);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
    }
}

// Java Resultion priority Rule
interface A {
    default void fun() {
        System.out.println("Inside A Interface");
    }
}
class B {
    public void fun() {
        System.out.println("Inside B Class");
    }
}
class C extends B implements A {

}
public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
        c.fun2();
    }
}
// Multiple Inheritance --> Interface

interface A {
    void fun();
}

interface B {
    void fun2();
}
class C implements A,B {  // Multiple inheritance

    @Override
    public void fun() {
        System.out.println("Implemented from interface A");
    }

    @Override
    public void fun2() {
        System.out.println("Implemented from interface B");
    }
}
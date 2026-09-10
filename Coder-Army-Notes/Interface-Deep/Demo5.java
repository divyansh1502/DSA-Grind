public class Demo5 {
    public static void main(String[] args) {
        D d = new D();
        d.fun();
    }
}
interface A {
    void fun(); // public abstract void fun();
}
interface B extends  A {
    default void fun() {
        System.out.println("A --> B"); 
    }
}
interface C extends A {
    default void fun() {
        System.out.println("A --> C");
        
    }
}
class D implements B,C { //if both implemented fn is defined using default then it become compulsary to Override that method in implemented class
    @Override
    public void fun() {
        System.out.println("Default Implementation");
        B.super.fun(); // we can call the parent interface method using super keyword 
        C.super.fun();
    }
}

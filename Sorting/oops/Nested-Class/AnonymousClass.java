public class AnonymousClass {
    public static void main(String[] args) {
        Person p1  = new Person(){
            String name = "Divyansh";
            @Override
            void greet() {
                sayHello();
                System.out.println("I am " + name);
            }
            void sayHello() {
                System.out.println("Hello");
            }
        };
        p1.greet();
    }
}
class Person {
    void greet() {
        System.out.println("Hello, I m a Person.");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        StreetDog d1 = new StreetDog();
        d1.eat();
        d1.sound();
    }
}
// Interface inheritance

interface Animal {
    void eat();
}
interface Dog extends Animal {
    void sound();
}
class StreetDog implements Animal, Dog {
    @Override
    public void eat() {
        System.out.println("Animal is eating");
    }
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}
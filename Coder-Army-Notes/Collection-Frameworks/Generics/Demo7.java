
public class Demo7 {
    public static void main(String[] args) {
        Box<Fish> b1 = new Box<>();
        b1.value = new Fish();
        b1.value.swim();
    }
}
//<T extends Class implements interface1, interface2 ....>
// Only Fish class is accessiable
// class Box<T extends Animal & Swimmable> { 
//     T value;
// }
class Box<T extends Animal> {
    T value;
}
class Animal {
    void Display() {
        System.out.println("Animal is displaying");
    }
}
interface Swimmable {
    void swim();
}
class Dog extends Animal {

}
class Fish extends Animal implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimmimg");
    }
}
import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);
    }
    static void fun(List<? extends Animal> values) {
        // Animal a = values.get(values);
        for (Animal animal : values) {
            animal.eat();
        }
    } 
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("walking");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
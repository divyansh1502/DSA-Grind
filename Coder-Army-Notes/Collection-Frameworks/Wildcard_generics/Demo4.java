import java.util.ArrayList;
import java.util.List;

public class Demo4 {
    public static void main(String[] args) {
        // Generics with lower bound(super)
        List<Animal> animal = new ArrayList<>();
        animal.add(new Animal());
        animal.add(new Animal());

        fun(animal);
        fun(animal);

    }
    public static void fun(List<? super Animal> values) {
        // Writing
        values.add(new Animal());
        values.add(new  Dog());
        values.add(new  Cat());
        values.add(new Labrador());

        // Reading
        for(Object obj : values) {
            Animal a = (Animal)obj;
            a.eat();
        }
    }
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
    void walk() {
        System.out.println("Animal is walking");
    }
}
class Dog extends Animal {
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
    void bark() {
        System.out.println("Dog is barking");
    }
}
class Labrador extends Dog {
    @Override
    void eat() {
        System.out.println("Labrador Dog is eating");
    }
}
class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is eating");
    }
}
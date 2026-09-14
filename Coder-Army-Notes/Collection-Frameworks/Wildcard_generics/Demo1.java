import java.util.ArrayList;
import java.util.List;

public class Demo1 {
    public static void main(String[] args) {
        //Generics Invariant
        Animal a = new Dog();
        a.eat();
        a.walk();
        // a.bark(); --> can't call as it is not defined in Parent class

        // Not posiible in generics
        // List<Dog> dogs = new ArrayList<>();
        // List<Animal> animals = dogs;

        Dog[] dogs = new Dog[10];
        Animal[] animals = dogs;

        animals[0] = new Dog();
        animals[1] = new Dog();
        animals[2] = new Dog();
        animals[3] = new Dog();
        animals[4] = new Animal(); // This will give runtine error but still allowed so it is risky

        for(Animal animal : animals) {
            if(animal == null) {
                continue;
            }
            animal.eat();
        }
    }
}
class Animal {
    void eat() {
        System.out.println("Eating");
    }
    void walk() {
        System.out.println("Walking");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
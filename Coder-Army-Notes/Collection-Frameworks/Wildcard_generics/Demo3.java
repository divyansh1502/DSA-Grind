import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        fun(dogs);

        List<Animal> animsls = new ArrayList<>();
        animsls.add(new Animal());
        animsls.add(new Animal());

        fun(animsls);

        List<Integer> l = new ArrayList<>();
        // fun(l); --> not possible as Integer is not applicable for arguments in fun() 
    }
    static void fun(List<? extends Animal> values) {
        // Animal a = values.get(values);

        for (Animal animal : values) {
            animal.eat();
        }
        // values.add(new Dog()); --> Not allowed
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
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
    void bark() {
        System.out.println("Barking");
    }
}
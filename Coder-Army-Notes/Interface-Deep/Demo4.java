public class Demo4 {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.drive();
        Vehicle.brake();
    }
}

// After Java 8 --> default,static --> We can define a method of default access modifier inside interface
// Afetr Java 9 --> private
interface Vehicle {
    default void drive() {
        System.out.println("Vehicle is driving");
    }
    static void brake() {
        System.out.println("Vehicle is applying Brake");
    }
    private void accelerate() {
        System.out.println("Vehicle is accelerating");
    }
}
class Car implements Vehicle {
    public void drive() {
        System.out.println("Car is driving");
    }
}
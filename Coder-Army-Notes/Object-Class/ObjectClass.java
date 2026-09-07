import java.util.Objects;

public class ObjectClass {

    public static void main(String[] args) throws CloneNotSupportedException {

        // -------------------- toString() --------------------

        Student s1 = new Student();

        s1.name = "Divyansh";
        s1.age = 21;

        // println() internally calls toString() on the object.
        System.out.println(s1);


        // -------------------- equals() and == --------------------

        Student s2 = new Student();

        s2.name = "Divyansh";
        s2.age = 21;

        // equals() compares values when properly overridden.
        System.out.println(s1.equals(s2));       // true

        // == compares object references.
        System.out.println(s1 == s2);             // false


        // -------------------- hashCode() --------------------

        System.out.println(s1.hashCode() == s2.hashCode());   // true


        // -------------------- getClass() --------------------

        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());


        // -------------------- instanceof --------------------

        // Checks whether an object is an instance of a class
        // or one of its subclasses.
        System.out.println(s1 instanceof Student);    // true
        System.out.println(s1 instanceof Object);     // true


        // -------------------- clone() --------------------

        // Cloneable is a marker interface.
        // Object.clone() performs a shallow copy by default.
        Student s3 = (Student) s1.clone();

        System.out.println(s3.name);
        System.out.println(s3.age);


        // -------------------- getClass() with inheritance --------------------

        Animal a = new Animal();
        Animal d = new Dog();

        System.out.println(a.getClass().getName());
        System.out.println(d.getClass().getName());

        System.out.println(a instanceof Animal);      // true
        System.out.println(a instanceof Dog);         // false
        System.out.println(d instanceof Animal);      // true
        System.out.println(d instanceof Dog);         // true
    }
}


// Every class directly or indirectly extends Object.
class Student implements Cloneable {

    String name;
    int age;

    @Override
    public String toString() {
        return name + " " + age;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        // Checks whether both objects belong to the same class.
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Student s = (Student) obj;

        return Objects.equals(this.name, s.name)
                && this.age == s.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


class Animal {

}


class Dog extends Animal {

}



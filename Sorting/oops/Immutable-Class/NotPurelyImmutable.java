
public class NotPurelyImmutable {
    public static void main(String[] args) {
        
        College college = new College("AIET", "Lucknow");
        Student s1 = new Student("Divyansh", 21, college);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().address);
        System.out.println(s1.getCollege().address = "Kanpur"); // This is where it fails we can change the data 
    }
}
class Student {
    private final String name;
    private final int age;
    private final College college;

    public Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = college;
    } 
    //getters
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    College getCollege() {
        return this.college;
    }
}
class College {
    String name;
    String address;

    public College(String name, String address) {
        this.name = name;
        this.address = address;
    }
}

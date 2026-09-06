
public class PurelyImmutableClass {
     public static void main(String[] args) {
        
        College college = new College("AIET", "Lucknow");
        Student s1 = new Student("Divyansh", 21, college);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getCollege().name);
        System.out.println(s1.getCollege().address);
        s1.getCollege().address = "Kanpur";
        System.out.println(s1.getCollege().address); 
    }
}
//Immutable
//Defensive copy OR Deep Copy
class Student {
    private final String name;
    private final int age;
    private final College college;

    public Student(String name, int age, College college) {
        this.name = name;
        this.age = age;
        this.college = new College(college.name, college.address);
    } 
    //getters
    String getName() {
        return this.name;
    }
    int getAge() {
        return this.age;
    }
    College getCollege() {
        return new College(college.name, college.address); //Not passing actual reference addres firslty creating a new obj copy values and pass the new obj reference
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


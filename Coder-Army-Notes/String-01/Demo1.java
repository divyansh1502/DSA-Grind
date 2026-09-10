
public class Demo1 {
    public static void main(String[] args) {
        
        String s1 = "Hello";
        String s2 = "Hello";
        
        System.out.println(s1 == s2); // references are compared hence True --> Stored in String pool

        String str1 = new String("World");
        String str2 = new String("World");

        System.out.println(str1 == str2); // here references are different hence False --> Stored in heap memory
        System.out.println(str1.equals(str2)); // It compare the value rather than the references hence True
        
    }
}

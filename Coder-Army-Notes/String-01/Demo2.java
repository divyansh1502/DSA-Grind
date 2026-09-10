
public class Demo2 {
    public static void main(String[] args) {

        String str1 = "ja" + "va"; // created java in string pool
        String str2 = "java"; // created java in string pool

        System.out.println(str1 == str2); // gives true as both are pointing to same obj 
        
        String s1 = "ja";  // created in string pool
        String s2 = s1 + "va"; // created java in heap memory and va in string pool 
        String s3 = "java"; // created in string pool

        System.out.println(str1 == s2); // one java is in string pool and other is in heap memory so its false
        System.out.println(s2 == s3); // same here one java is in string pool and other is in heap memory so its false

        String str3 = "Divyansh";  // String pool
        String str4 = str3; // String pool as no operations are performed so it goes to string pool in compile time
        System.out.println(str3 == str4); // true

        String a = "Hello";
        a = "World";

        String b = new String("Singh"); // Singh is created in both heap  memory and String pool but b is only pointing to the heap one
        String c = "Singh"; // it will point to the singh inside String pool created while obj creation as literals name is used it automatically created in String pool.

        System.out.println(b == c);// false bcz both have different reference address
    }
}

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String s1 = new String("Divyansh");
        String s2 = new String("Divyansh");
        String s3 = new String("LUCKNOW");
        String s4 = new String("lucknow");
        String s5 = new String("Transport");
        String s6 = new String("Transgender");
        String s7 = new String("         Heloo        ");
        



        // length/emptiness
        System.out.println(s1.length());
        System.out.println(s1.isEmpty()); // String s1 = new String("    "); --> false
        System.out.println(s1.isBlank()); // String s1 = new String("    "); --> true
        
        // Character access

        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
        }
        System.out.println();
        System.out.println(s1.toCharArray());
        char[] arr = s1.toCharArray();
        System.out.println(arr);

        // Comparision
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
        System.out.println(s3.equalsIgnoreCase(s4)); // Ignore cases of literals

        // Lexicographical Comparision --> Dictionay
        System.out.println(s5.compareTo(s6)); // 0 for equal

        // Searching
        System.out.println(s1.contains("ansh"));
        System.out.println(s1.indexOf('y')); 
        System.out.println(s6.lastIndexOf('e'));
        System.out.println(s1.startsWith("Di"));
        System.out.println(s1.endsWith("shyoo"));

        // Extraction / Transformation
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(0,5)); 
        System.out.println(s4.toUpperCase());
        System.out.println(s3.toLowerCase());
        System.out.println(s7.trim());
        System.out.println(s7.strip()); // unicode friendly
        System.out.println(s1.repeat(2));
        System.out.println(s1.replace('D', 'S'));
        System.out.println(s6.replaceAll("e", "z"));

        // split
        String s8 = "Divyansh, Shagun, Gaurav, Abhay";
        String[] str = s8.split(",");

        for(String s : str) {
            System.out.println(s);
        }
        System.out.println(String.join("-", "a", "b", "c"));

        //Conversion
        String s9 = new String(String.valueOf(10));
        System.out.println(s9);

        byte[] str1 = s1.getBytes();
        System.out.println(Arrays.toString(str1));

        // Advance --> intern and format

        String s10 = new String("World");
        String s11 = s10.intern(); //forced to point String pool's "Wolrd"

        System.out.println(s10 == s11);

        //format
        String name = "Divyansh Singh";
        int age = 21;
        System.out.println(String.format("Hello %s, your age is %s.", name, age));
    }
}

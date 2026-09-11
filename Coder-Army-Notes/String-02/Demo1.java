
public class Demo1 {
    public static void main(String[] args) {

        char[] arr = {'D', 'i', 'v', 'y', 'a', 'n', 's', 'h', ' ', 'S', 'i', 'n', 'g', 'h'};
        String s1 = new String(arr); // Passing an char array
        System.out.println(s1);
        // Passing subset of an array
        String s2 = new String(arr, 0, 8);
        System.out.println(s2);

        byte[] ascii = {97, 105, 65, 77, 84};
        String s3 = new String(ascii);
        System.out.println(s3);

        String s4 = new String(ascii, 0, 2);
        System.out.println(s4);

        // StringBuilder / StringBuffer
        StringBuilder sb = new StringBuilder("Talk is Cheap, Show me the code.");
        StringBuilder sbf = new StringBuilder("Build, Don't Talk.");
        System.out.println(sb);
        System.out.println(sbf);
    } 
}

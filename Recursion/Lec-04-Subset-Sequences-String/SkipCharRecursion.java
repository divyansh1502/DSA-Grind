
public class SkipCharRecursion {
    public static void main(String[] args) {
        skip("", "aasaaeaaaaaaaaxayyy");
    }
    static void skip(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = 'a';
        if(up.charAt(0) == ch) {
            skip(p, up.substring(1));
        } else {
            skip(p + up.charAt(0), up.substring(1));
        }
    }
}

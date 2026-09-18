
public class SkipString {
    public static void main(String[] args) {
        System.out.println(skipString("ajdjapplenbzxcx"));
    }
    static String skipString(String str) {
        if(str.isEmpty()) {
            return "";
        }
        if(str.startsWith("apple")) {
            return skipString(str.substring(5));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }
}

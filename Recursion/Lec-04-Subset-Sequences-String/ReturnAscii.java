
import java.util.ArrayList;

public class ReturnAscii {
    public static void main(String[] args) {
        System.out.println(returnAscii("", "abc"));
    }
    static ArrayList<String> returnAscii(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> character = returnAscii(p + ch, up.substring(1));
        ArrayList<String> number = returnAscii(p + (ch + 0), up.substring(1));
        ArrayList<String> ignore = returnAscii(p, up.substring(1));

        character.addAll(ignore);
        character.addAll(number);

        return character;
    }
}

import java.util.ArrayList;


public class ReturnArrayListSubset {
    public static void main(String[] args) {
        ArrayList<String> str = subset("", "abcd");
        System.out.println(str);
    }
    static ArrayList<String> subset(String p, String up) {
        if(up.isEmpty()) {
          ArrayList<String> list = new ArrayList<>();
          if(p == "") {
            list.add("\"\"");
          } else {
            list.add(p);
          }
          return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subset(p + ch, up.substring(1));
        ArrayList<String> right = subset(p, up.substring(1));

        left.addAll(right);

        return left;
    }
}

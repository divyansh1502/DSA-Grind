
public class RemoveChar {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abbaccd");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a') {
                continue;
            } else {
                s.append(str.charAt(i));
            }
        }
        System.out.println(s);
    }
}

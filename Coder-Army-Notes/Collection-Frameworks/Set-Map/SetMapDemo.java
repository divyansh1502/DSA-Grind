import java.util.*;

public class SetMapDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Divyansh");
        set.add("Shagun");
        set.add("Aarvik");

        System.out.println(set.contains("Aarvik"));
        System.out.println(set);

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Abhay");
        map.put(102, "Aditya");
        map.put(103, "Anushika");

        System.out.println(map.containsKey(102));
        System.out.println(map.get(103));
    }
}

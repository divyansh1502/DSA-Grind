import java.util.*;

public class HashMapLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map1 = new HashMap<>(100);
        Map<Integer, String> map2 = new HashMap<>(100, 0.7f);
        Map<Integer, String> map3 = new HashMap<>(Map.of(10, "Rice", 20, "Sugar"));
        Map<Integer, String> map4 = new HashMap<>(map3);
    }
}

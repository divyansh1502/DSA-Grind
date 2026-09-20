import java.util.*;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(100, "Raman");
        map.put(101, "Aditya");
        map.put(102, "Harsh");
        map.put(103, "Divyansh");
        map.put(104, "Pia");

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());

        System.out.println(map.headMap(102));
        System.out.println(map.tailMap(102));

        System.out.println(map.headMap(102, true));
        System.out.println(map.tailMap(102, false));

        System.out.println(map.subMap(101, 103));
        System.out.println(map.subMap(101, false, 103, true));

        // Navigable interface methods()
        System.out.println(map.lowerKey(102));
        System.out.println(map.lowerEntry(102));

        System.out.println(map.higherKey(102));
        System.out.println(map.higherEntry(102));

        System.out.println(map.floorKey(102));
        System.out.println(map.floorEntry(107));

        System.out.println(map.ceilingKey(104));
        System.out.println(map.ceilingEntry(104));

        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());

        System.out.println(map);
        System.out.println(map.descendingKeySet());
        System.out.println(map.descendingMap());
    }
}

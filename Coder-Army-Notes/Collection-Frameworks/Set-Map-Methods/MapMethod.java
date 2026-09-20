import java.util.*;

public class MapMethod {
    public static void main(String[] args) {

        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(101, "Divyansh");
        map.put(102, "Rahul");
        map.put(103, "Shagun");

        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey(102));
        System.out.println(map.containsValue("Divyansh"));
        System.out.println(map.get(103));
        System.out.println(map.get(104));
        System.out.println(map.put(104, "Agrima"));  // null for first time
        System.out.println(map.get(104));
        System.out.println(map.put(102, "Khushi")); //Updating the existing value but prints the older value
        System.out.println(map.get(102)); // printing new value 
        map.remove(102);
        System.out.println(map);
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(110, "Radha");
        map2.put(111, "Wishy");
        map2.put(112, "Vijay");

        map.putAll(map2);
        System.out.println(map);
        // map.clear();

        Set<Integer> set = map.keySet();
        System.out.println(set);
        Collection<String> names = map.values();
        System.out.println(names);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println(entries);

        System.out.println(map.getOrDefault(105, "Not exist"));

        map.putIfAbsent(106, "Raja");
        System.out.println(map);
        
        map.remove(101, "Mansi"); // does not remove as 101 is not Mansi

        map.replace(102, "Sonu"); //if 102 exist then it will replace while put() will crete new entry if 102 did not exist and if exist it will uodate the value
        map.replace(102, "Sonu", "Rajan"); // double check before replacing key and value must the same for replacement

        Set<Map.Entry<Integer, String>> entries2 = map.entrySet();
        for (Map.Entry<Integer,String> entry : entries2) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " , " + value);

            Map<Integer, String> map3 = Map.of(201, "Ramu", 202, "Tanu", 203, "Dharmu"); // immutable
            // map3.put(204, "Talwinderrrrrrrr"); --> UnsupportedOperationException 
        }
    }
}
//put() replace existing value 
//putIfAbsent() doesnot replace existing value
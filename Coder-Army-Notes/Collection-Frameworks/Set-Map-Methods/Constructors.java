
import java.util.*;


public class Constructors {
    public static void main(String[] args) {
        // Constructor for HashSet and LinkedHashSet

        Set<Integer> set1 = new LinkedHashSet<>();

        // Initial Capacity
        Set<Integer> set2 = new LinkedHashSet<>(100);

        // Initial Capacity, Load factor
        Set<Integer> set3 = new LinkedHashSet<>(100, 0.85f);

        //Using another Collection
        Set<Integer> set4 = new LinkedHashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

        // List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 55)); --> not related to this folder
    }
}

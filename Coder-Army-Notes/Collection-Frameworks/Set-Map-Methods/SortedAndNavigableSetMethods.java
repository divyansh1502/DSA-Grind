
import java.util.Iterator;
import java.util.TreeSet;


public class SortedAndNavigableSetMethods {
    public static void main(String[] args) {
        // Set<Integer> set = new TreeSet<>(); --> we cannot access the method as all the methods below are defined in Set's child interface which are
        //SortedSet and NavigableSet
        // SortedSet<Integer> set = new TreeSet<>(); 
        // NavigableSet<Integer> set = new TreeSet<>(); 
        TreeSet<Integer> set = new TreeSet<>(); 
        set.add(50);
        set.add(70);
        set.add(60);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(90);

        //Below all methods are of SortedSet(interface)
        //SortedSet interface --> O(log N)
        System.out.println("Methods of Sorted Set");

        System.out.println(set.first()); //Smallest Number
        System.out.println(set.last()); // Greatest Number
        System.out.println(set.headSet(60)); // give all elements stricly less than 60
        System.out.println(set.tailSet(60)); // give all elements greater or equal to 60
        System.out.println(set.subSet(30, 70)); // from is inclusive and to is exclusive

        //Below all methods are of NavigableSet(interface)
        System.out.println();
        System.out.println("Methods of Navigable Set");

        System.out.println(set.lower(60)); // greatest number smaller than 60
        System.out.println(set.floor(60)); // greatest number smaller or equal to 60 
        System.out.println(set.higher(60)); // smallest number greater than
        System.out.println(set.ceiling(60)); // smallest number greater or equal to 60
        System.out.println(set.pollFirst()); // remove the lowest number from the set and print it
        System.out.println(set.pollLast()); // remove the highest number from the set and print it
        System.out.println(set);
        System.out.println(set.descendingSet()); // arrange all elemnts in decreasing order

        //Iterator
        Iterator<Integer> it = set.descendingIterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set.headSet(50, true));
        System.out.println(set.tailSet(50, false));
        System.out.println(set.subSet(30, true, 70, false));
    }
}

/*
Collection
    │
    └── Set (interface)
         │
         ├── HashSet (class)
         │
         ├── LinkedHashSet (class)
         │
         └── SortedSet (interface)
              │
              └── NavigableSet (interface)
                   │
                   └── TreeSet (class)


                  Set
              /    |     \
             /     |      \
       HashSet  LinkedHashSet  SortedSet
                                │
                                ↓
                           NavigableSet
                                │
                                ↓
                             TreeSet
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterfaceMethod {
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();

        // add()
        c.add(10);
        c.add(20);
        c.add(30);

        //size()
        System.out.println(c.size());

        //isEmpty()

        System.out.println(c.isEmpty());

        //contains()
        System.out.println(c.contains(10));

        // iterate() --> Iterator

        // Object[] toArray();

        Object[] obj = c.toArray();
        for (Object object : obj) {
            System.out.print(object + " ");
        }

        // T[] toArray(T[] a)
        // Integer[] arr2 = new Integer[0];
        // Integer[] arr = c.toArray(arr2);
        Integer[] arr = c.toArray(new Integer[0]);
        System.out.println();
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

        // boolean remove(object obj)

        System.out.println(c.remove(20));
        for (Integer integer : c) {
            System.out.print(integer + " ");
        }
        
        // boolean addAll(Collection<? extends E> c);
        // c.addAll(List.of(5, 6, 7));

        // boolean containsAll (Collection<?> c);
        System.out.println(c.containsAll(List.of(10, 30)));

        // boolean removeAll(Collection<?> c)

        // boolean retainAll(Collection<?> c); --> Intersection

        c.removeAll(List.of(10));
        c.retainAll(List.of(30));
        c.clear();
        System.out.println(c);

        //equals() hashCode()

    } 
}
// add, remove, addAll, removeAll, contains, containsAll, toArray, iterator, isEmpty, size, 
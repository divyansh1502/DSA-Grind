
import java.util.*;


public class ListIntefaceMethod {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(1));

        list.set(1, 20);
        list.addAll(0, List.of(12, 46, 48));
        System.out.println(list);

        list.remove(2);

        System.out.println(list);

        System.out.println(list.indexOf(1));

        ListIterator<Integer> it = list.listIterator(1);

        while(it.hasPrevious()) {
            System.out.print(it.previous());
        }
        System.out.println();
        List l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(l);
        // l.add(10); --> Unmodifiable
        List<Integer> l2 = List.copyOf(l);
        System.out.print(l2);
        // l.add(10); -->Copy is still not modifiable
    }
}

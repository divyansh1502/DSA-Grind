import java.util.*;

public class Iterator1 {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Collection<Integer> c = new HashSet<>();
        // Collection<Integer> c = new ArrayDeque<>();
        // Collection<Integer> c = new TreeSet<>();

        c.add(12);
        c.add(27);
        c.add(30);
        c.add(45);
        c.add(59);

        Iterator<Integer> hs = c.iterator();
        while(hs.hasNext()) {
            System.out.println(hs.next());
        }
    }
}

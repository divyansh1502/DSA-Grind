import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);

        Iterator<Integer> hs = c.iterator();
        while(hs.hasNext()) {
            System.out.println(hs.next());
        }
    }
}

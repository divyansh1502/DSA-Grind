import java.util.*;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator<Integer> it = list.iterator();
// ConcurrentModificationException --> Fail Fast
        while (it.hasNext()) {
            int value = it.next();

            if(value == 3) {
                list.remove(value);
            }

            System.out.println(value);
        }
    }    
}

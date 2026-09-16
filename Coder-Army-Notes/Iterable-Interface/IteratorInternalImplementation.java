import java.util.Iterator;

import javax.naming.Name;

public class IteratorInternalImplementation {
    public static void main(String[] args) {
        String[] names = {"Divyansh", "Anushika", "Sudhir", "Shagun", "Shekhar"};
        NameContainer container = new NameContainer(names);

        // Iterator<String> it = container.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        //Enhanced for loop
        for (String name : container) {
            System.out.println(name);
        }
    }
}
class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = names.length;
    }
    @Override
    public Iterator<String> iterator() {
        return new NameContainerIterator();
    }
    private class NameContainerIterator implements Iterator<String> {
        private int pos = 0;
        @Override
        public boolean hasNext() {
            return pos < size;
        }
        @Override
        public String next() {
            return names[pos++];
        }
    }
}

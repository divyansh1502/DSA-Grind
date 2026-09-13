
public class Demo4 {
    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Divyansh Singh", 21);
        
        System.out.println(p.first + ": " + p.second);
    }
}
// Generic class
class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

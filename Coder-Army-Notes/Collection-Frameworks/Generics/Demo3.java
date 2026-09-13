
public class Demo3 {
    public static void main(String[] args) {
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Hello");
        Box<Boolean> b3 = new Box<>(false);

        System.out.println(b1.getValue() + 5);
        System.out.println(b2.getValue() + 5);
        System.out.println(b3.getValue());

        // String s = (String)b1.getValue(); --> Cannot cast Integer to String "ClassCastException" plus point is that we get this exception during compile while in Demo2.java file we get same exception during runtime that's one of the reason for using generics  
    }
}
class Box<T> {
    private T value;

    Box(T value) {
        this.value = value;
    }

    T getValue() {
        return this.value;
    }
    void setValue(T value) {
        this.value = value;
    }
}


public class Demo2 {
    public static void main(String[] args) {
        Box b1 = new Box(10);
        Box b2 = new Box("Hello");
        Box b3 = new Box(true);

        // Downcasting
        Integer a = (Integer)b1.getValue();
        String b = (String)b2.getValue();
        Boolean c = (Boolean)b3.getValue();

        System.out.println(a + 5);
        System.out.println(b + 5);
        System.out.println(c);
    }
}
class Box {
    private Object value;

    Box(Object value) {
        this.value = value;
    }
    Object getValue() {
        return this.value;
    }
    void setValue(Object value) {
        this.value = value;
    }
}

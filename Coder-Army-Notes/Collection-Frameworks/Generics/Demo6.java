
public class Demo6 {
 public static void main(String[] args) {
    Box<Integer> b1 = new Box<>();
    b1.value = 10;
    b1.printValue();
 }   
}
// Generic --> T can be anything
// Bounds in Generic
// Upper Bound --> T is atleast number or its subtype
class Box<T extends Number> {
    T value;

    public void printValue() {
        System.out.println(value.doubleValue());
    }
}

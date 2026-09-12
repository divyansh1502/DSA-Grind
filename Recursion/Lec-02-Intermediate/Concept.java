
public class Concept {
    public static void main(String[] args) {
        printNumber(5);
    }
    static void printNumber(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        // printNumber(n--); its goes into infinite loop as it firstly paases the value than decrease so it will never decrease --> StackOverflowError
        printNumber(--n);
    }
}

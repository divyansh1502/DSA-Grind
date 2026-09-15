
public class InverseRightAngleTriangle {
    public static void main(String[] args) {
        printTriangle(5, 0);
    }   
    static void printTriangle(int r, int c) {
        if(r == 0) {
            return;
        }
        if(r > c) {
            System.out.print("* ");
            printTriangle(r, c + 1);
        } else {
            System.out.println();
            printTriangle(r - 1, 0);
        }
    } 
}

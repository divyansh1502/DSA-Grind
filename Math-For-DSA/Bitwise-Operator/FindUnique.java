
public class FindUnique {
    public static void main(String[] args) {
        int [] arr = {14, 21, 36, 14, 52, 36, 21};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr) {
        int unique = 0;  

        for(int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
// Testing new IDE
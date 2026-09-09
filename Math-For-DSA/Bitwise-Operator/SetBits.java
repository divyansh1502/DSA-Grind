public class SetBits {
    public static void main(String[] args) {
        int n = 48;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
        
    }
    static int setBits(int n) {
        int count = 0;

        while(n > 0) {
            count++;
            n = n & (n - 1);
        }
        return count;
    }
}

// Main Logic:
// n & (n - 1) removes the rightmost set bit (1) from n.
// Every time a set bit is removed, we increment count.
// The loop continues until all set bits are removed (n becomes 0).
// Therefore, count gives the total number of set bits (1s) in n.
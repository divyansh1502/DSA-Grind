public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {15, 22, 14, 36, 96, 57, 5, 78, 61};
        System.out.println(search(arr, 0,61));
    }
    public static int search(int[] arr, int index, int target) {
        if((arr[index] == target)) {
            return index;
        }
        if(index == arr.length) {
            return -1;
        }
        return search(arr, index + 1, target);
    }
}

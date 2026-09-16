import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {13, 5, 12, 85, 54, 1, 4, 9};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }   
    static void bubbleSort(int[] arr, int r, int c) {
        if(r == 0) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[c + 1]) {
                swap(arr, c, c + 1);
            }
            bubbleSort(arr, r, c + 1);

        } else {
            bubbleSort(arr, r - 1, 0);
        }
        
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}

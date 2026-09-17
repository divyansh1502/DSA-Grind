
import java.util.Arrays;

public class MergeSortInPlace {

    public static void main(String[] args) {

        int[] arr = {5, 12, 65, 2, 47, 21, 99, 4};

        mergeSort(arr, 0, arr.length);

        System.out.println(Arrays.toString(arr));
    }

    // Divides the array into smaller sorted parts
    public static void mergeSort(int[] arr, int s, int e) {

        // 0 or 1 element is already sorted
        if (e - s <= 1) {
            return;
        }

        int mid = (s + e) / 2;

        // Sort left and right halves
        mergeSort(arr, s, mid);
        mergeSort(arr, mid, e);

        // Merge both sorted halves
        merge(arr, s, mid, e);
    }

    // Merges two sorted halves into one sorted array
    public static void merge(int[] arr, int s, int m, int e) {

        int i = s;  // Pointer for left half
        int j = m;  // Pointer for right half
        int k = 0;  // Pointer for temporary array

        int[] mix = new int[e - s];

        // Compare and store smaller elements
        while (i < m && j < e) {

            if (arr[i] < arr[j]) {
                mix[k] = arr[i++];
            } else {
                mix[k] = arr[j++];
            }

            k++;
        }

        // Add remaining elements from left half
        while (i < m) {
            mix[k++] = arr[i++];
        }

        // Add remaining elements from right half
        while (j < e) {
            mix[k++] = arr[j++];
        }

        // Copy merged elements back into original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}


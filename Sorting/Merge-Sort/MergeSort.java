import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 12, 65, 2, 47, 21, 99, 4};

        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr) {

        // Base case: single element is already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Divide the array into two halves
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        // Merge both sorted halves
        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {

        int i = 0; // Pointer for first array
        int j = 0; // Pointer for second array
        int k = 0; // Pointer for merged array

        int[] mix = new int[first.length + second.length];

        // Compare elements and place the smaller one
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // Add remaining elements from first array
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // Add remaining elements from second array
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }
}


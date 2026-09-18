import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSrot(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSrot(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int mid = s + (e - s) / 2;
        int pivot = mid;
        while(s <= e) {
            while(nums[s] < nums[pivot]) {
                s++;
            }
            while(nums[e] > nums[pivot]) {
                e--;
            }
            // also a reason if it already sorted it will not swap
            if(s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
        quickSrot(nums, low, e);
        quickSrot(nums, s, high);

    }
}

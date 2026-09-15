public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rotatedBS(arr, 8, 0, arr.length - 1));
    }
    static int rotatedBS(int[] arr, int target, int s, int e) {
        if(s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] ==  target) {
            return m;
        }
        if(arr[m] > arr[s]) {
            if(target > arr[s] && target <= arr[m]) {
                return rotatedBS(arr, target, s, m-1);
            } else {
                return rotatedBS(arr, target, m + 1, e);
            }
        }
        if(target >= arr[m + 1] && target <= arr[e]) {
            return rotatedBS(arr, target, m + 1, e);
        } else {
            return rotatedBS(arr, target, s, m-1);
        }
    }
}

import java.util.ArrayList;

public class NewArrayList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 4, 5, 6, 6, 8, 9};
        System.out.println(returnIndex(arr, 4, 0));
    }
    public static ArrayList<Integer> returnIndex(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = returnIndex(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}

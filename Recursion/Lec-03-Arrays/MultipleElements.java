import java.util.ArrayList;

public class MultipleElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6, 8, 11, 25, 34, 36};
        multipleElements(arr, 4, 0);
        System.out.println(list);
        System.out.println(returnList(arr, 4, 0, list));
    }
    static ArrayList<Integer> list = new ArrayList<>();
    public static int multipleElements(int[] arr, int target, int index) {
        if(index == arr.length) {
            return -1;
        } 
        if(arr[index] == target) {
            list.add(index);
        }
        return multipleElements(arr, target,  index + 1);
    }
    public static ArrayList returnList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        } 
        if(arr[index] == target) {
            list.add(index);
        }
        return returnList(arr, target,  index + 1, list);
    }
}
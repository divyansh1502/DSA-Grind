
import java.util.Arrays;

public class QuickSortDryRun {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        // Initial array:
        // Index:   0   1   2   3   4
        // Array:  [5,  4,  3,  2,  1]

        quickSrot(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
        // Output:
        // [1, 2, 3, 4, 5]
    }

    static void quickSrot(int[] nums, int low, int high) {

        // =========================================================
        // CALL 1
        // quickSrot(nums, 0, 4)
        //
        // Array = [5, 4, 3, 2, 1]
        // low = 0
        // high = 4
        // =========================================================

        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;

        // s = 0
        // e = 4

        int mid = s + (e - s) / 2;

        // mid = 0 + (4 - 0) / 2
        // mid = 2

        int pivot = mid;

        // pivot = 2
        //
        // IMPORTANT:
        // pivot stores INDEX 2, not the value 3.
        //
        // Index:   0   1   2   3   4
        // Array:  [5,  4,  3,  2,  1]
        //                  ↑
        //                pivot
        //
        // nums[pivot] = nums[2] = 3


        while (s <= e) {

            // =====================================================
            // FIRST ITERATION
            // =====================================================

            // s = 0
            // e = 4
            // pivot = 2
            //
            // Check:
            //
            // nums[s] < nums[pivot]
            // nums[0] < nums[2]
            // 5 < 3 → false
            //
            // Therefore s does not move.
            // s = 0


            while (nums[s] < nums[pivot]) {
                s++;
            }


            // -----------------------------------------------------
            // SECOND INNER WHILE
            // -----------------------------------------------------

            // Check:
            //
            // nums[e] > nums[pivot]
            // nums[4] > nums[2]
            // 1 > 3 → false
            //
            // Therefore e does not move.
            // e = 4

            while (nums[e] > nums[pivot]) {
                e--;
            }


            // -----------------------------------------------------
            // SWAP
            // -----------------------------------------------------

            // s <= e
            // 0 <= 4 → true
            //
            // Swap nums[0] and nums[4]
            //
            // 5 ↔ 1
            //
            // Before:
            // [5, 4, 3, 2, 1]
            //
            // After:
            // [1, 4, 3, 2, 5]

            if (s <= e) {

                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                // Move both pointers:
                s++;
                e--;

                // s = 1
                // e = 3
            }


            // =====================================================
            // SECOND ITERATION
            // =====================================================

            // Current array:
            // [1, 4, 3, 2, 5]
            //
            // s = 1
            // e = 3
            // pivot = 2
            //
            // nums[pivot] = nums[2] = 3


            // FIRST INNER WHILE
            //
            // nums[s] < nums[pivot]
            // nums[1] < nums[2]
            // 4 < 3 → false
            //
            // s remains 1

            while (nums[s] < nums[pivot]) {
                s++;
            }


            // SECOND INNER WHILE
            //
            // nums[e] > nums[pivot]
            // nums[3] > nums[2]
            // 2 > 3 → false
            //
            // e remains 3

            while (nums[e] > nums[pivot]) {
                e--;
            }


            // SWAP
            //
            // s <= e
            // 1 <= 3 → true
            //
            // Swap nums[1] and nums[3]
            //
            // 4 ↔ 2
            //
            // Before:
            // [1, 4, 3, 2, 5]
            //
            // After:
            // [1, 2, 3, 4, 5]

            if (s <= e) {

                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                s++;
                e--;

                // s = 2
                // e = 2
            }


            // =====================================================
            // THIRD ITERATION
            // =====================================================

            // Current:
            // [1, 2, 3, 4, 5]
            //
            // s = 2
            // e = 2
            // pivot = 2
            //
            // nums[pivot] = nums[2] = 3


            // FIRST INNER WHILE
            //
            // nums[s] < nums[pivot]
            //
            // nums[2] < nums[2]
            // 3 < 3 → false
            //
            // s = 2

            while (nums[s] < nums[pivot]) {
                s++;
            }


            // SECOND INNER WHILE
            //
            // nums[e] > nums[pivot]
            //
            // nums[2] > nums[2]
            // 3 > 3 → false
            //
            // e = 2

            while (nums[e] > nums[pivot]) {
                e--;
            }


            // SWAP
            //
            // s <= e
            // 2 <= 2 → true
            //
            // nums[2] ↔ nums[2]
            //
            // 3 ↔ 3
            //
            // Array remains:
            // [1, 2, 3, 4, 5]

            if (s <= e) {

                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;

                s++;
                e--;

                // s = 3
                // e = 1
            }
        }


        // =========================================================
        // PARTITIONING FINISHED
        // =========================================================
        //
        // Current array:
        // [1, 2, 3, 4, 5]
        //
        // s = 3
        // e = 1
        //
        // Since:
        //
        // s <= e
        // 3 <= 1 → false
        //
        // Partition is complete.


        // =========================================================
        // LEFT RECURSIVE CALL
        // =========================================================
        //
        // quickSrot(nums, low, e)
        //
        // quickSrot(nums, 0, 1)
        //
        // Current:
        // [1, 2, 3, 4, 5]
        //
        // low = 0
        // high = 1

        quickSrot(nums, low, e);


        // =========================================================
        // RIGHT RECURSIVE CALL
        // =========================================================
        //
        // quickSrot(nums, s, high)
        //
        // quickSrot(nums, 3, 4)

        quickSrot(nums, s, high);
    }
}


/*
====================================================================
RECURSION TREE
====================================================================

quickSrot(0, 4)
|
+--- partition
|       |
|       +--- [1, 2, 3, 4, 5]
|
+--- quickSrot(0, 1)
|    |
|    +--- partition
|    |
|    +--- quickSrot(0, -1) → return
|    |
|    +--- quickSrot(1, 1)  → return
|
+--- quickSrot(3, 4)
     |
     +--- partition
     |
     +--- quickSrot(3, 2) → return
     |
     +--- quickSrot(4, 4) → return


====================================================================
IMPORTANT VARIABLES
====================================================================

low / high
    ↓
Define the current portion of the array.

s / e
    ↓
Two pointers moving toward each other.

mid
    ↓
Middle INDEX of the current portion.

pivot
    ↓
Stores the pivot INDEX in this code.

nums[pivot]
    ↓
Gives the CURRENT VALUE at that pivot index.


====================================================================
VERY IMPORTANT
====================================================================

int pivot = mid;

means:

pivot = INDEX

NOT:

pivot = VALUE


For example:

int mid = 2;
int pivot = mid;

pivot = 2

nums[pivot] = nums[2] = 3


If you wrote:

int pivot = nums[mid];

then:

pivot = 3

That would store the actual pivot VALUE.


====================================================================
FINAL OUTPUT
====================================================================

[1, 2, 3, 4, 5]
====================================================================
*/


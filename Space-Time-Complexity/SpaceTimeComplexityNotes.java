
public class SpaceTimeComplexityNotes {
    public static void main(String[] args) {
        /*
===========================================================
        TIME AND SPACE COMPLEXITY - DSA NOTES
===========================================================

1. WHAT IS TIME COMPLEXITY?
---------------------------

Time Complexity tells us how the running time of an algorithm
grows as the input size (n) increases.

It does NOT mean the exact time in seconds.

Example:

int x = arr[0];

This takes approximately the same amount of work whether
the array has 10 elements or 10 million elements.

Therefore:

Time Complexity = O(1)


2. WHAT IS SPACE COMPLEXITY?
----------------------------

Space Complexity tells us how much EXTRA memory an algorithm
needs as the input size (n) increases.

IMPORTANT:
We usually talk about AUXILIARY SPACE = extra space used by
the algorithm, excluding the input itself.

Example:

int sum = 0;

Only one extra variable is created.

Space Complexity = O(1)


===========================================================
3. BIG-O NOTATION
===========================================================

Big-O describes the growth rate of an algorithm.

Common complexities:

O(1)        Constant
O(log n)    Logarithmic
O(n)        Linear
O(n log n)  Linearithmic
O(n²)       Quadratic
O(n³)       Cubic
O(2ⁿ)       Exponential
O(n!)       Factorial


From generally faster to slower:

O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)


===========================================================
4. O(1) - CONSTANT
===========================================================

The number of operations does not depend on n.

Example:

int x = arr[0];

Only one operation/access is performed.

Time:  O(1)
Space: O(1)


Another example:

int sum = a + b;


===========================================================
5. O(n) - LINEAR
===========================================================

If we go through n elements once, complexity is O(n).

Example:

for(int i = 0; i < n; i++) {
    System.out.println(arr[i]);
}

If n = 10      -> ~10 operations
If n = 100     -> ~100 operations
If n = 1000    -> ~1000 operations

Therefore:

Time: O(n)
Space: O(1)


IMPORTANT:
The loop does not automatically mean O(n).

It depends on how many times the loop executes.


===========================================================
6. O(n²) - QUADRATIC
===========================================================

Two nested loops that each run n times:

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {

    }
}

Outer loop  -> n
Inner loop  -> n

Total:

n * n = n²

Time: O(n²)
Space: O(1)


Example:
If n = 10   -> 100 operations
If n = 100  -> 10,000 operations


===========================================================
7. O(n³) - CUBIC
===========================================================

Three nested loops:

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {

        for(int k = 0; k < n; k++) {

        }
    }
}

Total:

n * n * n = n³

Time: O(n³)


===========================================================
8. O(log n) - LOGARITHMIC
===========================================================

When the input is repeatedly divided by some factor,
complexity is usually O(log n).

Example: Binary Search

int start = 0;
int end = n - 1;

while(start <= end) {

    int mid = start + (end - start) / 2;

    // eliminate half of the search space
}

Every iteration removes approximately HALF of the elements.

n
n/2
n/4
n/8
n/16
...

Therefore:

Time: O(log n)


IMPORTANT:

If we divide the problem by 2 each time -> O(log n)

If we divide by 3 each time -> O(log n)

The base of logarithm is usually ignored in Big-O.


===========================================================
9. O(n log n)
===========================================================

Commonly appears in efficient sorting algorithms.

Example:

Merge Sort

The array is divided into halves:

n -> n/2 -> n/4 -> ...

Number of levels = log n

At every level, we process all n elements.

Therefore:

n * log n

Time: O(n log n)


Examples:

Merge Sort      -> O(n log n)
Heap Sort       -> O(n log n)
Quick Sort      -> O(n log n) average


===========================================================
10. O(2ⁿ) - EXPONENTIAL
===========================================================

Usually occurs when each problem creates TWO recursive
subproblems.

Example:

int fun(int n) {

    if(n <= 1)
        return n;

    return fun(n - 1) + fun(n - 2);
}

Each call creates more calls.

Approximate complexity:

Time: O(2ⁿ)

This becomes very slow as n increases.


===========================================================
11. O(n!) - FACTORIAL
===========================================================

Very expensive complexity.

Usually appears in problems where we generate all
permutations.

For n elements:

Number of permutations = n!

Example:

3! = 6
5! = 120
10! = 3,628,800

Therefore permutation generation can have:

Time: O(n!)


===========================================================
12. HOW TO CALCULATE TIME COMPLEXITY
===========================================================

RULE 1:
Ignore constants.

Example:

for(int i = 0; i < n; i++) {
}

O(n)

Even if there are 2 operations:

2n -> O(n)


RULE 2:
Keep the highest-order term.

Example:

n² + n + 10

We ignore smaller terms:

O(n²)


Example:

n³ + n² + n

Answer:

O(n³)


RULE 3:
Sequential loops are ADDED.

Example:

for(int i = 0; i < n; i++) {
}

for(int j = 0; j < n; j++) {
}

Total:

O(n) + O(n)
= O(2n)
= O(n)


RULE 4:
Nested loops are MULTIPLIED.

Example:

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {

    }
}

O(n) * O(n)
= O(n²)


===========================================================
13. DIFFERENT LOOP PATTERNS
===========================================================

Pattern 1:

for(int i = 0; i < n; i++)

Time: O(n)


Pattern 2:

for(int i = 0; i < n; i += 2)

Still:

O(n)

Because:

n/2 -> O(n)

Constants are ignored.


Pattern 3:

for(int i = 1; i < n; i *= 2)

Values:

1
2
4
8
16
32
...

Time: O(log n)


Pattern 4:

for(int i = n; i > 0; i /= 2)

Values:

n
n/2
n/4
n/8
...

Time: O(log n)


Pattern 5:

for(int i = 0; i < n; i++) {

    for(int j = 0; j < n; j++) {

    }
}

Time: O(n²)


===========================================================
14. SPACE COMPLEXITY
===========================================================

Example:

int a = 10;
int b = 20;
int c = 30;

Only a fixed number of variables are created.

Space:

O(1)


Example:

int[] arr = new int[n];

Memory increases with n.

Space:

O(n)


Example:

int[][] arr = new int[n][n];

There are n * n elements.

Space:

O(n²)


===========================================================
15. TIME vs SPACE
===========================================================

TIME COMPLEXITY:
How much computation/work is required?

SPACE COMPLEXITY:
How much EXTRA memory is required?


Example:

int sum = 0;

for(int i = 0; i < n; i++) {
    sum += arr[i];
}

Time  = O(n)
Space = O(1)


Because:
We visit n elements,
but only use a few variables.


===========================================================
16. RECURSION AND SPACE
===========================================================

Recursion uses the CALL STACK.

Example:

void fun(int n) {

    if(n == 0)
        return;

    fun(n - 1);
}

There can be n function calls on the stack.

Therefore:

Time  = O(n)
Space = O(n)


IMPORTANT:

Even if you don't create an array,
recursion can use O(n) space because of
the recursive call stack.


===========================================================
17. BEST, AVERAGE AND WORST CASE
===========================================================

Some algorithms have different running times depending
on the input.

Example: Linear Search

Searching for an element:

Best Case:
Element is at index 0.

Time = O(1)


Worst Case:
Element is at the last position or not present.

Time = O(n)


Average Case:
Element is somewhere in between.

Time = O(n)


Therefore linear search:

Best    -> O(1)
Average -> O(n)
Worst   -> O(n)


===========================================================
18. AMORTIZED COMPLEXITY
===========================================================

Some operations are occasionally expensive but usually cheap.

Example:

ArrayList<Integer> list = new ArrayList<>();

list.add(10);

Most add operations are:

O(1) amortized

Sometimes the internal array becomes full and
a larger array is created and elements are copied.

That particular operation can take O(n).

But over many operations, average cost is O(1).

Therefore:

ArrayList.add() -> O(1) amortized


===========================================================
19. TWO POINTER EXAMPLE
===========================================================

Example:

int left = 0;
int right = n - 1;

while(left < right) {

    left++;
    right--;
}

Both pointers together move across the array.

NOT O(n²)

Time = O(n)

Space = O(1)


===========================================================
20. SORTING COMPLEXITIES
===========================================================

Bubble Sort:

Best    -> O(n)     (with optimization)
Average -> O(n²)
Worst   -> O(n²)

Selection Sort:

Best    -> O(n²)
Average -> O(n²)
Worst   -> O(n²)

Insertion Sort:

Best    -> O(n)
Average -> O(n²)
Worst   -> O(n²)

Merge Sort:

Best    -> O(n log n)
Average -> O(n log n)
Worst   -> O(n log n)

Quick Sort:

Best    -> O(n log n)
Average -> O(n log n)
Worst   -> O(n²)


===========================================================
21. IMPORTANT DSA EXAMPLES
===========================================================

Linear Search:

Time  = O(n)
Space = O(1)


Binary Search:

Time  = O(log n)
Space = O(1) for iterative version


Binary Search Recursive:

Time  = O(log n)
Space = O(log n) because of recursion stack


Merge Sort:

Time  = O(n log n)
Space = O(n)


Nested loop:

for(int i = 0; i < n; i++) {
    for(int j = 0; j < n; j++) {
    }
}

Time  = O(n²)
Space = O(1)


===========================================================
22. VERY IMPORTANT: DON'T COUNT EVERY LINE
===========================================================

Example:

int x = 10;                    // O(1)

for(int i = 0; i < n; i++) {   // O(n)
    System.out.println(i);
}

int y = 20;                    // O(1)


Total:

O(1) + O(n) + O(1)

= O(n)


We don't write O(n + 2).

We simplify it to:

O(n)


===========================================================
23. QUICK TRICKS TO IDENTIFY COMPLEXITY
===========================================================

One simple loop:

        O(n)


Two nested loops:

        O(n²)


Three nested loops:

        O(n³)


Input divided by 2 repeatedly:

        O(log n)


Loop + division:

        O(n log n)


Array of size n created:

        Space O(n)


2D array n x n:

        Space O(n²)


Recursive call n times:

        Space O(n)


Two recursive calls per level:

        Often O(2ⁿ)


===========================================================
24. BIG-O DOES NOT MEAN EXACT NUMBER OF OPERATIONS
===========================================================

Suppose:

Algorithm A performs:

5n + 10 operations

Algorithm B performs:

100n + 500 operations

Both are:

O(n)

Big-O focuses on the growth rate as n becomes very large.


===========================================================
25. FINAL CHEAT SHEET
===========================================================

O(1)
    Constant
    Example: arr[5]

O(log n)
    Divide input repeatedly
    Example: Binary Search

O(n)
    Visit every element once
    Example: Linear Search

O(n log n)
    Divide + process all elements
    Example: Merge Sort

O(n²)
    Two nested loops
    Example: Bubble Sort

O(n³)
    Three nested loops

O(2ⁿ)
    Exponential recursion
    Example: naive Fibonacci

O(n!)
    Permutations


===========================================================
MOST IMPORTANT RULES TO REMEMBER
===========================================================

1. Sequential operations -> ADD complexities.

2. Nested operations -> MULTIPLY complexities.

3. Ignore constants.

4. Ignore lower-order terms.

5. Repeated division -> usually O(log n).

6. A loop running n/2 times is still O(n).

7. Recursion uses stack space.

8. Creating an array of n elements -> O(n) space.

9. Big-O describes growth, not exact execution time.

10. Always analyze how the algorithm behaves as n grows.

===========================================================
*/
    }
}

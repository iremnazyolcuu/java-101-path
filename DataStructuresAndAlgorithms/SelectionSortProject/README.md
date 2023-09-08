# Selection Sort Project
## [22,27,16,2,18,6] -> Selection Sort
- Write down the steps of the given array according to the sorting type.

    1. [22,27,16,2,18,6]
    2. [2,27,16,22,18,6]
    3. [2,6,16,22,18,27]
    4. [2,6,16,18,22,27]
---

- Write the Big-O notation.

n+(n-1)+(n-2)+(n-3)+(n-4)+1= (n(n+1))/2= n^2 Big-O = n^2

- Time Complexity: After the array is sorted, which case does the number 18 fall into from the following cases? Write it down.
    1. Average case: The number we're looking for is in the middle.
    2. Worst case: The number we're looking for is at the end.
    3. Best case: The number we're looking for is at the beginning of the array.

The number we're looking for is in the middle: **Average case.**

- Write the first 4 steps of the Selection Sort for the array [7,3,5,8,2,9,4,15,6]

    1. [7,3,5,8,2,9,4,15,6]
    2. [2,3,5,8,7,9,4,15,6]
    3. [2,3,4,8,7,9,5,15,6]
    4. [2,3,4,5,7,9,8,15,6]

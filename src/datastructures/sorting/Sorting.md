# Sorting

## 3 Main Design Strategies

1. Divide and Conquer
2. Greedy
3. Dynamic Programming



## Divide and Conquer

* Breaks a problem into subproblems that are similar to the original problem, recursively solves the subproblems, and finally combines the solutions to the subproblems to solve the original problem

Sorting array A:

1. **Divide** array into A<sub>left</sub> and A<sub>right</sub>
2. Recursively sort through A<sub>left</sub> (**Conquer**)
3. Recursively sort through A<sub>right</sub> (**Conquer**)
4. **Combine** together

Example Algorithms:

* Merge Sort
* Quick Sort



### Merge Sort

For array A[low...high] with values 0...n-1

1. **Divide** by finding the position midway between index low and index high. Do this step the same way we found the midpoint in binary search: add low and high, divide by 2, and round down.

   **mid = (low+high)/2**

2. **Conquer** by recursively sorting the subarrays in each of the two subproblems created by the divide step. That is, recursively sort the subarray **A[low...mid]** and recursively sort the subarray **A[mid+1...high]**.

3. **Combine** by merging the two sorted subarrays back into the single sorted subarray **A[low...high]**.

Only carry out merge sort when **low < high**



### Quick Sort

For array A[low...high] with values 0...n-1

1. **Divide** by choosing any element in the subarray A[low...high]. 

   - Call this element the **pivot** (basic practice is to pick the first term). 
   - Rearrange the elements in **A[low...high]** so that all elements in **A[low...high]** that are less than or equal to the pivot are to its left and all elements that are greater than the pivot are to its right. We call this procedure **partitioning**. 
   - At this point, it doesn't matter what order the elements to the left of the pivot are in relation to each other, and the same holds for the elements to the right of the pivot. We just care that each element is somewhere on the correct side of the pivot.

2. **Conquer** by recursively sorting the subarrays **A[low...pivot-1]** (all elements to the left of the pivot, which must be less than or equal to the pivot) and  **A[pivot+1...high]** (all elements to the right of the pivot, which must be greater than the pivot).

3. **Combine** by doing nothing. Once the conquer step recursively sorts, we are done.

   Only carry out quick sort when **low < high**
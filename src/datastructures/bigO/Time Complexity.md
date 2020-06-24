# Time Complexity

| Big O Notation   | Name         | Explanation                                                  | Example                                                   |
| ---------------- | ------------ | ------------------------------------------------------------ | --------------------------------------------------------- |
| O(1)             | Constant     | Constant Time Complexity describes an algorithm that will always execute in the same time (or space) regardless of the size of the input data set. | Accessing a specific index within an array                |
| O(log n)         | Logarithmic  | Logarithmic Time Complexity refers to an algorithm that runs in proportionally to the logarithm of the input size. | Finding an element in an sorted array using binary search |
| O(n)             | Linear       | Linear Time Complexity describes an algorithm or program who’s complexity will grow in direct proportion to the size of the input data. | Find max element in unsorted array                        |
| O(n log n)       | Linearithmic | Linearithmic time complexity it’s slightly slower than a linear algorithm. However, it’s still much better than a quadratic algorithm | Sorting elements in an array with merge sort              |
| O(n<sup>2</sup>)          | Quadratic    | Quadratic Time Complexity represents an algorithm whose performance is directly proportional to the squared size of the input data set. | Sorting an array with bubble sort                         |
| O(n<sup>k</sup>) | Polynomial   | Polynomial Time complexity can be a result of multiple nested loops. | Selection sort on n integers                              |
| O(2<sup>n</sup>) | Exponential  | Exponential Time complexity denotes an algorithm whose growth doubles with each addition to the input data set. | Many recursive algorithms: Towers of Hanoi                |



## Array vs LinkedList 

| Operation              | ArrayList | LinkedList |
| ---------------------- | --------- | ---------- |
| Access i-th entry      | O(1)      | O(n)       |
| Search specified entry | O(n)      | O(n)       |
| Insert at beginning    | O(n)      | O(1)       |
| Delete at beginning    | O(n)      | O(1)       |



## ArrayList vs LinkedList vs DoublyLinked List

| Operation     | ArrayList | LinkedList | DoublyLinkedList |
| ------------- | --------- | ---------- | ---------------- |
| addFirst()    | O(n)      | O(1)       | O(1)             |
| removeFirst() | O(n)      | O(1)       | O(1)             |
| addLast()     | O(1)      | O(1)       | O(1)             |
| removeLast()  | O(1)      | O(n)       | O(1)             |
| remove(i)     | O(n)      | O(n)       | O(n)             |



## ArrayList vs LinkedList  (Stack Implementation)

| Operation | ArrayList | LinkedList |
| --------- | --------- | ---------- |
| push()    | O(n)*     | O(1)       |
| pop()     | O(1)      | O(1)       |
| peek()    | O(1)      | O(1)       |
| isEmpty() | O(1)      | O(1)       |
| size()    | O(1)      | O(1)       |
| clear()   | O(1)      | O(1)       |

\* copy items in the old array to new array when capacity is full



## BST Time Complexity

| Operations | Best Case | Average Case         | Worst Case |
| ---------- | --------- | -------------------- | ---------- |
| Search     | O(1)      | O(h) &#8594;O(log n) | O(n)       |
| Insert     | O(1)      | O(h) &#8594;O(log n) | O(n)       |
| Delete     | O(1)      | O(h) &#8594;O(log n) | O(n)       |



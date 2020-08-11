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



## Queue

| Operation | Time Complexity         |
| --------- | ----------------------- |
| enqueue() | O(1) - Add to the head  |
| dequeue() | O(1) - Remove from tail |
| search()  | O(n)                    |



## BST Time Complexity

| Operation | Best Case | Average Case         | Worst Case |
| --------- | --------- | -------------------- | ---------- |
| Search    | O(1)      | O(h) &#8594;O(log n) | O(n)       |
| Insert    | O(1)      | O(h) &#8594;O(log n) | O(n)       |
| Delete    | O(1)      | O(h) &#8594;O(log n) | O(n)       |

h = height of tree



## Unordered List vs Ordered List vs BST

| Operation | Unordered List | Ordered List | BST      |       |
| --------- | -------------- | ------------ | -------- | ----- |
| Search    | O(1)           | O(1)         | O(1)     | Best  |
|           | O(n)           | O(log n)     | O(n)     | Worst |
| Insert    | O(1)           | O(log n)     | O(log n) | Best  |
|           | O(1)           | O(n)         | O(n)     | Worst |
| Delete    | O(1)           | O(log n)     | O(log n) | Best  |
|           | O(n)           | O(n)         | O(n)     | Worst |

## AVL Tree 

| Operation                                                    | Worst Case     |
| ------------------------------------------------------------ | -------------- |
| Search                                                       | O(h) →O(log n) |
| Insert (Phase 1: Search + Phase 2: Rotation(s) + Rebalancing) | O(h) →O(log n) |
| Rotate                                                       | O(1)           |
| Rebalancing                                                  | O(h) →O(log n) |
| Delete (Phase 1: Search + Phase 2: Rotation(s) + Rebalancing) | O(h) →O(log n) |

h = height of tree

## Tree Sort

| Operation                     | Time Complexity |
| ----------------------------- | --------------- |
| Traversing an array of size n | O(n)            |
| Inserting (Balanced Tree)     | O(n log n)      |
| Inserting (Skewed Tree)       | O(n)            |
| In-order Traversal            | O(n)            |

| Operation  | Best Case | Average Case         | Worst Case (When Tree is Skewed) |
| ---------- | --------- | -------------------- | ---------- |
| Tree Sort  | O(n log n) | O(n) * O(log n) + O(n) = O(n log n) | O(n) * O(n) + O(n) = O(n<sup>2</sup>) |



## Search in Sorted Array vs Sorted LL vs BST vs AVL vs Stack

| Sorted Array           | Sorted LL                                                    | BST              | AVL                         | Stack |         |
| ---------------------- | ------------------------------------------------------------ | ---------------- | --------------------------- | ----- | ------- |
| O(log n) Binary Search | O(n) Since you cant access internal nodes without traversing | O(log n)         | O(log n)                    | O(n)  | Average |
| O(log n) Binary Search | O(n)                                                         | O(n) due to skew | O(log n) due to rebalancing | O(n)  | Worst   |

## Heap

| Operation | Average Case | Worst Case                          |
| --------- | ------------ | ----------------------------------- |
| Insert    |              | O(log n) due to Sift Up             |
| Delete    |              | O(log n) due to Sift Down           |
| Sift Up   | O(log n)     | O(log n)                            |
| Sift Down | O(log n)     | O(1) + O(log n) = O(log n)          |
| heapSort  | O(n log n)   | n steps of extraction = O (n log n) |
| heapify   |              | O(n)                                |

## Hash Table

| Operation | Average Case | Worst Case |
| --------- | ------------ | ---------- |
| Search    | O(1)         | O(n)       |
| Insert    | O(1)         | O(n)       |
| Delete    | O(1)         | O(n)       |

## Worst Case Running Time Collision Resolution

| Technique         | Insertion                                                    | Search                                                       |
| ----------------- | ------------------------------------------------------------ | ------------------------------------------------------------ |
| Linear Probing    | O(N)                                                         | O(N)                                                         |
| Quadratic Probing | O(N)                                                         | O(N)                                                         |
| Chaining          | O(1) as new entry is inserted at the front/back of the chain at the hashed location | O(n) when all n entries are hashed to the same location and form a single chain |

N = size of the array

n = number of entries

## Graph Representations

| Representation   | Space Complexity | Add Vertex       | Add Edge | Remove Vertex    | Remove Edge | Query |
| ---------------- | ---------------- | ---------------- | -------- | ---------------- | ----------- | ----- |
| Adjacency Matrix | O(n<sup>2</sup>) | O(n<sup>2</sup>) | O(1)     | O(n<sup>2</sup>) | O(1)        | O(1)  |
| Adjacency List   | O(n + e)         | O(1)             | O(1)     | O(n + e)         | O(e)        | O(n)  |

n = number of vertices in the graph

e = number of edges in the graph

## Graph Traversal

| Traversal            | Worst Case |
| -------------------- | ---------- |
| Depth-First Search   | O(n + e)   |
| Breadth-First Search | O(n + e)   |

n = number of vertices in the graph

e = number of edges in the graph



## Dijkstra's Shortest Path Algorithm

| Case                                                         | Worst Case             |
| ------------------------------------------------------------ | ---------------------- |
| Vertices are stored in a linked list or array (simplest version) | O(n<sup>2</sup>)       |
| Graph is stored as an adjacency list (Dense Graphs)          | O(n<sup>2</sup> log n) |
| Graph is stored as an adjacency list (Sparse Graphs)*        | O(e + n log n)         |
| Graph is stored as an adjacency list (Connected Sparse Graphs)* | O(e log n)             |
| Fibonacci Optimization                                       | O(e + n log n)         |

*a self-balancing binary search tree, binary heap, pairing heap, or Fibonacci heap as a priority queue is used to implement extracting minimum efficiently.

n = number of vertices in the graph

e = number of edges in the graph



## Sorting

| Algorithm      | Best Case  | Average Case     | Worst Case       |
| -------------- | ---------- | ---------------- | ---------------- |
| Insertion Sort | O(n)       | O(n<sup>2</sup>) | O(n<sup>2</sup>) |
| Merge Sort     | O(n log n) | O(n log n)       | O(n log n)       |
| Quick Sort     | O(n log n) | O(n log n)       | O(n<sup>2</sup>) |
| Heap Sort      | O(n log n) | O(n log n)       | O(n log n)       |
| Tree Sort      | O(n log n) | O(n log n)       | O(n<sup>2</sup>) |

**Insertion sort** is a good sorting algorithm to use if the input list is already mostly sorted (More stable and requires less memory)

**Quick sort** can be optimized by using random pivot selection and has a very low memory requirement. 


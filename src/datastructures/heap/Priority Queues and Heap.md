# Priority Queues

* Priority Queues are similar to queues (FIFO), but you extract the item with the highest priority or lowest priority depending on implementation.
  * extract max: highest priority
  * extract min: lowest priority
* Priority Queues are implemented with Binary Trees

## Heap

You can have a max-heap or min-heap.

Properties of a Heap:

1. Is a **complete binary tree**, meaning each node has 2 children except the last level where the completion decreases left to right. 
2. Musty satisfy the **heap property**: 
   - In a **max heap**, for any given node C, if P is a parent node of C, then the key (the value) of P is greater than or equal to the key of C.
   - In a **min heap**, the key of P is less than or equal to the key of C.

**Level order** traversal: Go over each level and label nodes from left to right

* For a given node i:
  * Parent node index = floor of i/2
  * Left child node index = i*2
  * Right child node index = i*2+1

## Extraction

| min from a min-heap                                          | max from a max-heap                                          |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1. **Extract** min, which would be the root node of the heap | 1. **Extract** max, which would be the root node of the heap |
| 2. **Replace** the removed root with last node of the heap   | 2. **Replace** the removed root with last node of the heap   |
| 3. The new root node will generally violate the heap property, so **Sift Down** (recursively) | 3. The new root node will generally violate the heap property, so **Sift Down** (recursively) |
| 3i. Swap the node in question with the **min of its 2 children**. | 3i. Swap the node in question with the **max of its 2 children**. |
| 3ii. Repeat the comparing/swapping process until there are **no children to compare or that the heap property is satisfied**. | 3ii. Repeat the comparing/swapping process until there are **no children to compare or that the heap property is satisfied**. |

## Insertion

| Insert into min-heap                                         | Insert into a max-heap                                       |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| 1. Insert new node into heap, **left to right**, at last **open child branch**, and if all nodes have max amount of children, insert node at a **new level** | 1. Insert new node into heap, **left to right**, at last **open child branch**, and if all nodes have max amount of children, insert node at a **new level**. |
| 2. The new node may violate the heap property, so **Sift Up** (recursively) | 2. The new node may violate the heap property, so **Sift Up** (recursively) |
| 2i. Swap the node in question with its **parent node if it is smaller**. | 2i. Swap the node in question with its **parent node if it is larger**. |
| 2ii. Repeat the comparing/swapping process until the new node is the **new root of the heap or is greater that its parent node at the instance of comparison**. | 2ii. Repeat the comparing/swapping process until the new node is the **new root of the heap or is less that its parent node at the instance of comparison**. |

## Heap Sort

Heap sort is a comparison based sorting technique based on Binary Heap data structure. It is similar to selection sort where we first find the maximum element and place the maximum element at the end. We repeat the same process for remaining element. The same logic applies to finding the minimum. 

Build the Heap from an array and then delete items from the heap and the end result will be sorted.

## Heapify

* Start with the input array that contains the list of entries to be sorted
* Begin with leaf node by basically starting with right most entry in the array and work leftwards
* See if node in question can be sift down
* After sifting the array will be sorted in O(n) time
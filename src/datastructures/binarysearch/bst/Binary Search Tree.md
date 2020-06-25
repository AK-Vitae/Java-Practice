# Binary Search Tree

![img](https://miro.medium.com/max/1368/1*ziYvZzrttFYMXkkV9u66jw.png)

A BST is considered a data structure made up of **nodes**, like Linked Lists.

These nodes are either null or have references (links) to other nodes. 

These ‘other’ nodes are **child nodes**, called a **left** node and **right** node. 

Nodes have **data**, and these values determine where they are placed within the BST.

Right side of root node is right subtree, while left side of root node is left subtree

## Node Structure(Root Node has no Parent Pointer): 

|              | Parent Pointer |               |
| :----------: | :------------: | :-----------: |
| Left Pointer |      Data      | Right Pointer |

1. The left node is always **smaller** than its parent.

2. The right node is always **greater** than its parent.

3. A BST is considered **balanced** if every level of the tree is fully filled with the exception of the last level. On the last level, the tree is filled left to right.

4. A **Perfect** BST is one in which it is both full and complete (all child nodes are on the same level and each node has a left and a right child node).

5. Left and right nodes can equal null

Average Number of Comparisons for Success = (Sum of all comparisons to each success node)/(The number of success node)
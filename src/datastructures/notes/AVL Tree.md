# AVL Tree

An AVL tree is a **self-balancing** Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.

**|Height<sub>LeftSubTree</sub> - Height<sub>RightSubTree</sub> | <= 1**

Height of an empty tree is -1 (Can be 0 according to some representations)



## Balance Factors

**Balance Factor** = Height<sub>LeftSubTree</sub> - Height<sub>RightSubTree</sub> 

In an AVL tree, balance factor of every node is either -1, 0 or +1.

Balance Factors can also be represented as /, -, or \



## AVL Node Structure(Root Node has no Parent Pointer): 

|              |      | Parent Pointer |        |               |
| :----------: | :--: | :------------: | ------ | :-----------: |
| Left Pointer | Data | Balance Factor | Height | Right Pointer |

## Rotations

Rotation operations are used to make the tree balanced and there are 4 types:

1. Left Rotation (LL Rotation)

2. Right Rotation (RR Rotation)

3. Left Right Rotation (LR Rotation)

4. Right Left Rotation (RL Rotation)

   

### Left Rotation (LL Rotation)

![AVL Tree LL Rotation](http://www.btechsmartclass.com/data_structures/ds_images/LL%20Rotation.png)

### Right Rotation (RR Rotation)

![AVL Tree RR Rotation](http://www.btechsmartclass.com/data_structures/ds_images/RR%20Rotation.png)

### Left Right Rotation (LR Rotation)

![AVL Tree LR Rotation](http://www.btechsmartclass.com/data_structures/ds_images/LR%20Rotation.png)

### Right Left Rotation (RL Rotation)

![AVL Tree RL Rotation](http://www.btechsmartclass.com/data_structures/ds_images/RL%20Rotation.png)


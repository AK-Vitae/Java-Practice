# AVL Tree

An AVL tree is a self-balancing Binary Search Tree (BST) where the difference between heights of left and right subtrees cannot be more than one for all nodes.

|Height<sub>LeftSubTree</sub> - Height<sub>RightSubTree</sub> | <= 1



## AVL Node Structure(Root Node has no Parent Pointer): 

|              |      | Parent Pointer |        |               |
| :----------: | :--: | :------------: | ------ | :-----------: |
| Left Pointer | Data | Balance Factor | Height | Right Pointer |
# Overview: Binary Tree

The goal of this project is to create a binary tree that can be used to easily search for values.



## Binary Tree

The data stored in the binary tree are doubles. The binary tree will store the data only on the
leaves. The internal nodes are used for searching only. This tree will work like a normal BST, to
find a target element, your program will compare it to the root of the current subtree and if the
target is less than the value of the root you will recursively search on the left subtree, otherwise,
you will search on the right subtree. Your tree will allow duplicate values, by keeping track of the
number of times that a particular value appears (this data is kept only in the leaves).

Your binary tree is always created from scratch given a sorted array of doubles, in such a way
that the root of every subtree (not a leaf) contains the average of the maximum element in the
left subtree and the minimum element in the right subtree.



## Example

**Example Array:** 

1, 2.3, 5.8, 5.8, 7.2, 7.2, 7.2, 8, 9.1, 9.2, 10, 10.3, 10.3, 11.9, 12.1, 12.3, 12.5, 13

**Resulting Tree:**

![Huffman Tree](https://github.com/AK-Vitae/Java-Practice/blob/master/src/projects/binarytree/BinaryTreeExample.png)

The tree that is generated has a root with a value of 10.15, which is the average of the maximum
value of the left subtree (which is 10) and the minimum value of the right subtree (which is 10.3),
so the root has a value of (10+10.3)/2 = 10.15
The leaves have the actual values and the number of times each value appears.

## Project Classes 

This project includes several classes. 

Following is a high level description of each class (more information available in the respective .java file):

**Dependency Classes:**

* Node - A basic linked list generic node class
* dataNode - A node class that holds a value, count, max, and min values
* BTNode - A binary tree node that has a data value and pointers to parent, left child, and right child nodes
* DLL - A basic doubly linked list that implements Node
* Queue - A class that applies queue logic to the DLL class

**BinaryTree:** This is the main project class that has methods to construct and search through a binary tree according to described specifications.

1. makeQueue - Constructs a queue from a double array
2. join - Creates binary tree 
3. search - Recursively searches through binary tree and returns the count of the root (leaf nodes will not have a count of 0)
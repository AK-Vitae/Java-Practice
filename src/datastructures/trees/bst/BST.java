package datastructures.trees.bst;

import java.util.NoSuchElementException;

public class BST<T extends Comparable<T>> {

    private BTNode<T> myRoot;
    private int count;

    public BST() {
        myRoot = null;
        count = 0;
    }

    public BTNode<T> getRoot() {
        return myRoot;
    }

    public int getCount() {
        return count;
    }

    // Empty Tree will have height -1
    public int findHeight(BTNode<T> root) {
        if (root == null) { // Empty tree
            return -1; // Number of edges approach
        }
        int leftHeight = findHeight(root.getLeft());
        int rightHeight = findHeight(root.getRight());
        if (leftHeight > rightHeight) {
            return leftHeight + 1;
        } else {
            return rightHeight + 1;
        }
    }

    private boolean recursiveSearch(BTNode<T> root, T target) {
        if (root == null) { // Empty tree or target not found
            return false;
        } else {
            int c = target.compareTo(root.getData());
            if (c == 0) {
                return true;
            } else if (c < 0) { // go left
                return recursiveSearch(root.getLeft(), target);
            } else { // go right
                return recursiveSearch(root.getRight(), target);
            }
        }
    }

    // Handle root internally without user input of root node
    public boolean search(T target) {
        return recursiveSearch(myRoot, target);
    }

    // Search for data and if it doesn't exist you insert accordingly
    private void recursiveInsert(BTNode<T> root, T data) {
        int c = data.compareTo(root.getData());
        if (c == 0) {
            throw new IllegalArgumentException("Input data cannot be a duplicate"); // data already exists in tree (duplicate)
        } else if (c < 0) {
            BTNode<T> leftTree = root.getLeft();
            if (leftTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, root);
                root.setLeft(newNode);
            } else { // go left
                recursiveInsert(leftTree, data);
            }
        } else {
            BTNode<T> rightTree = root.getRight();
            if (rightTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, root);
                root.setRight(newNode);
            } else { // go right
                recursiveInsert(rightTree, data);
            }
        }
    }

    // Handle root internally without user input
    public void insert(T data) {
        if (this.myRoot == null) { // Creates root
            this.myRoot = new BTNode<T>(data, null, null, null);
        } else {
            recursiveInsert(this.myRoot, data);
        }
    }

    // Handling Duplicates:
    // Method 1: Change logic of search tree, where left side of node is < and right side is >=, or the inverse <= and >
    // Method 2: Use linked list logic and create a next pointer which would hold all duplicates
    // Method 3: Create a count field that would increment whenever a duplicate is inserted - Easiest Way
    private void recursiveInsertWithDuplicates(BTNode<T> root, T data) { //Used for BST that allow duplicates
        int c = data.compareTo(root.getData());
        if (c == 0) {
            root.setCount(root.getCount() + 1); // duplicate so increment count
        } else if (c < 0) {
            BTNode<T> leftTree = root.getLeft();
            if (leftTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, root);
                root.setLeft(newNode);
            } else { // go left
                recursiveInsertWithDuplicates(leftTree, data);
            }
        } else {
            BTNode<T> rightTree = root.getRight();
            if (rightTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, root);
                root.setRight(newNode);
            } else { // go right
                recursiveInsertWithDuplicates(rightTree, data);
            }
        }
    }

    public void insertWithDuplicates(T data) { //Used for BST that allow duplicates
        if (this.myRoot == null) {
            this.myRoot = new BTNode<T>(data, null, null, null);
        } else {
            recursiveInsertWithDuplicates(this.myRoot, data);
        }
    }
    //

    //Min
    public T minNode() {
        if (this.myRoot == null) {
            throw new NoSuchElementException();
        }
        BTNode<T> root = myRoot;
        T min = root.getData();
        root = root.getLeft();
        while (root != null) {
            min = root.getData();
            root = root.getLeft();
        }
        return min;

    }

    //Max
    public T maxNode() {
        if (this.myRoot == null) {
            throw new NoSuchElementException();
        }
        BTNode<T> root = myRoot;
        T min = root.getData();
        root = root.getRight();
        while (root != null) {
            min = root.getData();
            root = root.getRight();
        }
        return min;

    }

    private void getCount(BTNode<T> root, T target) { // Uses recursiveSearch Logic
        if (root == null) { // Empty tree or target not found
            throw new NoSuchElementException();
        } else {
            int c = target.compareTo(root.getData());
            if (c == 0) {
                System.out.println(root.getCount());
            } else if (c < 0) { // go left
                getCount(root.getLeft(), target);
            } else { // go right
                getCount(root.getRight(), target);
            }
        }
    }

    //In order traversal
    public void printInOrder(BTNode<T> root) {
        if (root == null) {
            return;
        }
        printInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        printInOrder(root.getRight());
    }

    public void reverseNodes(BTNode<T> root) {
        if (root == null) {
            return;
        }
        reverseNodes(root.getLeft());
        reverseNodes(root.getRight());
        BTNode<T> curr = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(curr);
    }

    // Delete
    // Case 1. Leaves: Remove pointer to parent node
    // Case 2. 1 Child: Replace parent node with child
    // Case 3. 2 Children: Replace deleted node with the smallest inorder successor node/largest inorder predecessor

    public static void main(String[] args) {
        BST<Integer> test = new BST<Integer>();
        test.insert(17);
        test.insert(10);
        test.insert(12);
        test.insert(30);
        test.printInOrder(test.getRoot());
        System.out.println();
        System.out.println(test.findHeight(test.myRoot));
        test.reverseNodes(test.getRoot());
        test.printInOrder(test.getRoot());
        System.out.println();


        BST<Integer> test2 = new BST<Integer>();
        test2.insertWithDuplicates(3);
        test2.insertWithDuplicates(23);
        test2.insertWithDuplicates(12);
        test2.insertWithDuplicates(13);
        test2.insertWithDuplicates(5);
        test2.insertWithDuplicates(12);
        test2.printInOrder(test2.getRoot());
        System.out.println();
        test2.getCount(test2.getRoot(), 12);
        System.out.println(test2.minNode());
        System.out.println(test2.maxNode());
    }
}

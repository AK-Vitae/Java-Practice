package datastructures.binarysearch.bst;

import java.util.NoSuchElementException;

public class BST<T extends Comparable<T>> {

    private BTNode<T> myRoot;
    private int count;

    public BST() {
        myRoot = null;
        count = 0;
    }

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

    private boolean recursiveSearch(BTNode<T> myRoot, T target) {
        if (myRoot == null) { // Empty tree
            return false;
        } else {
            int c = target.compareTo(myRoot.getData());
            if (c == 0) {
                return true;
            } else if (c < 0) { // go left
                return recursiveSearch(myRoot.getLeft(), target);
            } else { // go right
                return recursiveSearch(myRoot.getRight(), target);
            }
        }
    }

    // Handle root internally without user input
    public boolean search(T target) {
        return recursiveSearch(myRoot, target);
    }

    // Search for data and if it doesn't exist you insert accordingly
    private void recursiveInsert(BTNode<T> myRoot, T data) {
        int c = data.compareTo(myRoot.getData());
        if (c == 0) {
            throw new NoSuchElementException(); // data already exists in tree (duplicate)
        } else if (c < 0) {
            BTNode<T> leftTree = myRoot.getLeft();
            if (leftTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, myRoot);
                myRoot.setLeft(newNode);
            } else { // go left
                recursiveInsert(leftTree, data);
            }
        } else {
            BTNode<T> rightTree = myRoot.getRight();
            if (rightTree == null) { // element goes here
                count++;
                BTNode<T> newNode = new BTNode<T>(data, null, null, myRoot);
                myRoot.setRight(newNode);
            } else { // go right
                recursiveInsert(rightTree, data);
            }
        }
    }

    // Handle root internally without user input
    public void insert(T data) {
        if (this.myRoot == null) { // Creates root
            this.myRoot = new BTNode<T>(data, null, null, null);
        } else
            recursiveInsert(this.myRoot, data);
    }

    public void printInOrder(BTNode<T> myRoot) {
        if (myRoot == null) {
            return;
        }
        printInOrder(myRoot.getLeft());
        System.out.print(myRoot.getData() + " ");
        printInOrder(myRoot.getRight());
    }

    // 1. Leaves: Remove pointer to parent node
    // 2. 1 Child: Replace parent node with child
    // 3. 2 Children: Replace deleted node with the smallest inorder successor node

    public static void main(String[] args) {
        BST<Integer> test = new BST<Integer>();
        test.insert(17);
        test.insert(10);
        test.insert(30);
        test.printInOrder(test.myRoot);
        System.out.println();
        System.out.println(test.findHeight(test.myRoot));
    }
}

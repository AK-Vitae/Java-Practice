package datastructures.trees.bst;

public class BTNode<T extends Comparable<T>> {
    private T data;
    private BTNode<T> left, right, parent;
    private int count;

    public BTNode(T data, BTNode<T> left, BTNode<T> right, BTNode<T> parent) {
        this.data = data;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.count = 1; // Used for duplicates
    }

    public BTNode<T> getLeft() {
        return this.left;
    }

    public BTNode<T> getRight() {
        return this.right;
    }

    public BTNode<T> getParent() {
        return this.parent;
    }

    public T getData() {
        return this.data;
    }

    public int getCount() {
        return count;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    public void setParent(BTNode<T> parent) {
        this.parent = parent;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

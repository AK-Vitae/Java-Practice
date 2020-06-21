package datastructures.linkedlists.oop.recursion;

public class RecursiveNode<T> {
    private T data;
    private RecursiveNode<T> next;

    public RecursiveNode() {
        this.data = null;
        this.next = null;
    }

    public RecursiveNode(T data) {
        this.data = data;
        this.next = null;
    }

    public RecursiveNode(T data, RecursiveNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public RecursiveNode<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(RecursiveNode<T> next) {
        this.next = next;
    }

}
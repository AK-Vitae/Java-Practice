package datastructures.linkedlists.oop.circular;

public class CircularNode<T> {
    private T data;
    private CircularNode<T> next;

    public CircularNode() {
        this.data = null;
        this.next = null;
    }

    public CircularNode(T data) {
        this.data = data;
        this.next = null;
    }

    public CircularNode(T data, CircularNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public CircularNode<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(CircularNode<T> next) {
        this.next = next;
    }

}
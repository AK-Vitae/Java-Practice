package datastructures.linkedlists.oop.doubly;

public class DNode<T> {
    private T data;
    private DNode<T> next;

    public DNode(T data, DNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public DNode<T> getNext() {
        return this.next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

}
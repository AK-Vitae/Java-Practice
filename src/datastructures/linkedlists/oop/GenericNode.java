package datastructures.linkedlists.oop;

public class GenericNode<T> {
    private T data;
    private GenericNode<T> next;

    public GenericNode(T data, GenericNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

    public GenericNode<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }

}
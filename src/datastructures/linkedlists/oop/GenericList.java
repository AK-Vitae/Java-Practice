package datastructures.linkedlists.oop;

public class GenericList<T> {
    private GenericNode<T> front;
    private int count;

    public GenericList() {
        this.front = null;
        this.count = 0;
    }

    public void addFront(T data) {
        this.front = new GenericNode<T>(data, front);
        count++;
    }

    public GenericNode<T> getFront() {
        return this.front;
    }

    public int size() {
        return this.count;
    }

    public void traverse() {
        GenericNode<T> current = this.front;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void deleteFront() {
        if (this.front != null) {
            this.front = this.front.getNext();
        }
    }

    public GenericNode<T> searchNode(T target) {
        GenericNode<T> current = this.front;
        while (current != null && !current.getData().equals(target)) {
            current = current.getNext();
        }
        return current;
    }

    public boolean search(T target) {
        return searchNode(target) != null;
    }

    public boolean addAfter(T target, T data) {
        GenericNode<T> t = searchNode(target);
        if (t != null) {
            GenericNode<T> s = t.getNext();
            GenericNode<T> n = new GenericNode<T>(data, s);
            t.setNext(n);
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(T target) {
        GenericNode<T> current = this.front;
        GenericNode<T> prev = null;
        while (current != null && !current.getData().equals(target)) {
            prev = current;
            current = current.getNext();
        }
        if (current != null) {
            if (prev == null)
                deleteFront();
            else {
                prev.setNext(current.getNext());
            }
            return true;
        }
        return false;
    }


}

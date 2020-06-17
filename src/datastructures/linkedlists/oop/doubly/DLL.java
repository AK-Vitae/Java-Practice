package datastructures.linkedlists.oop.doubly;

public class DLL<T> {
    private DNode<T> front;
    private DNode<T> last;
    private int count;

    public DLL() {
        this.front = null;
        this.last = null;
        this.count = 0;
    }

    public void addFront(T data) {
        DNode<T> newDNode = new DNode<T>(data, front);
        if (this.front == null) {
            this.last = newDNode;
        }
        this.front = newDNode;
        count++;
    }

    public void addLast(T data) {
        DNode<T> newDNode = new DNode<T>(data, null);
        if (this.front == null) {
            this.front = newDNode;
        } else {
            this.last.setNext(newDNode);
        }
        this.last = newDNode;
    }

    public int size() {
        return this.count;
    }

    public void traverse() {
        DNode<T> current = this.front;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void deleteFront() {
        if (this.front != null) {
            this.front = this.front.getNext();
        }
        if (this.front == null)
            this.last = null;
    }

    public void deleteLast() {
        if (this.front != null) {
            DNode<T> current = this.front;
            DNode<T> prev = null;
            while (current != last) {
                prev = current;
                current = current.getNext();
            }
            if (prev != null) {
                prev.setNext(null);
                last = prev;
            } else {
                this.front = null;
                this.last = null;
            }
        }
    }

    public void deleteAll(T target) {
        DNode<T> current = this.front;
        DNode<T> prev = null;
        while (current != null) {
            if (current.getData().equals(target)) {
                if (prev == null) {
                    deleteFront();
                } else
                    prev.setNext(current.getNext());
            } else {
                prev = current;
            }
            current = current.getNext();
        }
        this.last = prev;
    }

    public DNode<T> searchNode(T target) {
        DNode<T> current = this.front;
        while (current != null && !current.getData().equals(target)) {
            current = current.getNext();
        }
        return current;
    }

    public boolean search(T target) {
        return searchNode(target) != null;
    }

    public boolean addAfter(T target, T data) {
        DNode<T> t = searchNode(target);
        if (t != null) {
            DNode<T> s = t.getNext();
            DNode<T> n = new DNode<T>(data, s);
            t.setNext(n);
            if (s == null)
                last = n;
            return true;
        } else {
            return false;
        }
    }

    public boolean delete(T target) {
        DNode<T> current = this.front;
        DNode<T> prev = null;
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
            if (current == last)
                last = prev;
            return true;
        }
        return false;
    }

}

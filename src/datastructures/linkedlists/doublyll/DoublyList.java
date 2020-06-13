package datastructures.linkedlists.doublyll;

import datastructures.linkedlists.oop.GenericNode;

public class DoublyList<T> {
    private DoublyNode<T> head;
    private DoublyNode<T> tail;
    private int count;

    public DoublyList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public int getCount() {
        return count;
    }

    public boolean isEmpty() {
        return getCount() == 0;
    }
}

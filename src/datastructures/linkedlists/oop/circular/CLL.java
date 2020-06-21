package datastructures.linkedlists.oop.circular;

import introduction.standard.In;

public class CLL<T> {
    private CircularNode<T> last;
    private int size;

    public CLL() {
        this.last = null;
        this.size = 0;
    }

    public CLL(CircularNode<T> last, int size) {
        this.last = last;
        this.size = size;
    }

    public void addLast(T data) {
        CircularNode<T> newNode = new CircularNode<>(data);
        if (last == null) { // Empty List
            last = newNode;
            return;
        }
        if (last.getNext() == null) { // List with one element
            last.setNext(newNode);
            newNode.setNext(last);
            last = newNode;
            return;
        }
        CircularNode<T> first = last.getNext();
        last.setNext(newNode);
        newNode.setNext(first);
        last = newNode;
        size++;
    }

    public CircularNode<T> getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void traverse() {
        if (last == null) {
            return;
        }
        CircularNode<T> first = last.getNext();
        while (first != last) {
            System.out.print(first.getData() + " ");
            first = first.getNext();
        }
        System.out.print(last.getData());
        System.out.println();
    }

    public boolean delete(T target) {
        if (last == null) { // Empty list
            return false;
        }
        CircularNode<T> first = last.getNext();
        if (first == last) { // List with one element
            if (first.getData().equals(target)) {
                last = null;
                size--;
                return true; // Target found and deleted
            } else {
                return false; // Target not found
            }
        }
        CircularNode<T> prev = last;
        do {
            if (first.getData().equals(target)) { // Target found
                prev.setNext(first.getNext());
                if (first == last) { // If first is also the last node, prev becomes new last node
                    last = prev;
                }
                size--;
                return true;
            }
            prev = first;
            first = first.getNext();
        } while (prev != last);
        return false; // Target not found
    }

    public boolean addAfter(T data, T target){
        if (last == null) { // Empty list
            return false;
        }
        CircularNode<T> current = last;
        do {
            if (current.getData().equals(target)) {
                CircularNode<T> newNode = new CircularNode<T>(data,current.getNext());
                current.setNext(newNode);
                if (current == last){ // New node becomes last
                    last = newNode;
                }
                return true;
            }
            current = current.getNext();
        } while (current!=last);
        size++;
        return false; // Target is not in list
    }

    public boolean search(T target) {
        if (last == null) { // Empty list
            return false;
        }
        CircularNode<T> first = last.getNext();
        while (first != last) {
            if (first.getData().equals(target)) {
                return true;
            }
            first = first.getNext();
        }
        return last.getData() == target;
    }

    public static void main(String[] args) {
        CLL<Integer> test = new CLL<Integer>();
        test.addLast(23);
        test.addLast(24);
        test.addLast(25);
        test.addLast(26);
        test.addLast(27);
        test.addLast(28);
        test.traverse();
        System.out.println("Last: " + test.getLast().getData());
        System.out.println("First: " + test.getLast().getNext().getData());
        System.out.println(test.search(13));
        System.out.println("Deleted: "+test.delete(28));
        test.traverse();
        test.addAfter(28, 27);
        test.traverse();
    }
}

package datastructures.stacks;

import java.util.NoSuchElementException;

// Stacks
// LIFO Principle
// Only have access to the top element
// Common methods: push(), pop(), size(), isEmpty(), clear(), peek()
public class Stack<T> {
    private StackNode<T> front;
    private int size;

    public Stack() { // Constructor
        front = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push(T item) {
        front = new StackNode<T>(item, front); // Adds to top of stack or front of list
        size++;
    }

    public T pop() throws NoSuchElementException { // Removes top element of stack
        if (front == null) {
            throw new NoSuchElementException();
        }
        T temp = front.getData();
        front = front.getNext();
        size--;
        return temp;
    }

    public T peek() throws NoSuchElementException {
        if (front == null) {
            throw new NoSuchElementException();
        }
        return front.getData();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int count() {
        Stack<T> temp = new Stack<T>(); // Create a temporary stack
        int count = 0;
        while (!this.isEmpty()) { // Pop all items from this stack into temp stack and count as you go
            temp.push(this.pop());
            count++;
        }
        while (!temp.isEmpty()) {// Pop all items from temp stack back into this stack
            this.push(temp.pop());
        }
        return count;
    }

    public void clear() { // Removes all elements from a stack
        front = null;
        size = 0;
    }

}

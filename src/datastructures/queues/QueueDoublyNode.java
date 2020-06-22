package datastructures.queues;

import datastructures.linkedlists.doublyll.DoublyNode;

//FIFO: First-In First-Out
public class QueueDoublyNode<T> {
    private DoublyNode<T> rear;
    private DoublyNode<T> front;
    private int size;

    public QueueDoublyNode() { //Constructor
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    // For visualization terms, front is on the left side with rear on the right.
    public void enqueue(T item) {
        DoublyNode<T> newNode = new DoublyNode<T>(item);
        if (this.size == 0) {
            this.front = newNode;
        } else {
            this.rear.setNext(newNode);
        }
        this.rear = newNode;
        this.size++;

    }

    public T dequeue() {
        if (this.size == 0) {
            return null;
        }
        T data = front.getData();
        front = front.getNext();
        size--;
        return data;
    }

    public void traverse() {
        DoublyNode<T> current = this.front;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDoublyNode<Integer> test = new QueueDoublyNode<Integer>();
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
        test.traverse();
        test.dequeue();
        test.traverse();
        test.dequeue();
        test.traverse();
        test.dequeue();
        test.traverse();
    }

}

package datastructures.queues.oop;

import java.util.NoSuchElementException;

public class Queue<T> {
    private final DLL<T> myList;

    public Queue() {
        myList = new DLL<T>();
    }

    public void enqueue(T element) {
        myList.addFirst(element);
    }

    public T dequeue() {
        if (myList.size() == 0) {
            throw new NoSuchElementException();
        }
        T element = myList.getLast();
        myList.deleteLast();
        return element;
    }

    public int size() {
        return myList.size();
    }

    public boolean isEmpty() {
        return myList.size() == 0;
    }

    public void traverse() {
        myList.traverse();
    }

    public static void main(String[] args) {
        Queue<String> myQueue = new Queue<String>();

        myQueue.enqueue("the");
        myQueue.enqueue("quick");
        myQueue.enqueue("brown");
        myQueue.enqueue("fox");
        myQueue.enqueue("jumps");
        myQueue.enqueue("over");

        myQueue.traverse();

        System.out.println("dequeue->" + myQueue.dequeue());

        myQueue.traverse();
        myQueue.enqueue("the");
        myQueue.enqueue("lazy");
        myQueue.traverse();

        System.out.println("dequeue->" + myQueue.dequeue());

        myQueue.traverse();

        System.out.println(myQueue.size());
    }

}
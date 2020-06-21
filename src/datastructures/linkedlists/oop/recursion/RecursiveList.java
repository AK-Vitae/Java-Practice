package datastructures.linkedlists.oop.recursion;

public class RecursiveList<T> {
    private RecursiveNode<T> front;
    private int size;

    public RecursiveList() {
        this.front = null;
        this.size = 0;
    }

    public void addFront(T data) {
        this.front = new RecursiveNode<T>(data, front);
        size++;
    }

    public RecursiveNode<T> getFront() {
        return this.front;
    }

    public int size() {
        return this.size;
    }

    //A recursive method that deletes all occurrences of an item from a list
    public RecursiveNode<T> deleteAll(RecursiveNode<T> front, T target) {
        if (front == null) {
            return null; // Empty List
        }
        if (front.getData().equals(target)) {
            return deleteAll(front.getNext(), target);
        }
        front.setNext(deleteAll(front.getNext(), target));
        return front;

    }

    //A numeric recursive method that merges two sorted linked lists into a single sorted linked list without duplicates
//    public RecursiveNode<T> merge(RecursiveNode<T> front1,RecursiveNode<T> front2){
//        if (front1==null){
//            return front2;
//        }
//        if (front2 == null){
//            return front1;
//        }
//        if (front1.getData().equals(front2.getData())){
//            front1.setNext(merge(front1.getNext(), front2.getNext()));
//            return front1;
//        }
//        if (front1.getData()<front2.getData(){
//            front1.setNext(merge(front1.getNext(), front2));
//            return front1;
//        }
//        front1.setNext(merge(front2.getNext(), front2));
//        return front2;
//    }

    public void traverse() {
        RecursiveNode<T> current = this.front;
        while (current != null) {
            System.out.print(current.getData()+" ");
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        RecursiveList<Integer> test = new RecursiveList<>();
        test.addFront(3);
        test.addFront(4);
        test.addFront(3);
        test.addFront(3);
        test.addFront(5);
        test.addFront(8);
        test.addFront(3);
        test.traverse();
        test.deleteAll(test.getFront(), 3);
        System.out.println();
        test.traverse();
    }
}

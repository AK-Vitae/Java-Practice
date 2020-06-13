package datastructures.linkedlists.integer;

public class ListInt {
    private Node head;
    private int count;

    public ListInt() {
        head = null;
        count = 0;
    }

    public void addHead(int data) {
        head  = new Node(data, head); // Right to Left
        count++;
    }

    public int size() {
        return count;
    }

    public void traverse() {
        Node current=this.head;
        while (current!=null) {
            System.out.println(current.getData());
            current=current.getNext();
        }
    }

    public void deleteFront() {
        if (this.head!=null) {
            this.head = this.head.getNext();
        }
        if (count>0) {
            count--;
        }
    }

    public Node searchNode(int target) {
        Node current=this.head;
        while(current!=null && current.getData()!=target) { // Traverse until current = null, or target is found
            current=current.getNext();
        }
        return current;
    }

    public boolean search(int target) {
        return searchNode(target) != null; // Uses searchNode method to see if target is in list
    }
}

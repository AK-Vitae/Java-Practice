package datastructures.linkedlists.oop;

public class StringNode {
    private String data;
    private StringNode next;

    public StringNode(String data,StringNode next) {
        this.data=data;
        this.next=next;
    }

    public String getData() {
        return this.data;
    }

    public StringNode getNext() {
        return this.next;
    }

    public void setNext(StringNode next) {
        this.next=next;
    }

}

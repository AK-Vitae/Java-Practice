package datastructures.linkedlists;

import introduction.standard.In;

import java.util.NoSuchElementException;

public class LLInt {
    // General Method Structure:
    // some pointer to head; ex. current = head
    // searching OR searching+link manipulation
    // return value; usually will be head as you need to keep track of the head
    // Note: == compares object/reference while .equals() compares content

    public static IntNode addInFrontHead(IntNode head, int data) {
        IntNode newNode = new IntNode(data); //Create new node
        newNode.next = head.next; //Make new Node point to next item
        head.next = newNode; // Make head point to new Node
        return head;
    }

    public static IntNode insertAfter(IntNode head, int target, int data) {
        IntNode current = head;
        while (current != null) { // Traverse until you reach a null value
            if (current.data == target) { // Traverse until you reach target
                break; // target is found and loop breaks
            }
            current = current.next; // If target is not found current will advance to next node until loop ends
        }
        if (current == null) {
            return head; // Target is not found in linked list
        }
        IntNode newNode = new IntNode(data);
        newNode.next = current.next; // new Node points to where current is pointing
        current.next = newNode; // current now points to the newly inserted node
        return head;

    }

    public static IntNode insertBefore(IntNode head, int target, int data) {
        IntNode current = head;
        IntNode previous = null;
        while (current != null && current.data != target) { // Traverse
            previous = current;
            current = current.next;
        }
        if (current == null) { // Target is not found in linked list
            return head;
        }
        IntNode newNode = new IntNode(data, current); // As current = target, the new Node needs to point to current
        if (previous == null) { // If new Node is going to be inserted as the new head
            return newNode;
        }
        previous.next = newNode; // Previous now points to the inserted node
        return head;

    }


    public static IntNode removeHead(IntNode head) {
        if (head == null) {
            throw new NoSuchElementException("Empty List");
        }
//    	IntNode temp = head;
//    	head = head.next; // Traverses head node to next node
//    	temp.next = null; // Removes pointer to original head.next
//		return head;
        return head.next;
    }

    public static IntNode remove(IntNode head, int target) {
        IntNode current = head;
        IntNode previous = null; // will hold address of the node that needs to be removed
        if (current != null && current.data == target) { // If target is first node or there is only one node
            return head.next;
        }
        while (current != null && current.data != target) { // Traverse
            previous = current;
            current = current.next;
        }
        if (current != null) {
            previous.next = current.next; // Removes link to removed node
        }
        return head;
    }

    public static IntNode removeLast(IntNode head) {
        IntNode current = head;
        IntNode previous = null;
        if (current.next == null){ // List only has one node
            return null;
        }
        while (current.next!=null){ // Traverse
            previous = current;
            current = current.next;
        }
        previous.next = null; // Removes link to last node
        return head;
    }

    public static String displayList(IntNode head) {
        StringBuilder list = new StringBuilder();
        while (head != null) {
            list.append(head.toString());
            head = head.next;
            list.append(" ");
        }
        return list.toString();
    }

    public static void main(String[] args) {
        IntNode front = new IntNode(25, null);
        System.out.println(front);
        addInFrontHead(front, 27);
        insertAfter(front, 25, 13);
        System.out.println(displayList(front));
        front = removeHead(front);
        System.out.println(displayList(front));
        insertAfter(front, 13, 37);
        System.out.println(displayList(front));
        front = remove(front, 27);
        System.out.println(displayList(front));
        removeLast(front);
        System.out.println(displayList(front));
    }

}

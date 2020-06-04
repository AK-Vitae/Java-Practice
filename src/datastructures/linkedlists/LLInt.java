package datastructures.linkedlists;

import java.util.NoSuchElementException;

public class LLInt {
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

        StringNode strFront = new StringNode("Everest", null);
        System.out.println(strFront);

    }
    // General Method Structure:
    // some pointer to head; ex. current = head
    // searching OR searching+link manipulation
    // return value; usually will be head as you need to keep track of the head

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
            return head; // data is not found in linked list
        }
        IntNode newNode = new IntNode(data);
        newNode.next = current.next; // new Node points to where current is pointing
        current.next = newNode; // current now points to the newly inserted node
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

    public static String displayList(IntNode head) {
        String list = "";
        while (head != null) {
            list += head.toString();
            head = head.next;
            list += " ";
        }
        return list;
    }

}

package datastructures.linkedlists.string;

import java.util.NoSuchElementException;

public class LLString {
    // General Method Structure:
    // some pointer to head; ex. current = head
    // searching OR searching+link manipulation
    // return value; usually will be head as you need to keep track of the head
    // Note: == compares object/reference while .equals() compares content

    public static StringNode addInFrontHead(StringNode head, String data) {
        StringNode newNode = new StringNode(data); //Create new node
        newNode.next = head.next; //Make new Node point to next item
        head.next = newNode; // Make head point to new Node
        return head;
    }

    public static StringNode insertAfter(StringNode head, String target, String data) {
        StringNode current = head;
        while (current != null) { // Traverse until you reach a null value
            if (current.data.equals(target)) { // Traverse until you reach target
                break; // target is found and loop breaks
            }
            current = current.next; // If target is not found current will advance to next node until loop ends
        }
        if (current == null) {
            return head; // Target is not found in linked list
        }
        StringNode newNode = new StringNode(data);
        newNode.next = current.next; // new Node points to where current is pointing
        current.next = newNode; // current now points to the newly inserted node
        return head;

    }

    public static StringNode insertBefore(StringNode head, String target, String data) {
        StringNode current = head;
        StringNode previous = null;
        while (current != null && !current.data.equals(target)) { // Traverse
            previous = current;
            current = current.next;
        }
        if (current == null) { // Target is not found in linked list
            return head;
        }
        StringNode newNode = new StringNode(data, current); // As current = target, the new Node needs to point to current
        if (previous == null) { // If new Node is going to be inserted as the new head
            return newNode;
        }
        previous.next = newNode; // Previous now points to the inserted node
        return head;

    }


    public static StringNode removeHead(StringNode head) {
        if (head == null) {
            throw new NoSuchElementException("Empty List");
        }
//    	IntNode temp = head;
//    	head = head.next; // Traverses head node to next node
//    	temp.next = null; // Removes pointer to original head.next
//		return head;
        return head.next;
    }

    public static StringNode remove(StringNode head, String target) {
        StringNode current = head;
        StringNode previous = null; // will hold address of the node that needs to be removed
        if (current != null && current.data.equals(target)) { // If target is first node or there is only one node
            return head.next;
        }
        while (current != null && !current.data.equals(target)) { // Traverse
            previous = current;
            current = current.next;
        }
        if (current != null) {
            previous.next = current.next; // Removes link to removed node
        }
        return head;
    }

    public static String displayList(StringNode head) {
        StringBuilder list = new StringBuilder();
        while (head != null) {
            list.append(head.toString());
            head = head.next;
            list.append(" ");
        }
        return list.toString();
    }

    public static void main(String[] args) {
        StringNode strFront = new StringNode("Everest", null);
        System.out.println(strFront);
        addInFrontHead(strFront, "K2");
        System.out.println(displayList(strFront));
        insertAfter(strFront,"K2","Kilimanjaro");
        System.out.println(displayList(strFront));
        insertBefore(strFront,"Kilimanjaro","Mt. Fuji");
        System.out.println(displayList(strFront));
        strFront = remove(strFront, "K2");
        System.out.println(displayList(strFront));
    }
}

package datastructures.linkedlists.problemset;

import datastructures.linkedlists.IntNode;
import datastructures.linkedlists.StringNode;

public class LLProblemSet {
	IntNode head;

	public static void main(String[] args) {
		// Extra Practice
		IntNode front3 = new IntNode(5, null);
		append(front3, 6);
		append(front3, 7);
		append(front3, 8);
		append(front3, 9);
		System.out.println(displayList(front3));
		front3 = prepend(front3, 10);
		front3 = prepend(front3, 1);
		front3 = prepend(front3, 2);
		System.out.println(displayList(front3));
		System.out.println(countNodes(front3));
		System.out.println();

		// Problem Set
		IntNode front = new IntNode(5, null);
		front = addBefore(front, 5, 10);
		front = addBefore(front, 5, 15);
		front = addBeforeLast(front, 30);
		System.out.println(displayList(front));
		deleteEveryOther(front);
		front = addBefore(front, 10, 5);
		front = addBeforeLast(front, 25);
		System.out.println("LL1: " + displayList(front));
		System.out.println();

		IntNode front2 = new IntNode(5, null);
		front2 = addBefore(front2, 5, 10);
		front2 = addBefore(front2, 5, 15);
		front2 = addBeforeLast(front2, 30);
		deleteEveryOther(front2);
		front2 = addBefore(front2, 10, 5);
		System.out.println("LL2: " + displayList(front2));
		System.out.println();

		System.out.println("Common Elements: " + displayList(commonElements(front, front2)));
		System.out.println();

		StringNode strFront = new StringNode("Everest", null); // Create Nodes
		StringNode second = new StringNode("K2", null);
		StringNode third = new StringNode("Kangchenjunga", null);
		StringNode fourth = new StringNode("Lhotse", null);
		strFront.next = second; // Assign Pointers Manually
		second.next = third;
		third.next = fourth;
		fourth.next = new StringNode("K2", null);
		System.out.println(numberOfOccurrences(strFront, "K2"));
		System.out.println(displayList(strFront));
		strFront = deleteAllOccurrences(strFront, "K2");
		System.out.println(displayList(strFront));
		System.out.println();

	}

	// Problem 1
	public static IntNode addBefore(IntNode head, int target, int newItem) {
		if (head == null) {
			return null; // Empty list
		}
		IntNode current = head;
		IntNode prev = null;
		while (current != null && current.data != target) {
			prev = current;
			current = current.next; // Traverse until current node is null and/or the target value
		}
		if (current == null) {
			return head; // Target is not found
		}
		IntNode newNode = new IntNode(newItem, current);
		if (prev == null) {
			return newNode; // New node is added first so it is the new front
		}
		prev.next = newNode;
		return head;
	}

	// Problem 2
	public static IntNode addBeforeLast(IntNode head, int item) {
		if (head == null) {
			return null; // Empty list
		}
		IntNode current = head;
		IntNode prev = null;
		while (current.next != null) {
			prev = current;
			current = current.next; // Traverse to find the last node in the list
		}
		IntNode newNode = new IntNode(item, current);
		if (prev == null) {
			return newNode;// New node is added first so it is the new front
		}
		prev.next = newNode;
		return head;
	}

	// Problem 3
	public static int numberOfOccurrences(StringNode head, String target) {
		int count = 0;
		StringNode current = head;
		while (current != null) {
			if (current.data.equals(target)) {
				count++;
			}
			current = current.next;
		}
		return count;
	}

	// Problem 4
	public static void deleteEveryOther(IntNode head) {
		if (head == null || head.next == null) {
			return; // Empty or a list of one
		}
		IntNode prev = head;
		IntNode current = head.next;
		while (prev != null && current != null) {
			prev.next = current.next; // Makes prev point after the other node
			current = null; // "Remove" other node
			prev = prev.next;
			if (prev != null)
				current = prev.next;
		}
	}

	// Problem 5
	public static StringNode deleteAllOccurrences(StringNode head, String target) {
		if (head == null) { // Empty list
			return null;
		}
		StringNode current = head;
		StringNode prev = null;
		while (current != null) {
			if (current.data.equals(target)) {
				if (prev == null) { // If target equals head
					head = current.next; // Shift head to the next node
				} else {
					prev.next = current.next; // "Remove" the node
				}
			} else {
				prev = current;
			}
			current = current.next;
		}
		return head;
	}

	// Problem 6
	public static IntNode commonElements(IntNode headL1, IntNode headL2) {
		IntNode head = null;
		IntNode tail = null;
		while (headL1 != null && headL2 != null) {
			if (headL1.data < headL2.data) {
				headL1 = headL1.next;
			} else if (headL1.data > headL2.data) {
				headL2 = headL2.next;
			} else {
				IntNode temp = new IntNode(headL1.data, null);
				if (tail != null) {
					tail.next = temp;
				} else {
					head = temp;
				}
				tail = temp;
				headL1 = headL1.next;
				headL2 = headL2.next;
			}

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

	public static String displayList(StringNode head) {
		String list = "";
		while (head != null) {
			list += head.toString();
			head = head.next;
			list += " ";
		}
		return list;
	}

	public static IntNode append(IntNode head, int data) {
		if (head == null) { // Empty list
			head = new IntNode(data, null);
			return head;
		}
		IntNode current = head;
		while (current.next != null) { // Traverse to find last node
			current = current.next;
		}
		current.next = new IntNode(data); // Add to the end
		return current;
	}

	public static IntNode prepend(IntNode head, int data) {
		IntNode newHead = new IntNode(data, null);
		newHead.next = head;
		head = newHead;
		return head;
	}

	public void print() {
		IntNode current = head;
		System.out.print("Full List: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}

	public static int countNodes(IntNode head) {
		IntNode current = head;
		int count = 0;
		while (current != null) {
			count++;
			current = current.next;
		}
		return count;
	}

}

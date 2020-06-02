package datastructures.linkedlists;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Movies {

	public static void main(String[] args) {
		StringNode front = null;
		System.out.println(front);

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a movie name: ");
		String movie = sc.nextLine();

		front = addToFront(front, movie);
		System.out.println("added " + front);

		System.out.print("Enter a movie name: ");
		movie = sc.nextLine();

		front = addToFront(front, movie);
		System.out.println("added " + front);
		
		StringNode current = front;
		System.out.print("Full List: ");
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
		
		try {
		front = deleteFront(front);
		System.out.println("List: " + front);

		front = deleteFront(front);
		System.out.println("List: " + front);

		front = deleteFront(front);
		System.out.println("List: " + front);
		} catch (NoSuchElementException e) {
			System.out.println("Tried to delete in an empty linked list");
		}
		
		sc.close();
	}

	public static StringNode addToFront(StringNode front, String movie) {
		return new StringNode(movie, front);
//		StringNode temp = new StringNode(movie, null);
//		temp.next = front;
//		return temp;
	}

	public static StringNode deleteFront(StringNode front) {
		if (front == null) {
			throw new NoSuchElementException();
		}
		return front.next;
	}
	

}

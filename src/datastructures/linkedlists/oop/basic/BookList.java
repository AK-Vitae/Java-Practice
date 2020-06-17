package datastructures.linkedlists.oop.basic;

public class BookList {
    public static void main(String[] args) {
        GenericList<Book> myList = new GenericList<Book>();
        // Create Generic Linked List of 4 books
        myList.addFront(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
        myList.addFront(new Book("The Glass Key", "Dashiell Hammett", 1931));
        myList.addFront(new Book("All My Sons", "Arthur Miller", 1947));
        myList.addFront(new Book("A Farewell to Arms", "Ernest Hemingway", 1929));

        // Search for a book inside the list, and print true or false. Criteria is only Name of the book.
        Book b1 = new Book("A Farewell to Arms", "Ernest Hemingway", 1929);
        Book b2 = new Book("A Farewell to Arms", "Ernest Hemingway", 2020); // Different year
        Book b3 = new Book("A Farewell to Legs", "Ernest Hemingway", 2020); // Different name
        System.out.println(myList.search(b1)); // Returns true
        System.out.println(myList.search(b2)); // Returns true as Book class equals() criteria is only name comparison
        System.out.println(myList.search(b3)); // Returns false as name is different

        // Print all the items in the list
        GenericNode<Book> current = myList.getFront();
        while (current != null) {
            System.out.println("Book Name: " + current.getData().getName() + " - Author: " + current.getData().getAuthor() + " - Publication Date: " + current.getData().getYear());
            current = current.getNext();
        }
    }
}

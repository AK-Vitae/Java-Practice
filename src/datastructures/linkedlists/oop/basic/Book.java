package datastructures.linkedlists.oop.basic;

public class Book {
    private String name;
    private String author;
    private int year;

    // Constructor
    public Book(String name, String author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    // Get Methods
    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    // Compares the name of the books and return true if they are the same.
    public boolean equals(Object o) { // Override equals()
        if (o == this) { // Returns true if objects compared are identical
            return true;
        }
        if (!(o instanceof Book)) { // Returns false if Object o is not an instance of Book
            return false;
        }
        return this.name.equals(((Book) o).name); // Casts object as book and then compares name
        // Will return true or false by using String comparison
    }

}

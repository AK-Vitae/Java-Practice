package datastructures.linkedlists.oop.doubly;

import datastructures.linkedlists.oop.basic.Book;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object o) { // Override equals()
        if (o == this) { // Returns true if objects compared are identical
            return true;
        }
        if (!(o instanceof Student)) { // Returns false if Object o is not an instance of Student
            return false;
        }
        return this.name.equals(((Student) o).name); // Casts object as book and then compares name
        // Will return true or false by using String comparison
    }

    public String toString() {
        return "Name =" + this.name + ", age=" + this.age;
    }
}
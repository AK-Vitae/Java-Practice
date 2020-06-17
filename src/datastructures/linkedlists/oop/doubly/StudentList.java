package datastructures.linkedlists.oop.doubly;

public class StudentList {
    public static <T> void main(String[] args) {
        DLL<Student> myList = new DLL<Student>();
        myList.addFront(new Student("student 1",20));
        myList.addFront(new Student("student 2",19));
        myList.addFront(new Student("student 1",22));
        myList.addFront(new Student("student 4",21));
        myList.addLast(new Student("student 1",21));

        myList.traverse();

        myList.deleteAll(new Student("student 1",0));
        System.out.println("----------------");
        myList.traverse();

        Student tmpStudent1=new Student("student 5",18);
        System.out.println(myList.search(tmpStudent1));
        Student tmpStudent2=new Student("student 4",30);
        System.out.println(myList.search(tmpStudent2));

    }
}

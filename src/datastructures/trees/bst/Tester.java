package datastructures.trees.bst;

public class Tester {
    public static void main(String[] args) {
        BST<String> myTree = new BST<>();
        myTree.insert("Bat");
        myTree.insert("Ant");
        myTree.insert("Goat");
        myTree.insert("Zebra");
        myTree.insert("Rat");
        myTree.insert("Frog");
        myTree.insert("Antelope");
        myTree.inOrderTraverse();
        System.out.println(myTree.search("Cat"));
        System.out.println(myTree.search("Rat"));
        System.out.println(myTree.search("Dog"));
        myTree.delete("Ant");
        myTree.inOrderTraverse();
        myTree.delete("Goat");
        myTree.inOrderTraverse();
        myTree.delete("Frog");
        myTree.inOrderTraverse();
    }
}

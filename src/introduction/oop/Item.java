package introduction.oop;

public class Item {
    private String name; // item name
    private int quantity; // quantity currently in stock
    public Item (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public String getName () {
        return name;
    }
    public int getQuantity () {
        return quantity;
    }
    public void increaseQuantityBy (int quantity) {
        this.quantity += quantity;
    }
    public void decreaseQuantityBy (int quantity) {
        this.quantity -= quantity;
    }
    public String toString() {
        return " (" + quantity + ") " + name;
    }
}
package introduction.oop;

import introduction.standard.StdOut;

public class Grocery {
    private Item[] stock;

    Grocery(int capacity) {
        stock = new Item[capacity];
    }

    //Part a
    public void addItemToStock(String itemName, int quantity) {
        //Check if stock capacity is full.
        Item item = new Item(itemName, quantity);
        if (stock[stock.length - 1] != null) {
            //Create temp array that is double the size of original stock
            Item[] tempStock = new Item[stock.length * 2];
            for (int i = 0; i < stock.length; i++) {
                tempStock[i] = stock[i];
            }
            //Copy the temp array values into another array that will be used as the new stock Item[]
            this.stock = new Item[tempStock.length];
            for (int i = 0; i < stock.length; i++) {
                stock[i] = tempStock[i];
            }
        }
        //Add item or increase its quantity if it already exists
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = item;
                break;
            } else if (stock[i].getName().equals(itemName)) {
                stock[i].increaseQuantityBy(quantity);
                break;
            }
        }

    }

    //Part b
    public void decreaseItemFromStock(String itemName, int quantity) {
        for (Item item : stock) {
            if (item != null) {
                if (item.getName().equals(itemName)) {
                    if (item.getQuantity() >= quantity) {
                        item.decreaseQuantityBy(quantity);
                    } else {
                        StdOut.println("Not enough items");
                    }
                }
            }
        }
    }

    //Part c
    public Item[] getItemsToRestock() {
        //Get the amount of items that need to be restocked
        int count = 0;
        for (Item item : stock) {
            if (item != null && item.getQuantity() == 0) {
                count++;
            }
        }
        //Create restock Item[] using the item amount form code above
        int index = 0;
        Item[] itemsToRestock = new Item[count];
        for (Item item : stock) {
            if (item != null && item.getQuantity() == 0) {
                itemsToRestock[index] = item;
                index++;
            }
        }
        return itemsToRestock;
    }

    //Part d
    public void printAllItems() {
        for (Item item : stock) {
            if (item != null) {
                StdOut.println(item);
            }
        }
    }

    //Test
    public static void main(String[] args) {
        Grocery c = new Grocery(5);
        c.addItemToStock("Apple", 35);
        c.addItemToStock("Orange", 20);
        c.addItemToStock("Rice 5 lb", 21);
        c.addItemToStock("Coffee 1/2 lb", 42);
        c.addItemToStock("Quinoa 1 lb", 12);
        c.printAllItems();
        StdOut.println();
        c.addItemToStock("Tomatoes", 50);
        c.addItemToStock("Coffee 1/2 lb", 30);
        c.decreaseItemFromStock("Rice 5 lb", 4);
        c.printAllItems();
        StdOut.println();
        c.decreaseItemFromStock("Orange", 20);
        c.printAllItems();
        StdOut.println();
        for (Item i : c.getItemsToRestock()) {
            StdOut.println(i);
        }
    }
}
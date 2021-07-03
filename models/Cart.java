package models;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Item> items;

    public Cart() {
        this.items = new ArrayList<Item>();
    }

    public Item getItem(int index) {
        return new Item(this.items.get(index));
    }

    public void setItem(int index, Item item) {
        this.items.add(index, new Item(item));
    }

    /**
     * Name: add
     * 
     * @param item
     * @return boolean
     *
     *         Inside the function: 1. Adds an item to the cart if it wasn't already
     *         added.
     */
    public boolean add(Item obj) {
        for (Item item : items) {
            if (item.equals(obj)) {
                return false;
            }
            this.items.add(new Item(obj));
        }
        return true;
    }

    /**
     * Name: remove
     * 
     * @param name
     *
     *             Inside the function: 1. Removes the item that matches the name
     *             passed in.
     */
    public void remove(String name) {
        for (Item item : items) {
            if (item.getName().equals(name))
                this.items.remove(item);
        }
    }

    /**
     * Name: checkout
     * 
     * @return (String)
     *
     *         Inside the function: 1. Calculates the subtotal (price before tax).
     *         2. Calculates the tax (assume tax is 13%). 3. Calculates total:
     *         subtotal + tax 4. Returns a String that resembles a receipt. See
     *         below.
     */
    public String checkout(int index) {
        double[] measures = new double[3];

        for (Item item : items) {
            measures[0] += item.getPrice();
        }
        measures[1] = measures[0] * 0.13;
        measures[2] = measures[0] + measures[1];

        return "\tRECEIPT\n\n" + "\tSubtotal: $" + measures[0] + "\n" + "\tTax: $" + measures[1] + "\n" + "\tTotal: $"
                + measures[3] + "\n";
    }

    public String toString() {
        String temp = "";

        for (Item item : items) {
            temp += item.toString() + "\n";
        }

        return temp;
    }

}

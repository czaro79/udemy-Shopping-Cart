package models;

public class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be lower then zero.");
        }
        this.name = name;
        this.price = price;
    }

    public Item(Item source) {
        this.name = source.name;
        this.price = source.price;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null/blank.");
        }
        this.name = name;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be lower then zero.");
        }
        this.price = price;
    }

    public boolean equals(Item item) {
        if (item == null || !(item instanceof Item)) {
            return false;
        }
    
        return this.getName().equals(item.getName()) && this.getPrice() == item.getPrice();
    }

    public String toString() {
        return name + ": $" + price + " ";
    }
}

package org.example.Strategy.Checkout;

public class Item {
    private String name;
    private int price;

    public Item(String name, int cost) {
        this.name = name;
        this.price = cost;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }
}

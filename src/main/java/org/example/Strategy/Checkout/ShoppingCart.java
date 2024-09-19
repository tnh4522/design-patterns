package org.example.Strategy.Checkout;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    PaymentStrategy paymentStrategy;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout() {
        int amount = calculateTotal();
        for (Item item : items) {
            System.out.println("Item: " + item.getName() 
            + ", Price: " + item.getPrice());
        }
        paymentStrategy.pay(amount);
    }
}

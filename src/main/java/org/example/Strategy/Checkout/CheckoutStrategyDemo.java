package org.example.Strategy.Checkout;

public class CheckoutStrategyDemo {
    public static void main(String[] args) {
        ShoppingCart cart= new ShoppingCart();

        cart.addItem(new Item("T-shirt", 10));
        cart.addItem(new Item("Jeans", 20));

        cart.setPaymentStrategy(new PaypalStrategy("henry@gmail.com", "henry123"));
        cart.checkout();

        cart.setPaymentStrategy(new CreditCardStrategy("Henry Tran", "47136985569"));
        cart.checkout();
    }
}

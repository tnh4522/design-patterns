package org.example.Strategy.Checkout;

public class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;

    public CreditCardStrategy(String nm, String ccNum) {
        this.name = nm;
        this.cardNumber = ccNum;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Client: " + this.name 
        + " paid " + amount + "$ using Credit Card.");
    }
}

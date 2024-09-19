package org.example.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategyA());

        context.executeStrategy();

        context.setStrategy(new ConcreteStrategyB());

        context.executeStrategy();
    }
}
